package http;

public class HttpServlaetEx {

	public static void main(String[] args) {
		
		HttpServlet htt= new LoginServlet();
		HttpServlet htt1= new FileDownloadServlet();
		
		System.out.println(htt);
		System.out.println(htt1);
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
