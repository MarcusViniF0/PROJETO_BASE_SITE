package br.com.exemplo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.exemplo.bens.Usuario;
import br.com.exemplo.bens.UsuarioDAO;

/**
 * Servlet implementation class UsuarioControllador
 */
@WebServlet("/UsuarioControllador")
public class UsuarioControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControllador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usu = new Usuario();
		UsuarioDAO usuDAO=new UsuarioDAO();
		
List<Usuario>lista=usuDAO.buscarTodos(usu);
		
		request.setAttribute("lista", lista);
		RequestDispatcher saida= request.getRequestDispatcher("listaUsuarios.jsp");
		saida.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
