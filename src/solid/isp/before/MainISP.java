package solid.isp.before;

public class MainISP {
    public static void main(String[] args) {
        Device printer = new Printer();
        printer.print();
        printer.scan();
    }
}
