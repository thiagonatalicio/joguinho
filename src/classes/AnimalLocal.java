package classes;

import java.util.Objects;

public class AnimalLocal {
    //Atributos:
    private String nome;
    private Animal[] animais = new Animal[10];
    private String tipo;

    //Métodos especiais:

    public AnimalLocal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.animais[0] = null;
        this.animais[1] = null;
        this.animais[2] = null;
        this.animais[3] = null;
        this.animais[4] = null;
        this.animais[5] = null;
        this.animais[6] = null;
        this.animais[7] = null;
        this.animais[8] = null;
        this.animais[9] = null;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
    //Métodos:
    public void addAnimal(Animal animal){
        if (Objects.equals(animal.getTipo(), this.tipo)){
            int i = 0;
            while(animais[i] != null && i < 10){
                i ++;
            }
            if (i < 10){
                animais[i] = animal;
            } else {
                System.out.println(this.nome + " cheio..");
            }
        }
    }
}
