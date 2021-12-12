public class Universytet  extends Szkola {

    protected String nazwa;


    public Universytet(String adres, double metraz, int pietra, String nazwa){
        super(adres, metraz, pietra);
        this.nazwa = nazwa;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    protected double czynsz() {
        return super.czynsz();
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", nazwa: " + nazwa;
    }
}
