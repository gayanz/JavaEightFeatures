package interfaces;

public class OldInterfaceImpl implements OldInterface {

    @Override
    public void existingMethod() {
        System.out.println("Old Method.");
    }

    public static void newStaticMethod() {
        System.out.println("Unable to override method in the interface");
    }

    /*@Override
    public void newDefaultMethod() {
        System.out.println("Overriding interface's default method.");
    }
*/
}
