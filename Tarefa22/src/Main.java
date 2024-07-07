import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Carlos", "Masculino"));


        System.out.println("Lista original de pessoas:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));


        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());


        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}