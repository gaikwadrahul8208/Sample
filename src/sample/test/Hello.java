package sample.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

@WebServlet("/loginServlet")
public class Hello extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger.getLogger(Hello.class);
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
    	
    	System.out.println("Logger Messages");
    	LOGGER.trace("Trace Message!");
    	LOGGER.debug("Debug Message!");
    	LOGGER.info("Info Message!");
    	LOGGER.warn("Warn Message!");
    	LOGGER.error("Error Message!");
    	LOGGER.fatal("Fatal Message!");
    	LOGGER.info("For test Info Message!");
    	System.out.println("End of Logger Messages");
    }
 
}
