package jdbcexperiments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Data retrieval tests.
 * @author rahulsingh
 */
public class Experiment3JDBC {
    Connection con;
    
    public Experiment3JDBC() {}
    
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
    public void retrieve1() {
        try {
            Statement select = con.createStatement();
            String sql = "SELECT address FROM IPAddress WHERE id = 1";
            ResultSet rs = select.executeQuery(sql);
            rs.next();
            String ipAddr = rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Experiment2JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
  
    @Test
    public void retrieve2() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 3; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve5() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 6; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve10() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 11; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve25() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 26; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve50() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 51; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    
    @Test
    public void retrieve100() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 101; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve1000() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 1001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve10000() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 10001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieve100000() {
        List<String> ipAddrs = new ArrayList<String>();
        for (int i = 1; i < 100001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT address FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                rs.next();
                ipAddrs.add(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
