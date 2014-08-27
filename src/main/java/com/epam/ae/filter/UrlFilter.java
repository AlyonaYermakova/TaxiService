package com.epam.ae.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UrlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        doFilter(((HttpServletRequest) req), ((HttpServletResponse) resp), filterChain);
    }

    private void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain filterChain) throws ServletException, IOException {
        String pathInfo = req.getRequestURI().substring(req.getContextPath().length());
        if (pathInfo.startsWith("/static") || pathInfo.startsWith("/webjars")) {
            filterChain.doFilter(req, resp);
            return;
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/do" + pathInfo);
        dispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {

    }
}
