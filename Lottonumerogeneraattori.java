import java.util.ArrayList;
import java.util.Collections;

public class Lottonumerogeneraattori {

    public static void main(String[] args) {
        ArrayList<Integer> numerot = new ArrayList<>();
        ArrayList<Integer> lottonumerot = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            numerot.add(i);
        }
        //System.out.println(numerot);
        Collections.shuffle(numerot);
        //System.out.println(numerot);
        for (int i = 0; i < 7; i++) {
            lottonumerot.add(numerot.get(0));
            numerot.remove(0);
        }
        System.out.println(lottonumerot);
        //System.out.println(numerot);
    }
}
