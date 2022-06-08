

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
@WebServlet(urlPatterns = "/auth/info")
public class LoginInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("U");
		PrintWriter writer = response.getWriter();
		writer.write(attribute == null ? "nologin" : attribute.toString());
		writer.flush();
	}

}