package jdbcexperiments;

import hibernatepojos.NameServer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Join query tests using plain JDBC.
 * @author rahulsingh
 */
public class Experiment6JDBC {
    Connection con;
    
    public Experiment6JDBC() {}
    
    @Before
    public void setUp() {
        String url = "jdbc:mysql://192.168.1.172:3306/BINDDB";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, "root", "rahul");
        } catch (Exception e) {
            System.out.println("Failed to load MySQL driver.");
        }
    }
    
    @After
    public void tearDown() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Experiment3JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void getNameServers() {
        try {
            String domainName = "bcs.com";
            String sql = "SELECT nameServer FROM DNSHosting WHERE domain = '" 
                    + domainName + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<NameServer> nameServers = new ArrayList<NameServer>();
            
            while (rs.next()){
                String sql2 = "SELECT * FROM NameServer WHERE hostname = '"
                        + rs.getString(1) + "'";
                Statement stmt2 = con.createStatement();
                ResultSet rs2 = stmt2.executeQuery(sql2);
                while (rs2.next()){
                    NameServer ns = new NameServer(rs2.getString(1), 
                            rs2.getInt(2), rs2.getString(3), rs2.getString(4));
                    nameServers.add(ns);
                }
            }
            for (NameServer nameServer : nameServers){
                System.out.println(nameServer.getHostname());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    @Test
    public void getIPAddresses() {
        try {
            List<String> ipAddresses = new ArrayList<String>();
            String sqlCheck = "SELECT EXISTS(SELECT * FROM ResourceRecord WHERE " 
                    + "ResourceRecordType = 'FRM' AND id = 1)";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlCheck);
            rs.next();
            if (rs.getInt(1) == 1){
                String sql = "SELECT * FROM IPAssignment WHERE fandRMapping = 1";
                Statement stmt1 = con.createStatement();
                ResultSet rs1 = stmt1.executeQuery(sql);
                while (rs1.next()){
                    String sql2 = "SELECT * FROM IPAddress WHERE id = "
                            + rs1.getInt(3);
                    Statement stmt2 = con.createStatement();
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    while (rs2.next()){
                        ipAddresses.add(rs2.getString(2));
                    }
                }
            }
            for (String ipAddr : ipAddresses){
                System.out.println(ipAddr);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
