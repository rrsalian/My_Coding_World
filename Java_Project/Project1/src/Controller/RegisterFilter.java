package Controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class RegisterFilter
 */
@WebFilter("/RegisterServlet")
public class RegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegisterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("mail");
		String phone=request.getParameter("phone");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		
		boolean n=((name != null) && (!name.equals(""))  && (name.matches("^[a-zA-Z]*$"))); 
		
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		boolean m=matcher.matches();
		
		boolean p=phone.length()==10 && phone.matches("[0-9]+")?true:false;
		
		boolean cp=pass.equals(cpass)?true:false;
		System.out.println(n+" "+m+" "+p+" "+cp);
		
		if(n&&m&&p&&cp) {
			System.out.println("true");
		chain.doFilter(request, response);
		}
		else {
			System.out.println("false");
			request.setAttribute("filter", "false");
			request.getRequestDispatcher("Registration.jsp").forward(request,response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
