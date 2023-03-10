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


        Disk ivyDisk = new Disk(1_000_000_000_000L, 291_000_000_000L, "jedna - pevný disk");

        Disk extDisk = new Disk(3_000_000_000_000L, "dvě - externí disk");
        //extDisk.setKapacita(3_000_000_000_000L);
        //extDisk.setVyuziteMisto(0L);

        ivyPc.setCpu(ivyProcesor);
        ivyPc.setRam(ivyPamet);
        ivyPc.setExterniDisk(extDisk);
        ivyPc.setPevnyDisk(ivyDisk);


        System.out.println(ivyPc.toString());

        ivyPc.zapniSe();
        ivyPc.zapniSe();

        System.out.println(ivyPc.toString());
        ivyPc.vypniSe();

        ivyPc.vypniSe();
        //ivyPc.vypniSe();


        ivyPc.zapniSe();

        ivyPc.vytvorSouborOVelikosti(333_000L);


        ivyPc.vypniSe();

        ivyPc.vytvorSouborOVelikosti(200_000L);


        ivyPc.zapniSe();

        ivyPc.vytvorSouborOVelikosti(300_000L);

        ivyPc.vymazSouboryOVelikosti(300_000L);


        ivyPc.vytvorSouborOVelikosti(2_500_000_000_000L);
        ivyPc.vymazSouboryOVelikosti(2_500_000_000_000L);
    }

}
