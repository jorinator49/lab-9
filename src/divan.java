public class divan extends Facility{
    private double Area;

    divan() {
        super();
        Area = 0;
    }

    divan(String fType, double AreaValue) {
        super(fType);
        Area = AreaValue;
    }

    public void AreaSet(int AreaValue) {
        Area = AreaValue;
    }

    public double AreaValue() {
        return Area;
    }

    @Override
    public String toString() {
        return "shkaf{" +
                "Area_o=" + Area +
                "Type=" + getType() +
                '}';
    }
}
