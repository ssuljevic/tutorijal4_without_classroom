package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private int brojTrenutnihECTS;
    private Predmet[] upisani = new Predmet[15];
    private int brojUpisanihPredmeta;

    public Student(String ime, String prezime, int brojIndeksa, int brojTrenutnihECTS) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.brojTrenutnihECTS = brojTrenutnihECTS;
        brojUpisanihPredmeta = 0;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void upisiPredmet(Predmet p) {
        upisani[brojUpisanihPredmeta] = p;
        brojTrenutnihECTS = brojTrenutnihECTS + p.getBrojECTS();
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setBrojTrenutnihECTS(int brojTrenutnihECTS) {
        this.brojTrenutnihECTS = brojTrenutnihECTS;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public int getBrojTrenutnihECTS() {
        return brojTrenutnihECTS;
    }
}
