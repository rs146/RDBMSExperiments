package hibernateexperiments;

import hibernatepojos.HibernateUtil;
import hibernatepojos.Ipaddress;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Experiments with Hibernate as ORM tool. This tests the time taken to
 * insert x IPAddress objects into the MySQL database. Tests conducted in order
 * insertion1(), insertion2(), insertion5() etc. as specified in Project Report.
 * @author rahulsingh
 */
public class Experiment1Hibernate {
    Session session;
    Transaction tx;

    public Experiment1Hibernate() {}

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
    public void insertion1() {
        Ipaddress ip = new Ipaddress();
        ip.setAddress("192.168.1.150");
        ip.setType("static");
        ip.setVersion("IPv4");
        session.save(ip);
        tx.commit();
    }

    @Test
    public void insertion2() {
        for (int i = 0; i < 2; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion5() {
        for (int i = 0; i < 5; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion10() {
        for (int i = 0; i < 10; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion25() {
        for (int i = 0; i < 25; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion50() {
        for (int i = 0; i < 50; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion100() {
        for (int i = 0; i < 100; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion1000() {
        for (int i = 0; i < 1000; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }

    @Test
    public void insertion10000() {
        for (int i = 0; i < 10000; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }
  
    @Test
    public void insertion100000() {
        for (int i = 10001; i < 110000; i++) {
            Ipaddress ip = new Ipaddress();
            ip.setAddress("192.168.1.150");
            ip.setType("static");
            ip.setVersion("IPv4");
            session.save(ip);
        }
        tx.commit();
    }
}
