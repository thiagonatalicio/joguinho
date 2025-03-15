package classes;

public class Area{


    protected String nome;
    protected String descricao;
    private Area norte;
    private Area sul;
    private Area leste;
    private Area oeste;
    public Construcao[] construcao = new Construcao[10];

    public Area(String nome, String descricao){
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

    public Area getNorte() {
        return norte;
    }
    public void setNorte(Area norte) {
        this.norte = norte;
    }

    public Area getSul() {
        return sul;
    }
    public void setSul(Area sul) {
        this.sul = sul;
    }

    public Area getLeste() {
        return leste;
    }
    public void setLeste(Area leste) {
        this.leste = leste;
    }

    public Area getOeste() {
        return oeste;
    }
    public void setOeste(Area oeste) {
        this.oeste = oeste;
    }

    public void adicionarContrucao(Construcao construcao){
        int i = 0;
        while(this.construcao[i] != null && i < 10){
            i ++;
        }
        if (i < 11){
            this.construcao[i] = construcao;
        }
    }


}
