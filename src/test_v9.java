public class test_v9 {
    public static void main(String[] args) {
        Komnata komn = new Komnata();
        divan Flat1 = new divan("2-room Flexi", 67);
        komn.addf(Flat1);
        komn.addf(new divan("4-Room", 120));
        shkaf shkaf1 = new shkaf("Storage Unit", 1267);
        komn.addf(shkaf1);
        komn.printKomnata();
        System.out.println("Количество Диван - " + komn.countFlat() + " Количество Шкаф - " + komn.countShkaf());
    }
}
