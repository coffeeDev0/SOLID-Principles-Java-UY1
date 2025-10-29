package solid.lsp.after;

public class ElectricBicycle implements Startable {

    @Override
    public void startEngine() {
        System.out.println("Powering electric motor");
    }

}
