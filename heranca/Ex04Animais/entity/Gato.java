package heranca.Ex04Animais.entity;

package heranca.Ex04Animais.entity;
import heranca.Ex04Animais.entity.Animal;

public class Gato extends Animal{

    public Gato (String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        return "Miar"
    }
}