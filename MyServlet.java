package com.pack1;

import java.io.IOException;

import javax.servlet.Servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//@WebServlet("/Hi")
public class MyServlet implements Servlet {

	public MyServlet() {
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Hello init");
	}

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service Method called");
	}

}
