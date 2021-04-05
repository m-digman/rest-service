package md.stars.restservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stars")
public class Star {

    @Id
    @Column(name = "telescope_id", nullable = false)
    private long telescopeId;

    @Column(name = "star_name", nullable = false)
    private String starName;

    /**
     * Our getters and setters for the attributes above
     */
    public long getTelescopeId() {
        return telescopeId;
    }

    public void setTelescopeId(long value) {
        this.telescopeId = value;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String value) {
        this.starName = value;
    }
}
