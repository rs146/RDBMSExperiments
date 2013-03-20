package hibernateexperiments;

import hibernatepojos.HibernateUtil;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This experiment will compare the time it takes to retrieve an IP Address
 * address attribute using SQL in hibernate.
 * @author rahulsingh
 */
public class Experiment3Hibernate {
    Session session;
    Transaction tx;
    
    public Experiment3Hibernate() {}
    
    @Before
    public void setUp() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
    @After
    public void tearDown() {
        session.close();
    }
  
    @Test
    public void retrieve1() {
        String sql = "SELECT address FROM IPAddress WHERE id = 1";
        SQLQuery query = session.createSQLQuery(sql);
        tx.commit();
        List<String> list = query.list();
    }
  
    @Test
    public void retrieve2() {
        for (int i = 1; i < 3; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }

    @Test
    public void retrieve5() {
        for (int i = 1; i < 6; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
    
    @Test
    public void retrieve10() {
        for (int i = 1; i < 11; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
    
    @Test
    public void retrieve25() {
        for (int i = 1; i < 26; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
   
    @Test
    public void retrieve50() {
        for (int i = 1; i < 51; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }

    @Test
    public void retrieve100() {
        for (int i = 1; i < 101; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
 
    @Test
    public void retrieve1000() {
        for (int i = 1; i < 1001; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }

    @Test
    public void retrieve10000() {
        for (int i = 1; i < 10001; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
    
    @Test
    public void retrieve100000() {
        for (int i = 1; i < 100001; i++){
            String sql = "SELECT address FROM IPAddress WHERE id = " + i;
            SQLQuery query = session.createSQLQuery(sql);
            List<String> list = query.list();
        }
        tx.commit();
    }
}
