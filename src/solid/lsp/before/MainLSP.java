package solid.lsp.before;

public class MainLSP {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.startEngine();

        Vehicle eBike = new ElectricBicycle();
        eBike.startEngine();
    }
}
