package com.example.uke47oppgaver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private final Integer[] tempArray = new Integer[]{-3, -2, 2, 7, 12, 16, 18, 17, 12, 7, 3, -2};

    @GetMapping("/getAverageTemperature")
    public Integer getAverageTemperature(@RequestParam String month) {
        int monthIndex = getMonthIndex(month);
        return tempArray[monthIndex];
    }

    private int getMonthIndex(String month) {
        switch (month.toLowerCase()) {
            case "january":
                return 0;
            case "february":
                return 1;
            case "march":
                return 2;
            case "april":
                return 3;
            case "may":
                return 4;
            case "june":
                return 5;
            case "july":
                return 6;
            case "august":
                return 7;
            case "september":
                return 8;
            case "october":
                return 9;
            case "november":
                return 10;
            case "december":
                return 11;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}
