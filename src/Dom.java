public class Dom {
    Vykurovanie vykurovanie;
    Osvetlenie osvetlenie;

    public Dom(){
        this.vykurovanie = vykurovanie;
        this.osvetlenie = osvetlenie;
    }

    public void zapniSvetlo(){
        this.osvetlenie.zapni();
    }

    public void vypniSvetlo(){
        this.osvetlenie.vypni();
    }

    public void zapniKurenie(){
        this.vykurovanie.zapni();
    }

    public void vypniKurenie(){
        this.vykurovanie.vypni();
    }

    public void nastavTeplotu(int teplota){
        this.vykurovanie.nastavTeplotu(teplota);
    }

}
