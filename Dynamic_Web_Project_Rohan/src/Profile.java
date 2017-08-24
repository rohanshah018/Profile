

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Profile(){
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("eid");

		try{
			Connection con = null;
			Statement st = null;

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohan", "root", "root");
			st= con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where EmpNo='" + id + "'");

			if(rs.next()){
				out.println("<table border='7'><tr><td>Eid</td><td>Ename</td><td>jcode</td>"
						+ "<td>HiredDate</td><td>Salary</td><td>Commission</td><td>DeptNo</td></tr>");
				out.println("<tr><td>" + rs.getString(1)+"</td>");
				out.println("<td>" + rs.getString(2)+"</td>");
				out.println("<td>" + rs.getString(3)+"</td>");
				out.println("<td>" + rs.getString(4)+"</td>");
				out.println("<td>" + rs.getString(5)+"</td>");
				out.println("<td>" + rs.getString(6)+"</td>");
				out.println("<td>" + rs.getString(7)+"</td></tr></table>");
			}

			else{
				out.println("Employee id is not valid");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
