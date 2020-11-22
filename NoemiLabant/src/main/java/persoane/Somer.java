package persoane;

public class Somer extends Persoana {
    public Somer(String nume) {
        super(nume);
    }

    public Somer(String nume, int varsta){
        super(nume, varsta);
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + getNume() + '\'' +
                "varsta='" + getVarsta() + '\'' +
                '}';
    }
}
