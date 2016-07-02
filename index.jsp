<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <SCRIPT language="JavaScript">
      function val()
      {
            
           document.frm.action="Newjsp.jsp";
                      document.frm.submit();

           
      }
  </SCRIPT>
    <body><div>
        <div algin="Right"><form name="frm" action="Serv" method="post">
            Userid:<Input type="test" name="n1"></br>
            Password:<input type="Password" name="n2"></br>
            <input type="Submit" value="login">  
            <input type="button" value="SignUp"onclick="val()">
            <input type="reset" value="Reset">
            
            </form>
        </div>
        </div>
    </body>
</html>
