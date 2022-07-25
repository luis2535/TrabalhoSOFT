package dados;

import java.util.LinkedList;
import java.util.List;

public class Linha {
    private int cod;
    private String nome;
    private List<Ponto> pontos = new LinkedList<Ponto>();
    private List<String> horarios = new LinkedList<String>();

    public Linha(int cod, String nome, List<Ponto> pontos){
        this.cod = cod;
        this.nome = nome;
        this.pontos = pontos;
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
    
    public List<Ponto> getPontos() {
        return pontos;
    }
    
    public Ponto getPonto(int cod) {
        for (Ponto ponto : pontos) {
            if (ponto.getCod() == cod) {
                return ponto;
            }
        }
        return null;
    }

    public void setPontos(Ponto ponto) {
        pontos.add(ponto);
    }
    
    public List<String> getHorarios() {
        return horarios;
    }

    public String getHorario(){
        String retorno = null;
        for (String hora : this.getHorarios()) {
            retorno = retorno + hora;
            retorno = retorno + "\n";
        }
        return retorno;
    }

    public void setHorarios(String horario) {
        horarios.add(horario);
    }

}