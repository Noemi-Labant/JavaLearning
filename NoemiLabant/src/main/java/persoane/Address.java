package persoane;

public class Address {
    private String adresa;
    private String tara;

    public Address (String adresa, String tara) {
        this.adresa = adresa;
        this.tara = tara;
    }

    public String getTara() {
        return tara;
    }

    public String getAdresa() {
        return adresa;
    }
}
