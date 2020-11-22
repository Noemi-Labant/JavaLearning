package persoane.TreeSet;

import persoane.AgeComparator;
import persoane.NameComparator;
import persoane.Persoana;

import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {
        NameComparator nameComparator = new NameComparator();
        Set<Persoana> persons = new java.util.TreeSet<>(nameComparator);
        persons.add(new Persoana("Georgel", 25));
        persons.add(new Persoana("Alina", 22));

        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        persons.add(new Persoana("Bianca", 42));

        System.out.println("--");
        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        AgeComparator ageComparator = new AgeComparator();
        Set<Persoana> ageSortedPersons = new java.util.TreeSet<>(ageComparator);
        ageSortedPersons.addAll(persons);

        System.out.println("--");
        for (Persoana persoana: ageSortedPersons) {
            System.out.println(persoana);
        }
    }
}
