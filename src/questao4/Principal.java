package questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> funcionarios = new ArrayList<>(5);
        int starter = 0, senior = 0, junior = 0;

        System.out.println("Controle de Funcionários");

        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o nome da %d pessoa: ", (i+1));
            String nome = sc.nextLine();
            System.out.printf("Informe o cargo da %d pessoa (Starter, Junior ou Sênior): ", (i+1));
            String cargo = sc.nextLine();

            Pessoa pessoa = new Pessoa(nome, cargo);

            if(!cargo.equals("Starter") && !cargo.equals("Junior") && !cargo.equals("Sênior")){
                pessoa.setCargo("Sênior");
            }

            funcionarios.add(pessoa);
        }

        System.out.println("Total de pessoas");
        for (Pessoa pessoa: funcionarios
        ) {
            if(pessoa.getCargo().equals("Starter")){
                starter++;
            }
            if(pessoa.getCargo().equals("Junior")){
                junior++;
            }
            if(pessoa.getCargo().equals("Sênior")){
                senior++;
            }
        }
        System.out.println("Starter: " + starter);
        System.out.println("Junior: " + junior);
        System.out.println("Sênior: " + senior);

    }
}
