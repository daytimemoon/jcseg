package org.lionsoul.jcseg.server.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.lionsoul.jcseg.server.core.Controller;
import org.lionsoul.jcseg.server.core.UriEntry;

/**
 * common error handler
 * 
 * @author chenxin<chenxin619315@gmail.com>
*/
public class ErrorController extends Controller
{

	public ErrorController(
			UriEntry uriEntry, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		super(uriEntry, baseRequest, request, response);
	}

	@Override
	protected void run(String method) throws IOException
	{
		this.response(
				false, 
				-1, 
				"No such controller found for " + request.getRequestURI()
		);
	}
}