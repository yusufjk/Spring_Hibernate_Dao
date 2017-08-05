package com.niit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TestProduct")
public class Product {
@Id
    String pName;
    int pId;
    int pQty;

    public String getpName() {

        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public int getpQty() {
        return pQty;
    }
    public void setpQty(int pQty) {
        this.pQty = pQty;
    }

}
