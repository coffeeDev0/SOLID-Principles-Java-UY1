package solid.lsp.before;

public class ElectricBicycle extends Vehicle {

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Electric bicycles don't have engines");
    }
}
