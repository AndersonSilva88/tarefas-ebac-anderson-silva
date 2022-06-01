import java.sql.SQLOutput;
import java.util.*;

public class Tarefa1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nomes separados por , ");
        String nomes = sc.next();
        String [] vetorNomes = nomes.split(",");

        Queue<String> lista = new PriorityQueue<>();

        for (int i =0; i < vetorNomes.length; i++) {
            lista.add(vetorNomes[i]);
        }

        System.out.println("***** LISTA DE NOMES ORDENADA *****");
        while (lista.size() != 0) {
            System.out.println(lista.remove());
        }

    }
}
