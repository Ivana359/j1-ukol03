package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;



    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe () {
        if (jeZapnuty) {
            System.err.println("PC je již zapnutý. Není možné jej zapnout opakovaně. ");
        } else if (cpu == null) {
            System.err.println("PC nemá procesor. Není možné jej zapnout!");
        } else if (ram == null) {
            System.err.println("PC nemá operační paměť. Není možné jej zapnout!");
        } else if (pevnyDisk == null) {
            System.err.println("PC nemá pevný disk. Není možné jej zapnout!");
        }else{
            jeZapnuty = true;
            System.out.println("PC se zapnul.");
        }
    }

    public void vypniSe(){
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("PC se vypnul.");
        }else{
            System.out.println("PC je již vypnutý.");
        }
    }
    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
    @Override
    public String toString() {
        String vypis;
        if (jeZapnuty) {
            vypis = "PC je zapnutý. ";
        } else {
            vypis = "PC je vypnutý. ";
        }

        return vypis + "Informace o PC: " +
                  cpu + ram + pevnyDisk ;}
}

