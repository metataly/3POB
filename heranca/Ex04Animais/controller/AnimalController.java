package heranca.Ex04Animais.controller;
import heranca.Ex03Funcionario.entity.Estagiario;
import heranca.Ex03Funcionario.entity.Gerente;
import heranca.Ex04Animais.entity.*;

public class AnimalController {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("pingo", 2);
        Gato gato = new Gato("ambrosio", 5);

        System.out.println("nome:" + cachorro.getNome() + "idade:" + cachorro.getIdade() + "Som:" + cachorro.emitirSom());
        System.out.println("nome:" + gato.getNome() + "salario:" + gato.getIdade() + "Som:" + gato.emitirSom());
        
    }
    
}
