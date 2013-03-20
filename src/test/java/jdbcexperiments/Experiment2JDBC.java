package jdbcexperiments;

import hibernatepojos.Ipaddress;
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
 * Data retrieval experiment of x objects from the database where x is a
 * variable as specified by the numbered list in the Project Report. These 
 * contain the experiments using embedded SQL and a JDBC connection.
 * @author rahulsingh
 */
public class Experiment2JDBC {

    private Connection con;

    public Experiment2JDBC() {
    }

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
            Logger.getLogger(Experiment2JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void retrieval1() {
        try {
            Statement select = con.createStatement();
            String sql = "SELECT * FROM IPAddress WHERE id = 9";
            ResultSet rs = select.executeQuery(sql);
            // convert into Java POJO.
            Ipaddress ip = null;
            while (rs.next()) {
                ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Experiment2JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void retrieval2() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 3; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval5() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 6; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval10() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 11; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval25() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 26; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval50() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 51; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval100() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 101; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval1000() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 1001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void retrieval10000() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 10001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i;
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This is so inefficient that it caused an OutOfMemoryError
     * exception.
     */
    @Test
    public void retrieval100000() {
        List<Ipaddress> ipAddresses = new ArrayList<Ipaddress>();
        for (int i = 1; i < 100001; i++) {
            try {
                Statement select = con.createStatement();
                String sql = "SELECT * FROM IPAddress WHERE id = " + i + " LIMIT 1";
                ResultSet rs = select.executeQuery(sql);
                // convert into Java POJO.
                Ipaddress ip = null;
                while (rs.next()) {
                    ip = new Ipaddress(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4));
                }
                ipAddresses.add(ip);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment2JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
