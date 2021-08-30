package questao3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int multiplicando, inicioIntervalo, fimIntervalo;
        int intervalo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os valores abaixo solicitados.");


        System.out.println("Informe um valor para o multiplicando: ");
        multiplicando = sc.nextInt();

        if(multiplicando < 0 || multiplicando > 1500){
            System.out.println("O multiplicando não pode ser negativo e nem maior que 1500");
        }
        else{
            System.out.println("Informe um início para o intervalo: ");
            inicioIntervalo = sc.nextInt();

            System.out.println("Informe um fim para o intervalo: ");
            fimIntervalo = sc.nextInt();

            if(inicioIntervalo < 0 || inicioIntervalo > 1500){
                if(fimIntervalo < 0 || fimIntervalo > 1500){
                    System.out.println("O fim do invervalo não pode ser número negativo e nem maior que 1500.");
                }
                System.out.println("O início do invervalo não pode ser número negativo e nem maior que 1500.");
            }
            else{
                intervalo = fimIntervalo - inicioIntervalo;
                if(intervalo > 10){
                    System.out.println("Intervalo não pode ter uma diferença maior que 10.Intervalo inválido!");
                }
                else{
                    for(int i = inicioIntervalo; i <= fimIntervalo;i++){
                        System.out.println(multiplicando + " x " + i + " = " + (multiplicando*i));
                    }
                }
            }




        }


    }
}
