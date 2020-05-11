package exercises.technology;

public class SmartPhone extends Computer{
    private double dataUsed;

    public SmartPhone(int aRam, int aStorage, String aName) {
        super(aRam, aStorage, aName);
        dataUsed = 0.0;
    }

    public void updateDataUsed(double aValueInGb) {
        dataUsed += aValueInGb;
    }

    public void resetDataUsed() {
        dataUsed = 0.0;
    }

    @Override
    public String toString() {
        return "\nComputer name: " + this.getName() +"\n" +
                "GB Ram: " + this.getGbRam() + "\n" +
                "TB Storage: " + this.getTbStorage() + "\n" +
                "GB Data Used: " + dataUsed + "\n";
    }

    public double getDataUsed() {
        return dataUsed;
    }
}
