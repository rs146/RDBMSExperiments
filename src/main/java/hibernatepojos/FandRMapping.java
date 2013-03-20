/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatepojos;

import java.util.Set;

/**
 * FandRMapping POJO. Not generated.
 *
 * @author rahulsingh
 */
public class FandRMapping extends ResourceRecord implements java.io.Serializable {

    private String type;
    private Set<Ipassignment> ipAssignments;

    public FandRMapping() {
    }

    public FandRMapping(String resourceRecordType, Integer ttl, String hostname,
            String classOfData, Set<DomainData> domainData, String type, Set<Ipassignment> ipAssignments) {
        super(resourceRecordType, ttl, hostname, classOfData, domainData);
        this.type = type;
        this.ipAssignments = ipAssignments;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the ipAssignments
     */
    public Set<Ipassignment> getIpAssignments() {
        return ipAssignments;
    }

    /**
     * @param ipAssignments the ipAssignments to set
     */
    public void setIpAssignments(Set<Ipassignment> ipAssignments) {
        this.ipAssignments = ipAssignments;
    }
}
