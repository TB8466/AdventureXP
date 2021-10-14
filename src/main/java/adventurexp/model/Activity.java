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
    private int ageReq;
    private double heightReq;
    private String equipment;
    private double time;

    public Activity() {
    }

    public Activity(String activityName, int ageReq, double heightReq, String equipment, double time) {
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

    public int getAgeReq() {
        return ageReq;
    }

    public void setAgeReq(int ageReq) {
        this.ageReq = ageReq;
    }

    public double getHeightReq() {
        return heightReq;
    }

    public void setHeightReq(double heightReq) {
        this.heightReq = heightReq;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", ageReq=" + ageReq +
                ", heightReq=" + heightReq +
                ", equipment='" + equipment + '\'' +
                ", time=" + time +
                '}';
    }
}
