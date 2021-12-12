public class Budynek {

    protected String adress;
    double metraz;
    private boolean komunalny;

    public Budynek(){
        this.adress ="";
        this.metraz = 0;
        komunalny = true;
    }

    public Budynek(String adress, double metraz){
        this.adress =adress;
        this.metraz = metraz;
        komunalny = true;

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getMetraz() {
        return metraz;
    }

    public void setMetraz(double metraz) {
        this.metraz = metraz;
    }

    protected double czynsz(){
        return metraz * 9.5;
    }

    @Override
    public String toString() {
        return "Adress: " + adress +
                ", metraz " + metraz + " m/kw" +
                ", budynek komunalny: " + (komunalny ? "tak": "nie");
    }
}

