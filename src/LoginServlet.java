

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 认证 —— 获取已经登录的用户信息
 * @author 王艳林
 * @email 981247127@qq.com
 **/
@WebServlet(urlPatterns = "/auth/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		if (user.equals("root")) {
			HttpSession session = request.getSession();
			session.setAttribute("U",user);
		}

	}
}