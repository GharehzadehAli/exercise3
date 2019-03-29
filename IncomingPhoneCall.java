package com.company;

public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("PhoneNumber :" + getPhoneNumber() + " , rate : " + getPrice() + " , price " + getPrice());
    }
}
