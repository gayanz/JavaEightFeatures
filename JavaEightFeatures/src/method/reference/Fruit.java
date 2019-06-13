package method.reference;

public class Fruit {

    private String name;
    private boolean isRiped;

    public Fruit() {
        System.out.println("Instantiated via no arg constructor");
    }

    public Fruit(String name, boolean isRiped) {
        this.name = name;
        this.isRiped = isRiped;
        System.out.println("Instantiated via arg constructor");
    }

    public String getName() {
        return name;
    }

    public boolean isRiped() {
        return isRiped;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", isRiped=" + isRiped +
                '}';
    }
}
