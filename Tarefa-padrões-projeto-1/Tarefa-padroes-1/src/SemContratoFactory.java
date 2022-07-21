public class SemContratoFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade) ) {
            return new Cruze(100, "meio", "prata");
        } else {
            return new Civic(90, "Cheio", "Preta");
        }
    }
}
