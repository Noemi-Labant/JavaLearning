package Ski;

import java.util.Comparator;

public class DurationComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getFinalBiathlonTime().compareTo(o2.getFinalBiathlonTime());
    }
}
