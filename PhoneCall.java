package com.company;

public abstract class PhoneCall {
    protected String phoneNumber;
    protected double price;
    PhoneCall(String phoneNumber){
        this.price=0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getPrice() ;

    public abstract String getPhoneNumber();

    public abstract void getInformation();
}
