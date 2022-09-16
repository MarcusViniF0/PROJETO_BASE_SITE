package br.com.exemplo.testes;

import java.util.List;

import br.com.exemplo.bens.Usuario;
import br.com.exemplo.bens.UsuarioDAO;

public class TestDAO {

	public static void main(String[] args) {
	//testeCadastro();
	//testeAlterar();
	//testeDeletar();
    testbuscarTodos();
	}
	public static void testeCadastro() {
		Usuario usu = new Usuario();
		usu.setNome("Marina");
		usu.setEmail("Marina@gmail.com");
		usu.setSenha("5635");
		
		UsuarioDAO usuDao=new UsuarioDAO();
		usuDao.cadastro(usu);
		
	}
	public static void testeAlterar() {
		Usuario usu = new Usuario();
		usu.setNome("Valdo");
		usu.setEmail("Valdo@gmail.com");
		usu.setSenha("15635");
		usu.setId(9);
		
		UsuarioDAO usuDao=new UsuarioDAO();
		usuDao.Alterar(usu);
		
	}
	public static void testeDeletar() {
		Usuario usu = new Usuario();
		usu.setId(28);
		
		UsuarioDAO usuDao=new UsuarioDAO();
		usuDao.Deletar(usu);
	}
	public static void testbuscarTodos() {
		Usuario usu=new Usuario();
		UsuarioDAO usuDAO=new UsuarioDAO();
		List<Usuario>listaResultado =usuDAO.buscarTodos(usu);
		
		for(Usuario u:listaResultado) {
			System.out.println("Id:"+u.getId()+ "Nome:"+u.getNome()+"Email:"+u.getEmail()+"Senha:"+u.getSenha());
		}
	}
}
