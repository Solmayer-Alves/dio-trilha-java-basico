import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

    /*  Versão utilizando via terminal com os parâmetros já definidos nos argumentos:

    int numero = 1021;
    String Agencia = "067-8";
    String nome = "Mario Andrade";
    Double saldo = 237.48;
    

        int numero = Integer.valueOf(args [0]);
        String agencia = args [1];
        String nome = args [2];
        String sobrenome = args [3];
        Double saldo = Double.valueOf(args [4]);

        System.out.println("Olá " + nome + " "
         + sobrenome + ", obrigado por criar um conta em nosso banco, sua agência é "
         + agencia + ", conta " 
         + numero + " e seu saldo " 
         + saldo + " já está disponível para saque.");

        */

    /*
    Versão utilizando entrada de dados pelo usuário seguido de solicitação exibida na tela 
    */

    Scanner sc = new Scanner(System.in); Locale.setDefault(Locale.US);

        System.out.println("Por favor informe o seu nome!");
            String nome = sc.nextLine();

        System.out.println("Informe agora o número de sua Agência com dígito");
            String agencia = sc.nextLine();

        System.out.println("Agora informe o número da conta");
            int numero = sc.nextInt();

        System.out.println("Informe agora o valor do seu capital inicial");
            Double saldo = sc.nextDouble();
    
        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo de R$ "
        + String.format("%.2f", saldo) + " já está disponível para saque.");

    sc.close();
       
    }
}


