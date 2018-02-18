package unit1Package;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //private final static fileInput indata = new fileInput("stuff.csv");
    private final static fileInput indata = new fileInput("places.csv");
    private final static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args){
        String line;
        String[] words;
        Object wordFound;

        while ((line = indata.fileReadLine()) != null){
            words = line.split(",");
            for (String s:words) {
                wordFound = map.get(s);
                if (wordFound == null){
                    map.put(s, new Integer(1));
                } else {
                    map.put(s, (int)map.get(s) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        public static void printOut( p)  {
            System.out.println(p.getName() + "Test" + p.talk());
            outFile.fileWrite(p.getName() + "|" + p.talk());

        }

    }
}
