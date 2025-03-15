package classes;

public class Ovelha extends Animal{
    public Ovelha(int id){
        super(id);
        this.nome = "Ovelha";
        this.tipo = "Ovino";
        this.pesoMin = 10;
        this.pesoMax = 30;
        this.pesoAtual = pesoMin;
    }

}