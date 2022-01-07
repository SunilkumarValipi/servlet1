import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Helloworld extends HttpServlet
{
private String msg;
public void init()throws servletException
{
msg="first servlet program";
}
public void doGet(HttpServletRequest req, HttpServletRespond res)throws servletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getwriter();
out.println("<h1>"+msg+"</h1>");
}
public void destory(){}
}