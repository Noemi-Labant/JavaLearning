package Ski;

import java.time.Duration;

public class BiathlonResult {
    private Duration skiTimeResult;
    private Duration finalTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    public BiathlonResult(String skiTimeResult, String firstShootingRange,
                          String secondShootingRange, String thirdShootingRange) {
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
        CalculateSkiTimeResult(skiTimeResult);
        CalculateFinalTimeResult();
    }

    public Duration getFinalTimeResult() {
        return finalTimeResult;
    }

    private void CalculateSkiTimeResult(String skiTimeResult) {
        String[] duration = skiTimeResult.split(":");
        int minutes = Integer.parseInt(duration[0]);
        int seconds = Integer.parseInt(duration[1]) + minutes * 60;
        this.skiTimeResult = Duration.ofSeconds(seconds);
        this.finalTimeResult = Duration.ofSeconds(seconds);
    }

    private void CalculateFinalTimeResult() {
        AddMissedShotPenalties(firstShootingRange);
        AddMissedShotPenalties(secondShootingRange);
        AddMissedShotPenalties(thirdShootingRange);
    }

    private void AddMissedShotPenalties(String shootingRangeResults) {
        for (int i = 0; i < 5; i++) {
            if (shootingRangeResults.charAt(i) == 'o') {
                this.finalTimeResult = this.finalTimeResult.plusSeconds(10);
            }
        }
    }
}
