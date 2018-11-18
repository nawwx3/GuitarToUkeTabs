import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Ukulele {

    HashMap<String, ArrayList<String>> ukulele = initUke();

    /**
     * when have all playable notes, pick one closest to fret of last note played
      */

    private HashMap<String, ArrayList<String>> initUke() {
        HashMap<String, ArrayList<String>> notes = new HashMap<>();

        ArrayList<String> C4 = new ArrayList<>(Collections.singletonList("3_0"));
        notes.put("C4", C4);

        ArrayList<String> D4 = new ArrayList<>(Collections.singletonList("3_2"));
        notes.put("D4", D4);

        ArrayList<String> E4 = new ArrayList<>(Arrays.asList("2_0", "3_4"));
        notes.put("E4", E4);

        ArrayList<String> F4 = new ArrayList<>(Arrays.asList("2_1", "3_5"));
        notes.put("F4", F4);

        ArrayList<String> G4 = new ArrayList<>(Arrays.asList("2_3", "3_7", "4_0"));
        notes.put("G4", G4);

        ArrayList<String> A4 = new ArrayList<>(Arrays.asList("1_0", "2_5", "3_9", "4_2"));
        notes.put("A4", A4);

        ArrayList<String> B4 = new ArrayList<>(Arrays.asList("1_2", "2_7", "3_11", "4_4"));
        notes.put("B4", B4);

        ArrayList<String> C5 = new ArrayList<>(Arrays.asList("1_3", "2_8", "3_12", "4_5"));
        notes.put("C5", C5);

        ArrayList<String> D5 = new ArrayList<>(Arrays.asList("1_5", "2_10", "4_7"));
        notes.put("D5", D5);

        ArrayList<String> E5 = new ArrayList<>(Arrays.asList("1_7", "2_12", "4_9"));
        notes.put("E5", E5);

        ArrayList<String> F5 = new ArrayList<>(Arrays.asList("1_8", "4_10"));
        notes.put("F5", F5);

        ArrayList<String> G5 = new ArrayList<>(Arrays.asList("1_10", "4_12"));
        notes.put("G5", G5);

        ArrayList<String> A5 = new ArrayList<>(Collections.singletonList("1_12"));
        notes.put("A5", A5);

        return notes;
    }


}
