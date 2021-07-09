package com.virtusa.servlet;

import java.io.*;  
import java.sql.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.virtusa.dao.Timesheet;
import com.virtusa.dao.TimesheetDAO;

@WebServlet("/search")
public class TimesheetServlet extends HttpServlet 
{  
	private static final long serialVersionUID = 1L;
	private TimesheetDAO timesheetDAO;
	
    @Override
    public void init() 
    {
        timesheetDAO = new TimesheetDAO();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String emp_id=request.getParameter("emp_id");  
 		int eid=Integer.valueOf(emp_id); 
 		
        try 
        {
            List<Timesheet> lists = timesheetDAO.lists(eid);
            System.out.println("Data Printed");	
            request.setAttribute("lists", lists);
            request.getRequestDispatcher("timesheet_view.jsp").forward(request, response);
        } 
        catch (SQLException e) 
        {
            throw new ServletException("Cannot obtain data from DB", e);
        }
    }
}