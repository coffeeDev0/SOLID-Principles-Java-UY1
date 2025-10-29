package solid.lsp.after;

public class MainLSPRefactored {
    public static void main(String[] args) {
        Startable car = new Vehicle();
        car.startEngine();

        Startable eBike = new ElectricBicycle();
        eBike.startEngine();
    }
}
