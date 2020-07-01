package tomb;

public class Polinom {

    public int[] tomb;
    public int[] tomb2;

    public Polinom(int[] v) {
        tomb = v;
    }

    public Polinom(int[] v, int[] v2) {
        tomb = v;
        tomb2 = v2;
    }

    public int value(int x) {
        int s = 0;

        for(int i = 0; i < tomb.length; i++){
            s += tomb[i] * Math.pow(x, tomb.length-1-i);
        }

        return s;
    }

    public int add(int x, int y) {
        return value(x) + value(y);
    }

    public int multiply(int x, int y) {
        return value(x) * value(y);
    }
}
