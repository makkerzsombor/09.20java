public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("%30s %30s %30s", this.nev, this.szulDatum, this.szulHely, this.getSzuletesiEv());
    }
    public int getSzuletesiEv() {
        return Integer.parseInt(szulDatum.substring(0, 4));

    }
    public int getSzuletesiHonap(){
        return Integer.parseInt(szulDatum.split("-")[1]);
    }

    public int getSzuletesiNap(){
        return Integer.parseInt(szulDatum.split("-")[2]);
    }

}
