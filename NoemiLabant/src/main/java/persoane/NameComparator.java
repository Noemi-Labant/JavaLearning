package persoane;

import java.util.Comparator;

public class NameComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        return o1.getNume().compareTo(o2.getNume());
    }
}
