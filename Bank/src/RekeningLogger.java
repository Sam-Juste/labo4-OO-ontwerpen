import java.time.LocalDate;
import java.util.HashMap;

public class RekeningLogger implements Observer{

    private HashMap<Integer, Rekening> rekeningHashMap= new HashMap<Integer, Rekening>();

    @Override
    public void update(HashMap<Integer, Rekening> rekeningHashMap, Rekening rekening) {
        System.out.println("Nieuwe rekening geopend op datum " + LocalDate.now() + " met rekeningnummer " + rekening.getRekeningnummer() +" en saldo " +rekening.getSaldo());
    }
}
