/*
 * Copyright (c) 2000 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 2nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book (recommended),
 * visit http://www.davidflanagan.com/javaexamples2.
 */
package org.hbnugeek.servlet;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This simple servlet ends the current session, and redirects the user's
 * browser to a URL specified by the "page" request parameter. It should be
 * suitable for use by any web application that requires the user to log in.
 **/
public class Logout extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException
    {
	// Destroy the user's session
	request.getSession().invalidate();

	// Figure out what to display next
	String nextpage = request.getParameter("page");

	// And redirect the user's browser to that page
	response.sendRedirect(nextpage);
    }

    // doPost just invokes doGet
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws java.io.IOException
    {
	doGet(request, response);
    }
}
