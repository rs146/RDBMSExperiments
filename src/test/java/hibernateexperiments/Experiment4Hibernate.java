package hibernateexperiments;

import hibernatepojos.HibernateUtil;
import hibernatepojos.Ipaddress;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Update x number of Ipaddress objects.
 * @author rahulsingh
 */
public class Experiment4Hibernate {
    Session session;
    Transaction tx;
    
    public Experiment4Hibernate() {
    }
    
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
    public void update1() {
        Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, 1);
        ip.setAddress("192.168.1.152");
        session.merge(ip);
        tx.commit();
    }
  
    @Test
    public void update2() {
        for (int i = 2; i < 4; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update5() {
        for (int i = 4; i < 9; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }

    @Test
    public void update10() {
        for (int i = 9; i < 19; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update25() {
        for (int i = 19; i < 44; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update50() {
        for (int i = 44; i < 94; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update100() {
        for (int i = 94; i < 194; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update1000() {
        for (int i = 194; i < 1194; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update10000() {
        for (int i = 1194; i < 11194; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.152");
            session.merge(ip);
        }
        tx.commit();
    }
    
    @Test
    public void update100000() {
        for (int i = 9; i < 100009; i++) {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, i);
            ip.setAddress("192.168.1.151");
            session.merge(ip);
        }
        tx.commit();
    }
}
