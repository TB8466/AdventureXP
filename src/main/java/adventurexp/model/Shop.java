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

    private String shopzName;
    private int shopzSize;
    private int shopszPrice;
    private String shopzflavor;

    public Shop(){

    }

    public Shop(int shopID, String shopzName, int shopzSize, int shopszPrice, String shopzflavor) {
        this.shopID = shopID;
        this.shopzName = shopzName;
        this.shopzSize = shopzSize;
        this.shopszPrice = shopszPrice;
        this.shopzflavor = shopzflavor;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getShopzName() {
        return shopzName;
    }

    public void setShopzName(String shopzName) {
        this.shopzName = shopzName;
    }

    public int getShopzSize() {
        return shopzSize;
    }

    public void setShopzSize(int shopzSize) {
        this.shopzSize = shopzSize;
    }

    public int getShopszPrice() {
        return shopszPrice;
    }

    public void setShopszPrice(int shopszPrice) {
        this.shopszPrice = shopszPrice;
    }

    public String getShopzflavor() {
        return shopzflavor;
    }

    public void setShopzflavor(String shopzflavor) {
        this.shopzflavor = shopzflavor;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopID=" + shopID +
                ", shopzName='" + shopzName + '\'' +
                ", shopzSize=" + shopzSize +
                ", shopszPrice=" + shopszPrice +
                ", shopzflavor='" + shopzflavor + '\'' +
                '}';
    }
}
