package dados;

import java.util.LinkedList;
import java.util.List;

public class Localizacao {
    private int cod;
    private String coordenada;
    private String nome;
    private List<Informacao> informacoes = new LinkedList<Informacao>();

    public Localizacao(int cod, String coordenada, String nome){
        this.cod = cod;
        this.coordenada = coordenada;
        this.nome = nome;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getCoordenada() {
        return coordenada;
    }
    
    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Informacao> getInformacoes() {
        return informacoes;
    }
    
    public void setInformacoes(Informacao informacao) {
        informacoes.add(informacao);
    }
}