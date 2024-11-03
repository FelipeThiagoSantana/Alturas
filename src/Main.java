import Entities.Altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;
        double altura;

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = scanner.nextInt();
        Altura[] vet = new Altura[n];

        // Entrada de dados
        for (int i = 0; i < vet.length; i++) {
            int contagem = i + 1;
            System.out.println("Dados da " + contagem + "ª pessoa:");
            System.out.print("Nome: ");
            nome = scanner.next();

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            vet[i] = new Altura(nome, idade, altura);
        }

        // Calcula a soma das alturas e conta as pessoas com menos de 16 anos
        double somaAltura = 0.0;
        int contagemMenores16 = 0;
        String nomeMenores = "";

        for (int i = 0; i < vet.length; i++) {
            somaAltura += vet[i].getAltura(); // Soma das alturasv

            // Conta as pessoas com menos de 16 anos
            if (vet[i].getIdade() < 16) {
                contagemMenores16++;
                nomeMenores = vet[i].getName();
            }
        }

        // Calcula a altura média
        double mediaAltura = somaAltura / vet.length;

        // Calcula o percentual de pessoas com menos de 16 anos
        double percentualMenores16 = ((double) contagemMenores16 / vet.length) * 100;

        // Exibe os resultados
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", percentualMenores16);
        System.out.println("Nome menores: " + nomeMenores);
    }
}
