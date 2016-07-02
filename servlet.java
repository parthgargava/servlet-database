//JDBC connectivity



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Serv extends HttpServlet {

    

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out=res.getWriter();
        ResultSet rs;
String us=req.getParameter("n1");
String pw=req.getParameter("n2");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
PreparedStatement sta=con.prepareStatement("select * from login");



rs=sta.executeQuery();
while(rs.next()){
if(us.equals(rs.getString(1))&&pw.equals(rs.getString(2)))
{
out.println("<hiiii"+us);
}

  
        
      }}
catch(Exception e)
{
out.println(e);

}
        }}















 
