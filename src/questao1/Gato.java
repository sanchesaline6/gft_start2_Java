package questao1;

public class Gato extends Animal{
    public Gato(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String som() {
        return "miau";
    }

    @Override
    public double quantidadeDeRacao() {
        if(this.getPeso() <= 3.0){
            return this.getPeso() * 10;
        }
        else{
            return this.getPeso() * 13;
        }
    }
}