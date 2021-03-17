public class Program {
    public static void main(String[] args) {
        Dom Dom1 = new Dom();
        Dom1.osvetlenie = new Osvetlenie("Ledka1");
        Dom1.vykurovanie = new Vykurovanie("Dom1");


        System.out.println(Dom1.osvetlenie.stav);
        Dom1.zapniSvetlo();
        System.out.println(Dom1.osvetlenie.stav);

        System.out.println("");

        System.out.println(Dom1.vykurovanie.stav);
        Dom1.zapniKurenie();
        System.out.println(Dom1.vykurovanie.stav);
        try {
            Dom1.nastavTeplotu(45);
        }
        catch (IllegalArgumentException chyba)
        {
            System.out.println(chyba.getMessage());
            //Dom1.nastavTeplotu(25);
        }
        finally {
            Dom1.vypniKurenie();
        }

        System.out.println(Dom1.vykurovanie.stav);



        System.out.println("");

        Dom1.vypniSvetlo();
        System.out.println(Dom1.osvetlenie.stav);

        System.out.println("");

        Dom1.vypniKurenie();
        System.out.println(Dom1.vykurovanie.stav);


/*
        System.out.println(Dom1.osvetlenie.stav);
        System.out.println(Dom1.vykurovanie.stav);
        System.out.println(Dom1.vykurovanie.teplota);*/
    }
}
