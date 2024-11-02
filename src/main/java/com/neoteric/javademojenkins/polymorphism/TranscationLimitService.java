package com.neoteric.javademojenkins.polymorphism;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TranscationLimitService {

    private Map<String, Integer> transactionCountMap = new HashMap<>();
    private final int dailyLimit = 10;

    private String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }

    public boolean isLimitReached() {
        String currentDate = getCurrentDate();
        int currentDayCount = transactionCountMap.getOrDefault(currentDate, 0);
        return currentDayCount >= dailyLimit;
    }

    public void incrementTransactionCount() {
        String currentDate = getCurrentDate();
        int currentDayCount = transactionCountMap.getOrDefault(currentDate, 0);
        transactionCountMap.put(currentDate, currentDayCount + 1);
    }
}
