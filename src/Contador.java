import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int num1, num2;
        System.out.println(" ==== DESAFIO - CONTROLE DE FLUXO ==== ");
        System.out.println("Digite o primeiro número:");
            num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
            num2 = sc.nextInt();

        try {
            contar(num1, num2);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());

        }finally {
            sc.close();
        }
    }

    static void contar(int num1, int num2){
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }
            int contagem = num2 - num1;
                System.out.println("A quantidade de interações entre "
                        + num1 + " e " + num2 + " são "
                        + contagem + " vezes.");
            for (int i = 1; i <= contagem; i++)
                System.out.println("Imprimindo número: " + i);
    }
}