public class Matek {

    //legnagyobb közös osztó
    public int lnko(int x, int y) {
        for (int i = x; i > 1; i--){
            if (x%i == 0 && y%i == 0){
                return i;
            }
        }
        return 1;
    }

    //legkisebb közös többszörös
    public int lkkt(int x, int y) {
        for (int i = x; i < x*y; i++){
            if (i%x == 0 && i%y == 0){
                return i;
            }
        }
        return x*y;
    }
}
