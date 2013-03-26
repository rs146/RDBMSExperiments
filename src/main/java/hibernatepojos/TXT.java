package hibernatepojos;

import java.util.Set;

/**
 * Subclass of ResourceRecord. Not generated.
 * @author rahulsingh
 */
public class TXT extends ResourceRecord implements java.io.Serializable {
    private String information;

    public TXT() {}

    public TXT(String resourceRecordType, Integer ttl,
            String hostname, String classOfData, Set<DomainData> domainData,
            String information) {
        super(resourceRecordType, ttl, hostname, classOfData, domainData);
        this.information = information;
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
