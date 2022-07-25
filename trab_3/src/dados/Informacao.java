package dados;

import java.util.Date;

public class Informacao {
    private int cod;
    private String descricao;
    private Tipo tipo;
    private Localizacao local;
    private Date data;

    public Informacao(int cod, String descricao, Tipo tipo, Localizacao local, Date data){
        this.cod = cod;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.data = data;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Tipo getTipo() {
        return tipo;
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public Localizacao getLocal() {
        return local;
    }
    
    public void setLocal(Localizacao local) {
        this.local = local;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

}