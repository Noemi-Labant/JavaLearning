package Ski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Work\\Java curs\\Ski.csv";
        CSVReader csvReader = new CSVReader();
        List<String[]> rows = csvReader.read(csvFilePath);
        //System.out.println(rows.size());

        DurationComparator durationComparator = new DurationComparator();
        List<Athlete> athletes = new ArrayList<Athlete>();
        for (int i = 0; i < rows.size(); i++) {
            String[] columnValues = rows.get(i);
            BiathlonResult biathlonResult = new BiathlonResult(columnValues[3], columnValues[4], columnValues[5], columnValues[6]);
            Athlete athlete = new Athlete(columnValues[0], columnValues[1], columnValues[2], biathlonResult);
            athletes.add(athlete);
        }
        Collections.sort(athletes, durationComparator);

        System.out.println("Final standings:");
        System.out.println("Winner: " + athletes.get(0).getName() + " time: " + athletes.get(0).getFinalBiathlonTime().toMinutes() + ":" + athletes.get(0).getFinalBiathlonTime().getSeconds() % 60);
        System.out.println("Runner-up: " + athletes.get(1).getName() + " time: " + athletes.get(1).getFinalBiathlonTime().toMinutes() + ":" + athletes.get(1).getFinalBiathlonTime().getSeconds() % 60);
        System.out.println("Third place: " + athletes.get(2).getName() + " time: " + athletes.get(2).getFinalBiathlonTime().toMinutes() + ":" + athletes.get(2).getFinalBiathlonTime().getSeconds() % 60);
    }
}
