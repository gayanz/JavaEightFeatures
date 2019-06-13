package method.reference.contructor.reference;

import method.reference.Fruit;

public class TestConstructorReference {

    public static void main(String[] args) {

        //Referencing interfaceOne method with no arg constructor.
        InterfaceOne fruit1 = Fruit::new;
        System.out.println(fruit1.getFruit());

        //Referencing interfaceTwo method with arg constructor.
        InterfaceTwo fruit2 = Fruit::new;
        System.out.println(fruit2.getFruit("wood apple", true));
    }
}
