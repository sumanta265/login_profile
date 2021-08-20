package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/user")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(pass.equals("kiit"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WellcomeUser");
			 rd.forward(request, response);
			
		}
		else
		{
			out.println("Please enter a valid password");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
		
		
		
	}

}
