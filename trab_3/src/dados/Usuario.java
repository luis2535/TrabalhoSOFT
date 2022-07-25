package dados;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private List<Cidade> cidades = new LinkedList<Cidade>();
    private List<Linha> linhas = new LinkedList<Linha>();
    private List<Localizacao> localizacoes = new LinkedList<Localizacao>();
    
    public Usuario() {}
    
    public Usuario(String cpf, String nome, String email, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public List<Cidade> getCidades() {
        return cidades;
    }

    public Cidade getCidade(int cod) {
        for (Cidade cidade : cidades) {
            if (cidade.getCod() == cod) {
                return cidade;
            }
        }
        return null;
    }
    
    // public void setCidades(Cidade cidade) {
    //     cidades.add(cidade);
    // }
    
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
    
    // public void setLinhas(Linha linha) {
    //     linhas.add(linha);
    // }
    
    public List<Localizacao> getLocalizacoes() {
        return localizacoes;
    }

    public Localizacao getLocalizacao(int cod) {
        for (Localizacao localizacao : localizacoes) {
            if (localizacao.getCod() == cod) {
                return localizacao;
            }
        }
        return null;
    }
    
    // public void setLocalizacoes(Localizacao localizacao) {
    //     localizacoes.add(localizacao);
    // }

    public void informaOcorrencia(Informacao informacao){
        informacao.getLocal().setInformacoes(informacao);
    }
    
    public void salvarLinha(Linha linha) {
        linhas.add(linha);
    }

    public void salvarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public void salvarLocalizacao(Localizacao localizacao) {
        localizacoes.add(localizacao);
    }

    public boolean verificaOcorrencia(Informacao informacao){
        for(Informacao i: informacao.getLocal().getInformacoes()){
            if(i.getCod()==informacao.getCod()){
                return true;
            }
        }
        return false;
    }

    public boolean verificaCidade(int cod){
        for(Cidade cidade: cidades){
            if(cidade.getCod()==cod){
                return true;
            }
        }
        return false;
    }

    public boolean verificaLinha(int cod){
        for(Linha l: linhas){
            if(l.getCod()==cod){
                return true;
            }
        }
        return false;
    }

    public boolean verificaLocalizacao(int cod){
        for(Localizacao l: localizacoes){
            if(l.getCod()==cod){
                return true;
            }
        }
        return false;
    }
}