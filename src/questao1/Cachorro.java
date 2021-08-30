package questao1;

public class Cachorro extends Animal{
    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }


    @Override
    public String som() {
        return "auau";
    }

    @Override
    public double quantidadeDeRacao() {

        if(this.getPeso() <= 4.0){
            return this.getPeso() * 0.04;
        }
        else if(this.getPeso() <= 12.0){
            return this.getPeso() * 45;
        }
        else{
            return this.getPeso() * 55;
        }
    }
}
