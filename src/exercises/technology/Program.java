package exercises.technology;

public class Program {
    private static Computer computer1 = new Computer(8, 2, "LC1");
    private static Laptop computer2 = new Laptop(4, 1, "LC2");
    private static SmartPhone computer3 = new SmartPhone(4, 1, "LC3");

    public static void main(String[] args) {
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

        computer1.addRam(8);
        computer2.toggleWiFi();
        computer3.updateDataUsed(2.0);

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }

}
