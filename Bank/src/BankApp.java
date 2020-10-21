public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank("bank1");
        Observer auditor = new Auditor();
        Observer rekeningLogger = new RekeningLogger();

        bank.addObserver(auditor);
        bank.addObserver(rekeningLogger);

        Rekening rekening1 = new Rekening(1);
        Rekening rekening2 = new Rekening(2);


        bank.voegRekeningToe(rekening1);
        bank.voegRekeningToe(rekening2);
    }
}
