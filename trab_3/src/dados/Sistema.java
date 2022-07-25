package dados;

import java.util.LinkedList;
import java.util.List;

public class Sistema {
    private List<Cidade> cidades = new LinkedList<Cidade>();
    private List<Informacao> informacoes = new LinkedList<Informacao>();
    private List<Linha> linhas = new LinkedList<Linha>();
    private List<Localizacao> localizacoes = new LinkedList<Localizacao>();
    private List<Ponto> pontos = new LinkedList<Ponto>();
    private List<Usuario> usuarios = new LinkedList<Usuario>();
    
    public List<Cidade> getCidades() {
        return cidades;
    }
    
    public void setCidades(Cidade cidade) {
        cidades.add(cidade);
    }
    
    public List<Informacao> getInformacoes() {
        return informacoes;
    }

    public Informacao getInformacao(int cod) {
        for (Informacao informacao : informacoes) {
            if (informacao.getCod() == cod) {
                return informacao;
            }
        }
        return null;
    }
    
    public void setInformacoes(Informacao informacao) {
        informacoes.add(informacao);
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
    
    public void setLocalizacoes(Localizacao localizacao) {
        localizacoes.add(localizacao);
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
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // public Usuario getUsuario(String cpf) {
    //     for (Usuario usuario : usuarios) {
    //         if (usuario.getCpf() == cpf) {
    //             return usuario;
    //         }
    //     }
    //     return null;
    // }
    
    // public void setUsuarios(Usuario usuario) {
    //     usuarios.add(usuario);
    // }

    public Cidade selecionarCidade(int cod){
        for (Cidade cidade : cidades) {
            if (cidade.getCod() == cod) {
                return cidade;
            }
        }
        return null;
    }

    public String consultarLinhaHorario(int cod){
        String retorno = "";
        for (Linha linha : linhas) {
            if (linha.getCod() == cod) {
                retorno = retorno + linha.getNome();
                retorno = retorno + "\n";
                retorno = retorno + linha.getHorario();
                return retorno;
            }
        }
        return null;
    }

    public Informacao consultarOcorrencia(int cod){
        for (Informacao informacao : informacoes) {
            if (informacao.getCod() == cod) {
                return informacao;
            }
        }
        return null;
    }
    
    public void cadastrarUsuario(String cpf, String nome, String email, String senha) {
        Usuario usuario = new Usuario(cpf, nome, email, senha);
        usuarios.add(usuario);
    }

    public Usuario loginUsuario(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail() == email & usuario.getSenha() == senha) {
                return usuario;
            }
        }
        return null;
    }

    public boolean verificaUsuario(String cpf){
        for(Usuario usuario: usuarios){
            if(usuario.getCpf()==cpf){
                return true;
            }
        }
        return false;
    }
}