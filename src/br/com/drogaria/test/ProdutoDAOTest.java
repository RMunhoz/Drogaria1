package br.com.drogaria.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar() throws SQLException {
		Produto p = new Produto();
		p.setDescricao("Novalgina 10CP");
		p.setPreco(2.45);
		p.setQuantidade(13L);

		Fabricante f = new Fabricante();
		f.setCodigo(6L);

		p.setFabricante(f);

		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
	}
	
	@Test
	@Ignore
	public void listar()throws SQLException{
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		
		for (Produto p : lista) {
			System.out.println("Código " + p.getCodigo());
			System.out.println("Descrição " + p.getDescricao());
			System.out.println("Preço " + p.getPreco());
			System.out.println("Quantidade " + p.getQuantidade());
			System.out.println("Código Fab. " + p.getFabricante().getCodigo());
			System.out.println("Descrição Fab. " + p.getFabricante().getDescricao());
			System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void excluir()throws SQLException{
		Produto p = new Produto();
		p.setCodigo(1L);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	@Test
	public void editar()throws SQLException{
		Produto p = new Produto();
		p.setCodigo(3L);
		p.setDescricao("Novalgina");
		p.setQuantidade(21L);
		p.setPreco(11.00);
		
		Fabricante f = new Fabricante();
		f.setCodigo(8L);
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
}
