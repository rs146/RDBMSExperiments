package hibernatepojos;

import java.util.Set;

/**
 * Subclass of ResourceRecord. Not generated.
 * @author rahulsingh
 */
public class CNAME extends ResourceRecord implements java.io.Serializable {
    private String nickname;

    public CNAME() {}

    public CNAME(String resourceRecordType, Integer ttl, String hostname,
            String classOfData, String nickname, Set<DomainData> domainData) {
        super(resourceRecordType, ttl, hostname, classOfData, domainData);
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
