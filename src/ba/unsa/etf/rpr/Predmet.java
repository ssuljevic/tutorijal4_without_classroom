package ba.unsa.etf.rpr;

public class Predmet {
    private String nazivPredmeta;
    private int sifraPredmeta;
    private boolean obavezan;
    private Student[] upisaniStudenti = new Student[300];
    private int brojECTS;
    private int brojUpisanihStudenata;
    public Predmet(String nazivPredmeta, int sifraPredmeta, boolean obavezan, int brojECTS) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.obavezan = obavezan;
        this.brojECTS = brojECTS;
        brojUpisanihStudenata = 0;
    }

    public void upisiStudenta(Student s) {
        upisaniStudenti[brojUpisanihStudenata] = s;
        brojUpisanihStudenata = brojUpisanihStudenata + 1;
    }

    public int getBrojECTS() {
        return brojECTS;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public boolean isObavezan() {
        return obavezan;
    }

    public Student[] getUpisaniStudenti() {
        return upisaniStudenti;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    public void setUpisaniStudenti(Student[] upisaniStudenti) {
        this.upisaniStudenti = upisaniStudenti;
    }

    public void setBrojECTS(int brojECTS) {
        this.brojECTS = brojECTS;
    }
}
