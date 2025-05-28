package heranca.Ex04Animais.entity;
import heranca.Ex04Animais.entity.Animal;

public class Cachorro extends Animal{

    public Cachorro (String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "Latir"
    }
}
