public class Osvetlenie extends ZakladneZariadenie implements Zariadenie{
    public Osvetlenie(){
        super();
        this.nazov = nazov;
        this.stav = stav;
    }


    @Override
    public void zapni() {
        if(!stav){
            super.zapni();
            super.stav = true;
            System.out.println("Osvetlenie zapnute ");
        }

    }

    @Override
    public void vypni() {
        if(stav){
            super.vypni();
            super.stav = false;
            System.out.println("Osvetlenie vypnute");
        }
    }
}
