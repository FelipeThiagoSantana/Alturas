import Entities.Altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        String nome;
        int idade;
        double altura;


        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = scanner.nextInt();
        Altura[] vet = new Altura[n];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Dados da "+i+"a pessoa:");
            System.out.print("Nome: ");
            nome = scanner.next();

            System.out.print("Idade:");
            idade = scanner.nextInt();

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            vet[i] = new Altura(nome, idade, altura);
        }
        double soma = 0.0;
        for(int i = 0; i < vet.length; i++){
            soma += vet[i].getAltura();
        }
        double mediaAltura = soma / vet.length;
        System.out.print("Media " + mediaAltura);


    }
}