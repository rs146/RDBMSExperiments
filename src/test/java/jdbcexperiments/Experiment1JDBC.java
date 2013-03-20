package jdbcexperiments;

import hibernatepojos.Ipaddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Insert tests.
 * @author rahulsingh
 */
public class Experiment1JDBC {
    private Connection con;

    public Experiment1JDBC() {}

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
            Logger.getLogger(Experiment1JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void insertion1() {
        try {
            Statement insert = con.createStatement();
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            String sql = "INSERT INTO IPAddress (address, version, type) VALUES"
                    + "('" + ip.getAddress() + "', "
                    + "'" + ip.getVersion() + "', "
                    + "'" + ip.getType() + "')";
            insert.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Experiment1JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void insertion2() {
        for (int i = 0; i < 2; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion5() {
        for (int i = 0; i < 5; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion10() {
        for (int i = 0; i < 10; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion25() {
        for (int i = 0; i < 25; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion50() {
        for (int i = 0; i < 50; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion100() {
        for (int i = 0; i < 100; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion1000() {
        for (int i = 0; i < 1000; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion10000() {
        for (int i = 0; i < 10000; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void insertion100000() {
        for (int i = 0; i < 100000; i++) {
            try {
                Statement insert = con.createStatement();
                Ipaddress ip = new Ipaddress();
                ip.setAddress("192.168.1.150");
                ip.setType("static");
                ip.setVersion("IPv4");
                String sql = "INSERT INTO IPAddress (address, version, type) "
                        + "VALUES"
                        + "('" + ip.getAddress() + "', "
                        + "'" + ip.getVersion() + "', "
                        + "'" + ip.getType() + "')";
                insert.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment1JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
