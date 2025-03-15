package classes;

public class Game {
    //Atributos:
    private Player jogador;
    private Lugar local;

    //Métodos especiais:
    public Game(Player jogador, Lugar lugar){
        this.jogador = jogador;
        this.local = lugar;
    }
    public Player getJogador() {
        return jogador;
    }
    public void setJogador(Player jogador) {
        this.jogador = jogador;
    }

    public Lugar getLocal() {
        return local;
    }
    public void setLocal(Lugar local) {
        this.local = local;
    }

    //Métodos:
    public String descreverLocal(){
        return getLocal().getDescricao();
    }

    public void mudarLocal(int num){
        if(num == 1 && this.local.getNorte() != null){
            this.local = this.local.getNorte();
        }else if(num == 2 && this.local.getSul() != null){
            this.local = this.local.getSul();
        }else if(num == 3 && this.local.getLeste() != null){
            this.local = this.local.getLeste();
        }else if(num == 4 && this.local.getOeste() != null){
            this.local = this.local.getOeste();
        }else {
            System.out.println("Não existe nada nessa direção");
        }
    }
}
