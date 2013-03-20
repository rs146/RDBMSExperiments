package hibernateexperiments;

import hibernatepojos.HibernateUtil;
import hibernatepojos.Ipaddress;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Retrieval experiment with Hibernate. Aim is to get x number of Ipaddress 
 * objects where x is a variable that changes in accord with list set out in 
 * Report. Instead of a for-loop, Restrictions are used to obtain set number 
 * of Ipaddress objects. Because Restrictions are separate from the 
 * org.hibernate.Session object, everytime a Restriction is used, the Lines 
 * of Code (LOC) is increased by 1.
 * 
 * @author rahulsingh
 */
public class Experiment2Hibernate {
    Session session;
    Transaction tx;
    
    public Experiment2Hibernate() {
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
    public void retrieve1() {
        try {
            Ipaddress ip = (Ipaddress) session.get(Ipaddress.class, 1);
            tx.commit();
        } catch (Exception ex){
            Logger.getLogger(Experiment2Hibernate.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
 
    @Test
    public void retrieval2(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 2)).list();
        tx.commit();
    }
  
    @Test
    public void retrieval5(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 5)).list();
        tx.commit();
    }
    
    @Test
    public void retrieval10(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 10)).list();
        tx.commit();
    }

    @Test
    public void retrieval25(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 25)).list();
        tx.commit();
    }

    @Test
    public void retrieval50(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 50)).list();
        tx.commit();
    }

    @Test
    public void retrieval100(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 100)).list();
        tx.commit();
    }

    @Test
    public void retrieval1000(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 1000)).list();
        tx.commit();
    }

    @Test
    public void retrieval10000(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 10000)).list();
        tx.commit();
    }

    @Test
    public void retrieve100000(){
        List<Ipaddress> list = session.createCriteria(Ipaddress.class)
                            .add(Restrictions.ge("id", 1))
                            .add(Restrictions.le("id", 100000)).list();
        tx.commit();
    } 
}
