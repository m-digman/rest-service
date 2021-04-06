package md.stars.restservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity(name = "stars")
@Table(name = "stars")
public class Star {

    @Id
    @Column(name = "telescope_id", nullable = false)
    private long telescopeId;

    @Column(name = "telescope_longitude", nullable = false)
    private double telescopeLongitude;

    @Column(name = "telescope_latitude", nullable = false)
    private double telescopeLatitude;

    @Column(name = "telescope_altitude", nullable = false)
    private double telescopeAltitude;

    @Column(name = "star_name", nullable = false)
    private String starName;

    @Column(name = "star_right_ascension", nullable = false)
    private float starRightAscension;

    @Column(name = "star_declination", nullable = false)
    private float starDeclination;

    @Column(name = "star_apparent_magnitude", nullable = false)
    private float starApparentMagnitude;

    @Column(name = "measurement_time", nullable = false)
    private Timestamp measurementTime;

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

    public double getTelescopeLongitude() {
        return telescopeLongitude;
    }

    public void setTelescopeLongitude(double telescopeLongitude) {
        this.telescopeLongitude = telescopeLongitude;
    }

    public double getTelescopeLatitude() {
        return telescopeLatitude;
    }

    public void setTelescopeLatitude(double telescopeLatitude) {
        this.telescopeLatitude = telescopeLatitude;
    }

    public double getTelescopeAltitude() {
        return telescopeAltitude;
    }

    public void setTelescopeAltitude(double telescopeAltitude) {
        this.telescopeAltitude = telescopeAltitude;
    }

    public float getStarRightAscension() {
        return starRightAscension;
    }

    public void setStarRightAscension(float starRightAscension) {
        this.starRightAscension = starRightAscension;
    }

    public float getStarDeclination() {
        return starDeclination;
    }

    public void setStarDeclination(float starDeclination) {
        this.starDeclination = starDeclination;
    }

    public float getStarApparentMagnitude() {
        return starApparentMagnitude;
    }

    public void setStarApparentMagnitude(float starApparentMagnitude) {
        this.starApparentMagnitude = starApparentMagnitude;
    }

    public Timestamp getMeasurementTime() {
        return measurementTime;
    }

    public void setMeasurementTime(Timestamp measurementTime) {
        this.measurementTime = measurementTime;
    }
}
