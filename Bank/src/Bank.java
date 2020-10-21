import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Subject{


    private HashMap<Integer, Rekening> rekeningHashMap= new HashMap<Integer, Rekening>();
    private String naam;

    ArrayList<Observer> observers = new ArrayList<>();

    public Bank(String naam) {
        this.naam = naam;

    }


    public void voegRekeningToe(Rekening rekening){
        rekeningHashMap.put(rekening.getRekeningnummer(), rekening);
        notifyObservers(rekening);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Rekening rekening) {
        for (Observer observer: observers
             ) {
            observer.update(rekeningHashMap, rekening);
        }
    }
}
