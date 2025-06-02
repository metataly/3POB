package excecoes.Ex05;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scan.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scan.nextLine();

            if (usuario == null || usuario.trim().isEmpty() ||
                senha == null || senha.trim().isEmpty()) {
                throw new LoginInvalidoException("Usuário e senha não podem estar vazios.");
            }

            System.out.println("Login realizado com sucesso!");

        } catch (LoginInvalidoException e) {
            System.out.println("Erro no login: " + e.getMessage());
        }
    
        scan.close();
        
    }
}
