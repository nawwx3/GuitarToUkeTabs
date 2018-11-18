import java.util.HashMap;

public class Guitar {

    private static final HashMap<Integer, String> lowE = initLowE();

    public Guitar() {
    }

    public HashMap<Integer, String> getLowE() {
        return lowE;
    }



    public String getLowENote(Integer key) {
        return lowE.get(key);
    }



    private static HashMap<Integer, String> initLowE()
    {
        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(0, "E5");
        myMap.put(1, "F5");
        myMap.put(2, "F#5");
        myMap.put(3, "G5");
        myMap.put(4, "G#5");
        myMap.put(5, "A5");
        myMap.put(6, "A#5");
        myMap.put(7, "B5");
        myMap.put(8, "C5");
        myMap.put(9, "C#5");
        myMap.put(9, "D5");
        return myMap;
    }


}
