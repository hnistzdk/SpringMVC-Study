/**
 * @author com.zdk
 * @date 2021/4/10 20:06
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username= request.getParameter("username");
        if(username.equals("com.zdk")){
            request.getSession().setAttribute("msg", "张迪凯");
        }else {
            request.getSession().setAttribute("msg", "不是张迪凯");
        }
        request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
