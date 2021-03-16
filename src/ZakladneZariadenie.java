public abstract class ZakladneZariadenie implements Zariadenie{
    protected boolean stav = false;
    protected String nazov;

    public ZakladneZariadenie(){
        this.stav = stav;
        this.nazov = nazov;
    }

    public ZakladneZariadenie(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return nazov;
    }

    public boolean isStav() {
        return stav;
    }

    @Override
    public void zapni() {
        if(isStav()){
            this.stav = true;
            System.out.println("Zapnute zariadenie");
        }

    }

    @Override
    public void vypni() {
        if(isStav()){
            this.stav = false;
            System.out.println("Vypnute zariadenie");
        }
    }
}
