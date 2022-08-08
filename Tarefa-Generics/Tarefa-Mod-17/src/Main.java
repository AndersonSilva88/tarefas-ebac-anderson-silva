import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Veiculos> carro = new ArrayList<>();
        carro.add(new Chevrolet());
        carro.add(new Honda());
        carro.add(new Toyota());

        imprimirCarro(carro);

    }

    public static void imprimirCarro(List<? extends Veiculos> lista) {
        for (Veiculos veiculo : lista) {
            System.out.println(veiculo);
        }
    }
}
