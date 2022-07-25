package dados;

import java.util.LinkedList;
import java.util.List;

public class Cidade {
    private int cod;
    private String nome;
    private List<Linha> linhas = new LinkedList<Linha>();

    public Cidade(int cod, String nome, List<Linha> linhas){
        this.cod = cod;
        this.nome = nome;
        this.linhas = linhas;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Linha> getLinhas() {
        return linhas;
    }

    public Linha getLinha(int cod) {
        for (Linha linha : linhas) {
            if (linha.getCod() == cod) {
                return linha;
            }
        }
        return null;
    }
    
    public void setLinhas(Linha linha) {
        linhas.add(linha);
    }
}