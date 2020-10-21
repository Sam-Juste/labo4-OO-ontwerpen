import java.util.HashMap;

public class Auditor implements Observer{

    private HashMap<Integer, Rekening> rekeningHashMap= new HashMap<Integer, Rekening>();

    @Override
    public void update(HashMap<Integer, Rekening> rekeningHashMap, Rekening rekening) {


        System.out.println("Rekening: " + rekening.getRekeningnummer()+ ".\nEr zijn in totaal " + rekeningHashMap.size()  + " rekeningen geopend.");
    }
}
