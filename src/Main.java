import Entities.Altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        String nome;
        int idade;
        double altura;
        double menores = 0.0;


        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = scanner.nextInt();
        Altura[] vet = new Altura[n];

        for(int i = 0; i < vet.length; i++){
            int contagem = i + 1;
            System.out.println("Dados da "+ contagem +"ª pessoa:");
            System.out.print("Nome: ");
            nome = scanner.next();

            System.out.print("Idade:");
            idade = scanner.nextInt();

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            vet[i] = new Altura(nome, idade, altura);
        }
        double somaAltura = 0.0;
        double somaIdade = 0.0;
        for(int i = 0; i < vet.length; i++){
            somaAltura += vet[i].getAltura();
            somaIdade += vet[i].getIdade();
        }
        double mediaAltura = somaAltura / vet.length;
        menores = somaIdade - somaIdade / vet.length;

        System.out.print("Altura média: " + mediaAltura);
        System.out.println(" ");
        System.out.println("Porcetagem " +menores+ "%");



    }
}