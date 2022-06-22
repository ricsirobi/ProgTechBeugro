import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
    System.out.println(RészString("kutya","20%"));
    }



    public static String RészString(String valamiNev, String szazalek) throws Exception {
        int kellKarakter;
        int nevHossza;
        String toReturn="";
        double eredmeny;
        double egySzazalek;
        if(!szazalek.contains("%")) {
            throw new Exception("Nincs százalék jel.");
        }
        int csakSzamSzazalek = -1;
        try
        {
            csakSzamSzazalek = Integer.parseInt(szazalek.replaceAll("%",""));
        }
        catch (Exception e)
        {
            throw new Exception("Nem sikerült átalakítani a megadott százalékot számmá");
        }
        if(csakSzamSzazalek == -1)
        {
            throw new Exception("Nem kaptam számot  százalékban.");
        }
        if(csakSzamSzazalek > 100)
        {
            throw new Exception("A megkapott szám nagyobb mint száz, ez nem megengedett.");
        }
        if(csakSzamSzazalek < 0)
        {
            throw new Exception("A megkapott szám kisebb mint nulla, ez nem megengedett.");
        }
        nevHossza = valamiNev.length();
        eredmeny = 0;
        egySzazalek = nevHossza / (double)100;
        eredmeny = egySzazalek * csakSzamSzazalek;
        eredmeny = Math.round(eredmeny);
        kellKarakter = (int)eredmeny;

        toReturn = valamiNev.substring(0,kellKarakter);


        System.out.println("{"+toReturn+"}");//csak, hogy ne kelljen most a demóban kiíratgatnom és szemmel látható legyen, hogy működik
        return toReturn;
    }
}
