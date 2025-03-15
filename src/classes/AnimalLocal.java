package classes;

import java.util.Objects;

public class AnimalLocal {
    private String nome;
    private Animal[] animais = new Animal[10];
    private String tipo;

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
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
