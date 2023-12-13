import java.util.ArrayList;

public class Komnata {
    private ArrayList<Facility> facilities = new ArrayList<Facility>();

    public void addf(Facility m) {
        facilities.add(m);
    }

    public Komnata() {

    }

    public int countFlat() {
        int count = 0;
        for (Facility a : facilities) {
            if (a instanceof divan)
                count++;
        }
        return count;
    }

    public int countShkaf() {
        int count = 0;
        for (Facility a : facilities) {
            if (a instanceof shkaf)
                count++;
        }
        return count;
    }

    public Komnata(ArrayList<Facility> n) {
        facilities = n;
    }

    public void printKomnata() {
        System.out.println("В комнате: ");
        for (Facility a : facilities) {
            System.out.println("\t" + a.toString());
        }
    }
}
