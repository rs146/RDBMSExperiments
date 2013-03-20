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
 * Deletion tests JDBC & MySQL.
 * @author rahulsingh
 */
public class Experiment5JDBC {
    private Connection con;
    
    public Experiment5JDBC() {}
    
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
            Logger.getLogger(Experiment5JDBC.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
   
    @Test
    public void delete1() {
        try {
            Statement delete = con.createStatement();
            String sql = "DELETE FROM IPAddress WHERE id = 430004";
            delete.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Test
    public void delete2() {
        for (int i = 430001; i > 429999; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
 
    @Test
    public void delete5() {
        for (int i = 429994; i > 429989; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Test
    public void delete10() {
        for (int i = 429979; i > 429969; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    @Test
    public void delete25() {
        for (int i = 429919; i > 429894; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    @Test
    public void delete50() {
        for (int i = 429800; i > 429750; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Test
    public void delete100() {
        for (int i = 429650; i > 429550; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    @Test
    public void delete1000() {
        for (int i = 428550; i > 427550; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Test
    public void delete10000() {
        for (int i = 417550; i > 407550; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    @Test
    public void delete100000() {
        for (int i = 100000; i > 0; i--) {
            try {
                Statement delete = con.createStatement();
                String sql = "DELETE FROM IPAddress WHERE id = " + i;
                delete.execute(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
