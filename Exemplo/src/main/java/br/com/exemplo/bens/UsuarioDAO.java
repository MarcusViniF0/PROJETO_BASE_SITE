package br.com.exemplo.bens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.jdbc.Conexao;

public class UsuarioDAO {
	private Connection con = Conexao.getConnection();
	
	public void cadastro(Usuario usuario) {
		
	String sql="INSERT INTO USUARIO (nome,email,senha)values(?,?,?)";
	
	try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, usuario.getNome());
		preparador.setString(2, usuario.getEmail());
		preparador.setString(3, usuario.getSenha());
		
		preparador.execute();
		preparador.close();
		
		System.out.println("Cadastrado com sucesso!");
		
	} catch (SQLException e) {
		System.out.println("ERRO -"+e.getMessage());
	}
	}
	public void Alterar(Usuario usuario) {
		
		String sql="update usuario set nome=?,email=?,senha=? WHERE id=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Alterado com sucesso!");
			
			
		} catch (SQLException e) {
			System.out.println("ERRO -"+e.getMessage());
		}
		}
		public void Deletar(Usuario usuario) {
			
			String sql="Delete from usuario where id= ?";
			
			try {
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setInt(1,usuario.getId());
				preparador.execute();
				preparador.close();
				
				System.out.println("Deletado com sucesso!");
			} catch (SQLException e) {
				System.out.println("ERRO -"+e.getMessage());
			}}
			
			public List<Usuario> buscarTodos(Usuario usuario){
			
			String sql ="select*from usuario";
			List<Usuario> lista = new ArrayList<Usuario>();
			
			try {
				PreparedStatement preparador = con.prepareStatement(sql);
				ResultSet resultados=preparador.executeQuery();
				while(resultados.next()) {
				Usuario usu=new Usuario();
				usu.setId(resultados.getInt("id"));
				usu.setNome(resultados.getString("nome"));
				usu.setEmail(resultados.getString("email"));
				usu.setSenha(resultados.getString("senha"));
				lista.add(usu);
				}
			} catch (SQLException e) {
				System.out.println("Erro - "+e.getMessage());
			}
			return lista;
			}}
			
			


