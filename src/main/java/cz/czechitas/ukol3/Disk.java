package cz.czechitas.ukol3;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;



    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
    // udělat metodu obsad místo a do parametrů dát bajty - vezmu využité místo, přičtu k tomu kolik potřebuju přiřadit

    @Override
    public String toString() {
        return "Pevný disk má kapacitu: "+ kapacita + " bajtů, využité místo: "+ vyuziteMisto + " bajtů.";
    }
}
