package com.company;

public class OutgoingPhoneCall extends PhoneCall {
    protected double callTime;

    OutgoingPhoneCall(String phonNumber, double callTime) {
        super(phonNumber);
        this.callTime = callTime;
        double price = callTime * 0.04;
        setPrice(price);
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public void display() {
        System.out.println("PhoneNumber : " + getPhoneNumber() + " , rate per minute : " + 0.04 + " time : " + callTime + " , total price : " + getPrice());
    }
}
