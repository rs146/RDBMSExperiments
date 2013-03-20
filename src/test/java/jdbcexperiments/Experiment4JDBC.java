package jdbcexperiments;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Update tests. Update x number of IPAddress objects. x is the list of nos
 * specified in the Report.
 * @author rahulsingh
 */
public class Experiment4JDBC {
    Connection con;
    
    public Experiment4JDBC() {
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
            Logger.getLogger(Experiment3JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void update1() {
        try {
            Statement update = con.createStatement();
            String address = "192.168.1.152";
            String sql = "UPDATE IPAddress SET address = '" + address 
                    + " ' WHERE id = 9";
            update.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Experiment4JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void update2() {
        for (int i = 10; i < 12; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void update5() {
        for (int i = 12; i < 17; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Test
    public void update10() {
        for (int i = 12; i < 22; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void update25() {
        for (int i = 22; i < 47; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Test
    public void update50() {
        for (int i = 47; i < 97; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void update100() {
        for (int i = 97; i < 197; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void update1000() {
        for (int i = 197; i < 1197; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Test
    public void update10000() {
        for (int i = 1197; i < 11197; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    @Test
    public void update100000() {
        for (int i = 9; i < 100009; i++) {
            try {
                Statement update = con.createStatement();
                String address = "192.168.1.152";
                String sql = "UPDATE IPAddress SET address = '" + address
                        + " ' WHERE id = " + i;
                update.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Experiment4JDBC.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }   
}
