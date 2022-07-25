package dados;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SistemaTest {
	public SistemaTest() {
		
	}
	Sistema test = new Sistema();
	
	@Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
	
	@Test
	public void testSelecionarCidade(){
		List<Linha> linhas = new ArrayList<Linha>();
		Cidade cidade = new Cidade(1,"Joinville", linhas);
		test.setCidades(cidade);
		assertNotNull(test.selecionarCidade(1));
	}

	@Test
	public void testConsultarOcorrencia(){
		Localizacao localizacao = new Localizacao(1, "-26.302060,-48.876271", "Mercado XV");
		Informacao informacao = new Informacao(1, "Acidente entre duas motos na rua XV de Novembro.", Tipo.ACIDENTE, localizacao, new Date());
		test.setInformacoes(informacao);
		assertNotNull(test.consultarOcorrencia(1));
	}

	@Test
	public void testConsultarHorario(){
		List<Ponto> pontos = new ArrayList<Ponto>();
		Linha linha = new Linha(1, "Vila Nova - Centro", pontos);
		test.setLinhas(linha);
		assertNotNull(test.consultarLinhaHorario(1));
	}

	@Test
	public void testCadastrarUsuario(){
		Usuario usuario = new Usuario("07867177930", "yuji", "yujiyc01@gmail.com", "1234");
		test.cadastrarUsuario(usuario.getCpf(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
		assertTrue(test.verificaUsuario(usuario.getCpf()));
	}

	@Test
	public void testLoginUsuario(){
		Usuario usuario = new Usuario("07867177930", "yuji", "yujiyc01@gmail.com", "1234");
		test.cadastrarUsuario(usuario.getCpf(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
		assertNotNull(test.loginUsuario("yujiyc01@gmail.com", "1234"));
	}

	@Test
	public void testSimularRota(){
		
	}
}