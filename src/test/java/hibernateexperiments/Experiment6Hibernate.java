package hibernateexperiments;

import hibernatepojos.Ipassignment;
import java.util.Set;
import hibernatepojos.FandRMapping;
import hibernatepojos.Dnshosting;
import hibernatepojos.HibernateUtil;
import hibernatepojos.NameServer;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Join query tests. Relationships will be tested here.
 * @author rahulsingh
 */
public class Experiment6Hibernate {
    Session session;
    Transaction tx;
    
    public Experiment6Hibernate() {}

    @Before
    public void setUp() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
    @After
    public void tearDown() {
        session.close();
    }
    
    /**
     * Get name servers given domain name (for a zone). Print hostname
     * of name server(s).
     */
    @Test
    public void getNameServers() {
        String domainName = "bcs.com";
        String hql = "from Dnshosting dh where dh.domain = :domainName";
        Query query = session.createQuery(hql)
                .setString("domainName", domainName);
        tx.commit();
        List<Dnshosting> dnshs = query.list(); 
        List<NameServer> nameServers = new ArrayList<NameServer>();
        for (Dnshosting dnsh : dnshs){
            nameServers.add(dnsh.getNameServer());
        }
        for (NameServer ns : nameServers){
            System.out.println(ns.getHostname());
        }
    }
    
    /**
     * Get IP Address(es) for a given FandRMapping object. Print the IP
     * Address(es) to the Output Stream.
     */
    @Test
    public void getIPAddresses() {
        FandRMapping fr = (FandRMapping) session.get(FandRMapping.class, 1);
        ArrayList<String> ipAddresses = new ArrayList<String>();
        Set<Ipassignment> ipAssignments = fr.getIpAssignments();
        for (Ipassignment ipas : ipAssignments){
            ipAddresses.add(ipas.getIpAddress().getAddress());
        }
        for (String ipaddr : ipAddresses){
            System.out.println(ipaddr);
        }
        tx.commit();
    }
}
