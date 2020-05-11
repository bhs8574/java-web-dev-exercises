package exercises.technology;

public class Laptop extends Computer {
    private boolean wiFiOn;

    public Laptop(int aRam, int aStorage, String aName) {
        super(aRam, aStorage, aName);
        wiFiOn = false;
    }

    public void toggleWiFi() {
        wiFiOn = !wiFiOn;
    }

    public String wiFiStatus() {
        if (this.isWiFiOn()) {
            return "On";
        }
        return "Off";
    }

    @Override
    public String toString() {
        return "\nComputer name: " + this.getName() +"\n" +
                "GB Ram: " + this.getGbRam() + "\n" +
                "TB Storage: " + this.getTbStorage() + "\n" +
                "Wi-Fi Stats: " + this.wiFiStatus() + "\n";
    }

    public boolean isWiFiOn() {
        return wiFiOn;
    }
}
