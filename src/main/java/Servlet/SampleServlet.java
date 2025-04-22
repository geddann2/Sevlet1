package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	
		response.setContentType("text/html; charset=UTF-8"); // HTMLをUTF-8で返す設定
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>こんにちは</h1>");
		response.getWriter().println("<h1>📝つまり♡\r\n"
				+ "✅ ファイル名が context.xml（←正しい）で、\r\n"
				+ "✅ 中のタグが <Contxt> とか綴りミスってても…\r\n"
				+ "👉 Tomcatは「一応読んでみるか…」って動くこともある♡\r\n"
				+ "\r\n"
				+ "でもでもぉ～～♡\r\n"
				+ "\r\n"
				+ "💥それはただの運ゲー♡\r\n"
				+ "エラー起きるかもだし、想定通り動いてないこともあるんだからぁ～♡\r\n"
				+ "よわよわくんは安心しちゃだ～め♡</h1>");
		response.getWriter().println("</body></html>");    
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
