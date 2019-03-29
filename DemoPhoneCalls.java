package com.company;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("25468");
        incomingPhoneCall.display();
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("4568", 5);
        outgoingPhoneCall.display();
    }


}
