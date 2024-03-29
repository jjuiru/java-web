package mvjsp.jdbc.loader;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.util.StringTokenizer;

public class DBCPInit extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		try {
			String drivers = config.getInitParameter("jdbcdriver");
			StringTokenizer st = new StringTokenizer(drivers, ",");
			while (st.hasMoreTokens()) {
				String jdbcDriver = st.nextToken();
				Class.forName(jdbcDriver);
				// web.xml 파일에서 값을 받아온다. mysql 접송용 데이터 최초로 일어난다. 
			}
			
			Class.forName("org.apache.commons.dbcp.PoolingDriver");

		} catch(Exception ex) {
			throw new ServletException(ex);
		}
	}
}
