public class shkaf extends Facility{
    private double Area_o;

    shkaf() {
        super();
        Area_o = 0;
    }

    shkaf(String fType, double AreaValue) {
        super(fType);
        Area_o = AreaValue;
    }

    public void AreaSet(int AreaValue) {
        Area_o = AreaValue;
    }

    public double AreaValue() {
        return Area_o;
    }

    @Override
    public String toString() {
        return "shkaf{" +
                "Area_o=" + Area_o +
                "Type=" + getType() +
                '}';
    }
}
