package szoveg;

import java.util.Arrays;

public class Anagramma {

    public boolean anagramma(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = String.valueOf(chars1);

        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = String.valueOf(chars2);

        if (sorted1.equals(sorted2)) return true;
        return false;
    }
}
