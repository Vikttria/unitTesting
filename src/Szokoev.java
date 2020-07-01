public class Szokoev {
    public boolean szoko(int ev) {
        if (ev%4 == 0 && ev%100 != 0 || ev%400 == 0){
            return true;
        }else{
            return  false;
        }
    }
}
