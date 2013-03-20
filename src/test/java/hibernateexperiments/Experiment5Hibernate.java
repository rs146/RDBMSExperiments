package hibernateexperiments;

import hibernatepojos.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Deletion tests with Hibernate.
 * @author rahulsingh
 */
public class Experiment5Hibernate {
    Session session;
    Transaction tx;
    
    public Experiment5Hibernate() {}
    
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
    public void delete1() {
        String hql = "delete from Ipaddress where id = :id";
        session.createQuery(hql).setInteger("id", 170003).executeUpdate();
    }
   
    @Test
    public void delete2() {
        for (int i = 59997; i > 59995; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }
  
    @Test
    public void delete5() {
        for (int i = 59990; i > 59985; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }

    @Test
    public void delete10() {
        for (int i = 59985; i > 59975; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }
    
    @Test
    public void delete25() {
        for (int i = 59950; i > 59925; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }

    @Test
    public void delete50() {
        for (int i = 59875; i > 59825; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }
    
    @Test
    public void delete100() {
        for (int i = 59725; i > 59625; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }

    @Test
    public void delete1000() {
        for (int i = 58625; i > 57625; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }
      
    @Test
    public void delete10000() {
        for (int i = 69999; i > 59999; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }

    @Test
    public void delete100000() {
        for (int i = 300000; i > 200000; i--){
            String hql = "delete from Ipaddress where id = :id";
            session.createQuery(hql).setInteger("id", i).executeUpdate();
        }
    }
}
