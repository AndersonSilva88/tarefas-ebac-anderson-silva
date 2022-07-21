public class Main {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.ligar();
        System.out.println("==========================");
        Customer cliente1 = new Customer("B", false);
        Factory factory1 = getFactory(cliente1);
        Car car1 = factory1.create(cliente1.getGradeRequest());
        car1.ligar();

    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratoFactory();
        } else {
            return new SemContratoFactory();
        }
    }
}
