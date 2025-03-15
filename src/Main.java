import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void limparTela(){
        for (int i = 0; i < 3; i ++){
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Menus menu = new Menus();
        boolean rodar = true;
        Lugar meiDoMato = new Area("Meio do mato", "Um lugar com muito mato");
        Lugar baixaDaEgua = new Area("Baixa da egua", "Um local baixo e com uma\n egua comendo capim");
        meiDoMato.setLeste(baixaDaEgua);
        while(true){
            limparTela();
            int opc = menu.menuInicial();
            limparTela();
            if(opc == 1){

                Player jogador = new Player(menu.criarNome());
                limparTela();
                Game jogo = new Game(jogador, meiDoMato);
                while (true){

                    if(menu.menuJogo(jogo) == 1){
                        jogo.mudarLocal(menu.menuMover());
                    }else{
                        System.out.println("Voltando ao menu inicial");
                        break;
                    }
                }


            }else if(opc == 2){
                menu.sairJogo();
                limparTela();
                break;

            }else if(opc == 3){
                System.out.println("Esse jogo não possui orçamento pra isso...");
            limparTela();
            }

        }



    }
}