package solid.isp.before;

public class Printer implements Device {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        throw new UnsupportedOperationException("Printer cannot scan");
    }

    public void fax() {
        throw new UnsupportedOperationException("Printer cannot fax");
    }
}
