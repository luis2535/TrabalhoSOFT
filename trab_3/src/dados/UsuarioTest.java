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

public class UsuarioTest {
	public UsuarioTest() {
		
	}
	@Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
	
	Usuario test = new Usuario();

	// teste unitário para verificar se a ocorrencia foi informada
	@Test
	public void testInformarOcorrencia(){
		Localizacao localizacao = new Localizacao(1, "-26.302060,-48.876271", "Mercado XV");
		Informacao informacao = new Informacao(1, "Acidente entre duas motos na rua XV de Novembro.", Tipo.ACIDENTE, localizacao, new Date());
		test.informaOcorrencia(informacao);
		assertTrue(test.verificaOcorrencia(informacao));
	}
	
	// teste unitário para verificar se a cidade foi salva
	@Test
	public void testSalvarCidade(){
		List<Linha> linhas = new ArrayList<Linha>();
		Cidade cidade = new Cidade(1,"Joinville", linhas);
		test.salvarCidade(cidade);
		assertTrue(test.verificaCidade(cidade.getCod()));
	}

	// teste unitário para verificar se a linha foi salva
	@Test
	public void testSalvarLinha(){
		List<Ponto> pontos = new ArrayList<Ponto>();
		Linha linha = new Linha(1,"Joinville", pontos);
		test.salvarLinha(linha);
		assertTrue(test.verificaLinha(linha.getCod()));
	}
	
	// teste unitário para verificar se a localização foi salva
	@Test
	public void testSalvarLocaliza��o(){
		Localizacao localizacao = new Localizacao(1, "-26.302060,-48.876271", "Casa");
		test.salvarLocalizacao(localizacao);
		assertTrue(test.verificaLocalizacao(localizacao.getCod()));
	}
}