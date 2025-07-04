import java.util.Scanner;

public class ContaTerminal{

    public static void main (String [] args){


        double saldo = 6890;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o seu nome para darmos continuidade! ");

        String nome = sc.nextLine();

        System.out.println("Agora insira o número da sua agência");

        String agc = sc.nextLine();

        System.out.println("Agora insira o número da sua conta");

        int conta = sc.nextInt();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua Agência é " + agc + ", conta " + conta
        + ", e seu saldo disponivel é de R$: " + saldo + " e já está disponível para saque!!!");


        sc.close();


    }




}