package com.example.data;

public class SalesPerson {
    private int salesId;
    private String name;
    private String city;
    private float commissionRate;

    public SalesPerson() {
    }

    public SalesPerson(int salesId, String name, String city, float commissionRate) {
        this.salesId = salesId;
        this.name = name;
        this.city = city;
        this.commissionRate = commissionRate;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "salesId=" + salesId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
