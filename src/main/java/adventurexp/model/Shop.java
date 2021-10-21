package adventurexp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopID;

    private String tshirtFarve;
    private int tshirt_antal;
    private int tshirtSize;
    private String sodaSmag;
    private int soda_antal;
    private String pose_type;
    private int pose_antal;

    public Shop(){

    }

    public Shop(int shopID, String tshirtFarve, int tshirt_antal, int tshirtSize, String sodaSmag, int soda_antal, String pose_type, int pose_antal) {
        this.shopID = shopID;
        this.tshirtFarve = tshirtFarve;
        this.tshirt_antal = tshirt_antal;
        this.tshirtSize = tshirtSize;
        this.sodaSmag = sodaSmag;
        this.soda_antal = soda_antal;
        this.pose_type = pose_type;
        this.pose_antal = pose_antal;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getTshirtFarve() {
        return tshirtFarve;
    }

    public void setTshirtFarve(String tshirtFarve) {
        this.tshirtFarve = tshirtFarve;
    }

    public int getTshirt_antal() {
        return tshirt_antal;
    }

    public void setTshirt_antal(int tshirt_antal) {
        this.tshirt_antal = tshirt_antal;
    }

    public int getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(int tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public String getSodaSmag() {
        return sodaSmag;
    }

    public void setSodaSmag(String sodaSmag) {
        this.sodaSmag = sodaSmag;
    }

    public int getSoda_antal() {
        return soda_antal;
    }

    public void setSoda_antal(int soda_antal) {
        this.soda_antal = soda_antal;
    }

    public String getPose_type() {
        return pose_type;
    }

    public void setPose_type(String pose_type) {
        this.pose_type = pose_type;
    }

    public int getPose_antal() {
        return pose_antal;
    }

    public void setPose_antal(int pose_antal) {
        this.pose_antal = pose_antal;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopID=" + shopID +
                ", tshirtFarve='" + tshirtFarve + '\'' +
                ", tshirt_antal=" + tshirt_antal +
                ", tshirtSize=" + tshirtSize +
                ", sodaSmag='" + sodaSmag + '\'' +
                ", soda_antal=" + soda_antal +
                ", pose_type='" + pose_type + '\'' +
                ", pose_antal=" + pose_antal +
                '}';
    }
}
