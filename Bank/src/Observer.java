import java.util.HashMap;

public interface Observer {
    public void update(HashMap<Integer, Rekening> rekeningHashMap
    , Rekening rekening);
}
