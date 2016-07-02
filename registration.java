

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Reg extends HttpServlet {

    

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out=res.getWriter();
       
String us1=req.getParameter("r1");
String pw1=req.getParameter("r2");

String nm=req.getParameter("r3");
String ct=req.getParameter("r4");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
PreparedStatement sta=con.prepareStatement("insert into login values(?,?,?,?)");
sta.setString(1,us1);
sta.setString(2,pw1);
sta.setString(3,nm);
sta.setString(4,ct);



sta.executeUpdate();
out.println("Registered");

      }
catch(Exception e)
{
out.println(e);

}
        }}















 
