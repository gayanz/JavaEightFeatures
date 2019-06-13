package interfaces;

public interface OldInterface {

    public void existingMethod ();

    public static void newStaticMethod() {
        System.out.println("Static Method :: Interface :: No implementation class can override me!");
    }
   /* default public void newDefaultMethod () {
        System.out.println("Default Method :: Interface :: New Default Method is added.");
    }*/
}
