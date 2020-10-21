public class Rekening {
    private int rekeningnummer;
    private int saldo;

    public Rekening(int rekeningnummer){
        this.rekeningnummer = rekeningnummer;
        this.saldo = 0;
    }

    public int getRekeningnummer() {
        return rekeningnummer;
    }

    public void setRekeningnummer(int rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
