package com.ebill.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ebill.entities.Consumer;
import com.ebill.service.EBillService;

@WebServlet("/EBillController")
public class EBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EBillController() {
    	
    	System.out.println("Servlet Constructor");
       
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget Called");
		
		
		String action = request.getParameter("action");
		EBillService service = new EBillService();
		
		
		if(action.equals("getAlldetails")) {
			
			ArrayList<Consumer> list = service.getAllDetials();
			/*
			Iterator<Consumer> itr = list.iterator();
			while(itr.hasNext())
			{
			System.out.println(list.toString());
			}*/
			request.setAttribute("details", list);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
			
			dispatcher.forward(request, response);
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

}
