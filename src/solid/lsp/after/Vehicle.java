package solid.lsp.after;

public class Vehicle implements Startable {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }
}
