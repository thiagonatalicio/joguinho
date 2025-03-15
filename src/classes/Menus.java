package classes;
import java.util.Scanner;
public class Menus {

    //Métodos especiais
    public Menus(){

    }

    //Métodos:


    public int menuInicial(){
        System.out.println("+---------------------------+");
        System.out.println("         1 - Jogar.");
        System.out.println("          2 - Sair. ");
        System.out.println("    3 - Carregar jogo salvo.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("-[>");
        return scanner.nextInt();
    }

    public String criarNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("Escolha um nome para seu personagem:");
        System.out.print("-[>");
        return scanner.nextLine();
    }

    public int menuJogo(Game game){
        System.out.println("+---------------------------+");
        System.out.println("Voce está em: " + game.getLocal().getNome());
        System.out.println("        1 - Se mover.");
        System.out.println("          2 - Sair. ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("-[>");
        return scanner.nextInt();
    }

    public int menuMover(){
        System.out.println("+---------------------------+");
        System.out.println("         1 - Norte.");
        System.out.println("          2 - Sul. ");
        System.out.println("         3 - Leste.");
        System.out.println("         4 - Oeste. ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("-[>");
        return scanner.nextInt();
    }


    public void sairJogo(){
        System.out.println("+---------------------------+");
        System.out.println("        Fechando jogo...");
        System.out.println(" Curte esse video... VAAAIII!");
        System.out.println("+---------------------------+");
    }
}
