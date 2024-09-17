package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.annotation.WebFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet Filter implementation class DemoFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
		, urlPatterns = { "/*" })
public class DemoFilter extends HttpFilter implements Filter {
       
	 /**
     * @see HttpFilter#HttpFilter()
     */
    public DemoFilter() {
        // super();
        System.out.println("Filter 생성자");
    	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				
		// request.setCharacterEncoding("UTF-8");
		
		System.out.println("Filter doFilter request");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Filter doFilter response");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("Filter init");
	}

}