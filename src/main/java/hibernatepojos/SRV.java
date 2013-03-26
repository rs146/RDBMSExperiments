package hibernatepojos;

import java.util.Set;

/**
 * Maps the MX and SRV BIND records. Note how I cannot produce a subclass
 * of ResourceRecord called MX and have a subclass of MX called SRV. 
 * Unfortunately, this class hierarchy, a subclass of a subclass, is not
 * allowed in Hibernate.
 * 
 * Not generated.
 *
 * @author rahulsingh
 */
public class SRV extends ResourceRecord implements java.io.Serializable {
    private Integer preference;
    private Boolean srv;
    private String name;
    private String service;
    private String protocol;
    private Integer weight;
    private Integer port;
    
    public SRV(){}
    
    public SRV(String resourceRecordType, Integer ttl, 
            String hostname, String classOfData, Set<DomainData> domainData,
            Integer preference,
            Boolean srv, String name, String service, String protocol,
            Integer weight, Integer port){
        super(resourceRecordType, ttl, hostname, classOfData, domainData);
        this.preference = preference;
        this.srv = srv;
        this.name = name;
        this.service = service;
        this.protocol = protocol;
        this.weight = weight;
        this.port = port;
    }
    
    public Integer getPreference() {
        return this.preference;
    }
    
    public void setPreference(Integer preference) {
        this.preference = preference;
    }
    public Boolean getSrv() {
        return this.srv;
    }
    
    public void setSrv(Boolean srv) {
        this.srv = srv;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getService() {
        return this.service;
    }
    
    public void setService(String service) {
        this.service = service;
    }
    public String getProtocol() {
        return this.protocol;
    }
    
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Integer getPort() {
        return this.port;
    }
    
    public void setPort(Integer port) {
        this.port = port;
    }
}
