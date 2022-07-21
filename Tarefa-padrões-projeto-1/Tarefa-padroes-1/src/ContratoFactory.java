public class ContratoFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Corola(180, "Cheio", "Azul");
        } else {
            return new Civic(150, "Meio", "Preta");
        }
    }
}
