package classes;

public abstract class Lugar {
    //Atributos:
    protected String nome;
    protected String descricao;
    private Lugar norte;
    private Lugar sul;
    private Lugar leste;
    private Lugar oeste;
    //Métodos especiais:

    public Lugar(String nome, String descricao){
        setNome(nome);
        setDescricao(descricao);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lugar getNorte() {
        return norte;
    }
    public void setNorte(Lugar norte) {
        this.norte = norte;
    }

    public Lugar getSul() {
        return sul;
    }
    public void setSul(Lugar sul) {
        this.sul = sul;
    }

    public Lugar getLeste() {
        return leste;
    }
    public void setLeste(Lugar leste) {
        this.leste = leste;
    }

    public Lugar getOeste() {
        return oeste;
    }
    public void setOeste(Lugar oeste) {
        this.oeste = oeste;
    }

    //Métodos:


}
