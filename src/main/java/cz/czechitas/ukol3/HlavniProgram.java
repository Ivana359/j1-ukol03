package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
       // System.out.println("Program spuštěn.");


        Pocitac ivyPc;
        ivyPc = new Pocitac();
        System.out.println(ivyPc.toString());
        ivyPc.zapniSe();

        Procesor ivyProcesor = new Procesor();
        ivyProcesor.setRychlost(2_800_000_000L);
        ivyProcesor.setVyrobce("Intel");

        Pamet ivyPamet = new Pamet();
        ivyPamet.setKapacita(16_000_000_000L);

        Disk ivyDisk = new Disk();
        ivyDisk.setKapacita(1_000_000_000_000L);

        ivyPc.setCpu(ivyProcesor);
        ivyPc.setRam(ivyPamet);
        ivyPc.setPevnyDisk(ivyDisk);

        System.out.println(ivyPc.toString());

        ivyPc.zapniSe();
        ivyPc.zapniSe();

        System.out.println(ivyPc.toString());
        ivyPc.vypniSe();

        ivyPc.vypniSe();
        ivyPc.vypniSe();
    }

}
