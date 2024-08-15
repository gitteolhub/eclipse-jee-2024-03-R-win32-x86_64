package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DemoServlet
 */
// Spring Boot에서는 xml file을 거의 안 쓰고 아래와 같은 어노테이션 방식을 쓴다.
@WebServlet(urlPatterns = { "/demo2.do", "/DemoServlet" }, initParams = {
		@WebInitParam(name = "java", value = "21", description = "서블릿") })
public class DemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DemoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub }
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// getWriter는 실행시 한 번만 호출 가능하므로 기본 getWriter는 주석처리 해놓았다
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<b>doGet</b><br>실행");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy(); // web.xml 사용 기준으론 활성화돼있으면 Tomcat이 종료되서 아래 destroy 문구가 출력되지 않는다. 하지만 주석 처리시
							// resource(database 등)가 해제되지 않아 memory 누수가 발생한다. 발생 시 computer를 재부팅해야한다.
		System.out.println("destroy"); // web.xml 사용 기준 super 윗줄에 적은 code는 무시되므로 위에 적더라도 소용없다. 어노테이션 방식 사용 시 작동 방식이
										// 다른건지 위든 아래든 실행된다.
	}

}
