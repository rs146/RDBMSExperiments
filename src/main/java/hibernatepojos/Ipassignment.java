package hibernatepojos;
// Generated Feb 25, 2013 9:17:28 PM by Hibernate Tools 3.2.1.GA

/**
 * Ipassignment generated by hbm2java
 */
public class Ipassignment implements java.io.Serializable {
    private Integer id;
    private FandRMapping fandRmapping;
    private Ipaddress ipAddress;

    public Ipassignment() {}

    public Ipassignment(Integer id, FandRMapping fandRmapping, Ipaddress ipAddress) {
        this.id = id;
        this.fandRmapping = fandRmapping;
        this.ipAddress = ipAddress;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FandRMapping getFandRmapping() {
        return this.fandRmapping;
    }

    public void setFandRmapping(FandRMapping fandRmapping) {
        this.fandRmapping = fandRmapping;
    }

    public Ipaddress getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(Ipaddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
