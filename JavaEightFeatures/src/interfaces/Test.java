package interfaces;

public class Test {
    public static void main(String[] args) {

        OldInterfaceImpl oldInterfaceImpl = new OldInterfaceImpl();
       // oldInterfaceImpl.existingMethod();
       // oldInterfaceImpl.newDefaultMethod();

        OldInterface.newStaticMethod();
        OldInterfaceImpl.newStaticMethod();
    }
}
