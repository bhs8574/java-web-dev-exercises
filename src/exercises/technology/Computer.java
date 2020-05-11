package exercises.technology;

public class Computer extends AbstractEntity{
    private int gbRam;
    private int tbStorage;
    private String name;

    public Computer(int aRam, int aStorage, String aName) {
        super();
        gbRam = aRam;
        tbStorage = aStorage;
        name = aName;
    }

    public void addRam(int gbsRam) {
        this.gbRam += gbsRam;
    }

    public void addStorage(int tbsStorage) {
        this.tbStorage += tbsStorage;
    }

    @Override
    public String toString() {
        return "\nComputer name: " + name +"\n" +
                "GB Ram: " + gbRam + "\n" +
                "TB Storage: " + tbStorage + "\n";
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getTbStorage() {
        return tbStorage;
    }

    public void setTbStorage(int tbStorage) {
        this.tbStorage = tbStorage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
