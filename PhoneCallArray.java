package com.company;

public class PhoneCallArray {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall1 = new IncomingPhoneCall("123");
        IncomingPhoneCall incomingPhoneCall2 = new IncomingPhoneCall("456");
        IncomingPhoneCall incomingPhoneCall3 = new IncomingPhoneCall("789");
        IncomingPhoneCall incomingPhoneCall4 = new IncomingPhoneCall("91011");
        IncomingPhoneCall incomingPhoneCall5 = new IncomingPhoneCall("111213");
        OutgoingPhoneCall outgoingPhoneCall1 = new OutgoingPhoneCall("123", 1);
        OutgoingPhoneCall outgoingPhoneCall2 = new OutgoingPhoneCall("23456", 2);
        OutgoingPhoneCall outgoingPhoneCall3 = new OutgoingPhoneCall("789", 3);
        OutgoingPhoneCall outgoingPhoneCall4 = new OutgoingPhoneCall("101112", 4);
        OutgoingPhoneCall outgoingPhoneCall5 = new OutgoingPhoneCall("131415", 5);
        PhoneCall[] phoneCalls = {incomingPhoneCall1, incomingPhoneCall2, incomingPhoneCall3, incomingPhoneCall4, incomingPhoneCall5, outgoingPhoneCall1, outgoingPhoneCall2, outgoingPhoneCall3, outgoingPhoneCall4, outgoingPhoneCall5};
        for (PhoneCall phoneCall : phoneCalls) {
            phoneCall.display();
        }
    }

}
