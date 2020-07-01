package szoveg;

public class Tordeles {


    public String tordeles(String szoveg) {
        String[] szavak = szoveg.split(" ");
        int[] szoHossz = new int[szavak.length];
        for (int i = 0; i < szavak.length; i++){
            szoHossz[i] = szavak[i].length();
        }
        String tordeltSzoveg = szavak[0];
        int karakter = szoHossz[0];

        for (int i = 1; i < szavak.length; i++){
            karakter += szoHossz[i];
            if (karakter < 12){
                tordeltSzoveg += " " + szavak[i];
                karakter++;
            }else{
                tordeltSzoveg += "\n" + szavak[i];
                karakter = szoHossz[i];
            }
        }

        return tordeltSzoveg;
    }

    public String[] tordeltSzoveg(String szoveg){
        String[] sorok = szoveg.split("\n");

        return sorok;
    }
}
