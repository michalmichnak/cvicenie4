public class Vykurovanie extends ZakladneZariadenie implements  Zariadenie, Termostat{
    int teplota;
    final static int MAX_TEPLOTA = 40;

    public Vykurovanie(String nazov){
       super(nazov);
       this.teplota = teplota;
       this.nazov = nazov;
       this.stav = stav;
    }

    @Override
    public void zapni() {
        if(!stav){
            super.zapni();
            super.stav = true;
            nastavTeplotu(25);
        }
    }

    @Override
    public void vypni() {
        if(stav){
            super.vypni();
            nastavTeplotu(0);
            super.stav = false;
        }
    }

    @Override
    public void nastavTeplotu(int Teplota) {
        if(Teplota < 0 || Teplota > MAX_TEPLOTA)
            throw new IllegalArgumentException("Teplota mimo rozsahu");

        if(!stav)
            super.stav = true;

        teplota = Teplota;
        System.out.println("Nastavena teplota je: " + teplota);
    }
}
