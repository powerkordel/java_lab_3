public class Szkola extends Budynek{

    protected int pietra;

    public Szkola(String adres, double metraz) {

    }

    //public Szkola(int pietra){
      //  super();
       // this.pietra = 0;
    //}
    public Szkola(String adres, double metraz, int pietra ){
        super(adres,metraz);
        this.pietra = pietra;
    }

    public double getPietra() {
        return pietra;
    }

    public void setMetraz(int pietra) {
        this.pietra = pietra;
    }

    @Override
    protected double czynsz() {
        return super.czynsz();
    }

    @Override
    public String toString() {
        return "Szkola: " + super.toString() +
                ", pietra: " + pietra;
    }
}
