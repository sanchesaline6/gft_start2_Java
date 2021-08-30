package questao2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para ser verificado: ");
        int numero = sc.nextInt();

        if(numero % 3 == 0){
            if(numero % 7 == 0){
                if(numero % 6 == 0){
                    System.out.println("Divisível por 3,6,7");
                }
                else{
                    System.out.println("Divisível por 3,7");
                }
            }
            else{
                System.out.println("Divisível por 3");
            }
        }
        else{
            System.out.println("Número não divisível por 3,6 ou 7");
        }

    }
}
