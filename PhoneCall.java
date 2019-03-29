package com.company;

public abstract class PhoneCall {
    private String phoneNumber;
    private double price;
    PhoneCall(String phoneNumber){
        this.price=0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getPrice() ;

    public abstract String getPhoneNumber();

    public abstract String getInformation();
}
