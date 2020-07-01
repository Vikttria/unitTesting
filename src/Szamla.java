public class Szamla {

    public boolean terhelheto(int hitelkeret, int kiadas) {
        if (kiadas <= hitelkeret) return true;
        return false;
    }


    public int jovairas(int egyenleg, int bejovo) {
        return egyenleg + bejovo;
    }

    public int terheles(int egyenleg, int kimeno) {
        if (terhelheto(egyenleg, kimeno)) return egyenleg-kimeno;
        return egyenleg;
    }
}
