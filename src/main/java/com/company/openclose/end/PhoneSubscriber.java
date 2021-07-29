package com.company.openclose.end;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

    //only for demontration - open for modification
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}