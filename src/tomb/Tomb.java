package tomb;

public class Tomb {

    public int[] fordit(int[] tomb) {
        int[] newTomb = new int[tomb.length];

        for (int i = 0; i < tomb.length; i++){
            newTomb[i] = tomb[tomb.length-1-i];
        }

        return newTomb;
    }

    public int[] fordit2(int[] tomb) {
        int[] newTomb = new int[tomb.length];

        int k = tomb.length -1;
        for (int t: tomb) {
            newTomb[k--] = t;
        }

        return newTomb;
    }
}
