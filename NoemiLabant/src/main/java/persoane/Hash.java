package persoane;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<Persoana, List<Hobby>> persoane = new HashMap<>();

        Address address1 = new Address("Carpati nr. 254", "Romania");
        Address address2 = new Address("Salcamilor nr. 3", "Germany");
        Address address3 = new Address("Caprioarei nr. 10", "Italy");

        List<Address> addresses1 = new LinkedList<>();
        addresses1.add(address1);
        addresses1.add(address2);

        List<Address> addresses2 = new LinkedList<>();
        addresses2.add(address1);
        addresses2.add(address3);

        Hobby hobby1 = new Hobby("skiing", 3, addresses1);
        Hobby hobby2 = new Hobby("golfing", 5, addresses2);

        List<Hobby> hobbies1 = new LinkedList<>();
        hobbies1.add(hobby1);
        hobbies1.add(hobby2);

        List<Hobby> hobbies2 = new LinkedList<>();
        hobbies2.add(hobby1);

        Persoana persoana1 = new Persoana("Cristiano", 34);
        Persoana persoana2 = new Persoana("Tarzan", 80);

        persoane.put(persoana1, hobbies1);
        persoane.put(persoana2, hobbies2);

        for (Map.Entry<Persoana, List<Hobby>> entry: persoane.entrySet()) {
            Persoana pers1 = entry.getKey();
            List<Hobby> hobbiesList1 = entry.getValue();
            System.out.println("Person name: " + pers1.getNume());

            for (Hobby hobby: hobbiesList1) {
                System.out.println("Hobby name: " + hobby.getHobbyName());

                for (Address address: hobby.getAddresses()) {
                    System.out.println("Address country: " + address.getTara());
                }
            }
        }
    }
}
