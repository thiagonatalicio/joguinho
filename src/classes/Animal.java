package classes;

import java.util.Objects;

public abstract class Animal {
    //Atributos:
    protected int id;
    protected String nome;
    protected String tipo;
    protected int pesoMax;
    protected int pesoMin;
    protected int pesoAtual;

    Animal(int id){
        this.id = id;
    }
    //Métodos especiais:

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getPesoMax(){
        return this.pesoMax;
    }
    public void setPesoMax(int pesoMax){
        this.pesoMax = pesoMax;
    }

    public int getPesoMin(){
        return this.pesoMin;
    }
    public void setPesoMin(int pesoMin){
        this.pesoMin = pesoMin;
    }

    public int getPesoAtual(){
        return pesoAtual;
    }
    public void setPesoAtual(int pesoAtual){
        if (getPesoAtual() > getPesoMax()){
            this.pesoAtual = getPesoMax();
        }
        else {
            this.pesoAtual = pesoAtual;
        }
    }


    //Métodos:
    public void comer(Racao comida){
        if(Objects.equals(comida.getTipoAnimal(), this.getTipo())){
            setPesoAtual(getPesoAtual() + comida.getPeso());
        }
    }
}
