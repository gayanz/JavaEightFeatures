package lambda;

public class LambdaImpl {
    public static void main(String[] args) {

        /**
         * Anonymous inner class.
         */
        FuncInterface anonImpl = new FuncInterface() {
            @Override
            public void showName() {
                System.out.println("Anonymous Inner Class");
            }
        };

        /**
         * Equivalent Lambda expression
         */
        FuncInterface lambdaImpl = () -> System.out.println("Lambda Expression");

        lambdaImpl.showName();
        anonImpl.showName();
    }
}
