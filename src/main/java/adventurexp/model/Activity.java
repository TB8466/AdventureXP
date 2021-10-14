package adventurexp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activityId;


    private String activityName;
    private String ageReq;
    private String heightReq;
    private String equipment;
    private String time;

    public Activity() {
    }

    public Activity(String activityName, String ageReq, String heightReq, String equipment, String time) {
        this.activityName = activityName;
        this.ageReq = ageReq;
        this.heightReq = heightReq;
        this.equipment = equipment;
        this.time = time;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getAgeReq() {
        return ageReq;
    }

    public void setAgeReq(String ageReq) {
        this.ageReq = ageReq;
    }

    public String getHeightReq() {
        return heightReq;
    }

    public void setHeightReq(String heightReq) {
        this.heightReq = heightReq;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", ageReq='" + ageReq + '\'' +
                ", heightReq='" + heightReq + '\'' +
                ", equipment='" + equipment + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
