public class Main {

    public static void main(String[] args) {

        /**
         * estanciando a classe carro
         */
        Carro carro = new Carro();

        /**
         * passando argumentos para os atributos da classe carro
         */
        carro.setMarca("Chevrolet");
        carro.setModelo("Onix");
        carro.setAno(2022);
        carro.setCor("Preta");


        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getCor());

        carro.acelerar();
    }
}
