import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class AddServer {
    public static void main(String[] args) {
        try {
            // start a registry on port 1099
            LocateRegistry.createRegistry(1099);

            AddServerImpl obj = new AddServerImpl();
            Naming.rebind("AddServer", obj);
            System.out.println("AddServer is ready...");
        } catch (Exception e) {
            System.err.println("AddServer exception: " + e);
            e.printStackTrace();
        }
    }
}
