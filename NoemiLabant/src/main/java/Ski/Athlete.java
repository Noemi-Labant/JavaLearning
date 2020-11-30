package Ski;

import java.time.Duration;

public class Athlete {
    private int number;
    private String name;
    private String countryCode;
    private BiathlonResult biathlonResult;

    public Athlete(String number, String name, String countryCode, BiathlonResult biathlonResult) {
        this.number = Integer.parseInt(number);
        this.name = name;
        this.countryCode = countryCode;
        this.biathlonResult = biathlonResult;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Duration getFinalBiathlonTime() {
        return biathlonResult.getFinalTimeResult();
    }
}
