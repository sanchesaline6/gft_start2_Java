package questao1;

public class Principal {

    public static void main(String[] args) {
        Gato daphne = new Gato("Dapnhe", 20.0);
        Gato artemis = new Gato("Artemis", 3.0);
        Cachorro xereta = new Cachorro("Xereta", 10.0);
        Gato victor = new Gato("Victor Hugo", 5.0);

        double totalRacao = daphne.quantidadeDeRacao() + artemis.quantidadeDeRacao() + xereta.quantidadeDeRacao() + victor.quantidadeDeRacao();

        System.out.println("A soma do total de ração consumida por todos os animais: " + totalRacao + " gramas");
    }
}
