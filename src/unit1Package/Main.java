package unit2collections;

public class Main {

    // List of IO methods (input/output)
    private final static fileInput dateDiff = new fileInput ("date_diff.csv");

    public static void main(String[] args){

        // date_diff.csv file here (read data)
        while ((line = dateDiff.fileReadLine()) != null) {
            words = line.split(",");
            wordFound = map.get(words[0]);
            if (wordFound == null) {
                map.put(words[0], new locationStuff(1));
            } else {
                locationStuff locationStuff = ((locationStuff) map.get(words[0]));
                locationStuff.incrementStuff();
                map.put(words[0], locationStuff);
            }
        }

    }
}
