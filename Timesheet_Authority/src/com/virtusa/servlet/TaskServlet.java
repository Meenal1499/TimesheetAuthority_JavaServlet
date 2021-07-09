package com.virtusa.servlet;

import java.io.*;
import java.sql.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.virtusa.dao.Task;
import com.virtusa.dao.TaskDAO;

@WebServlet("/find")
public class TaskServlet extends HttpServlet 
{  
	private static final long serialVersionUID = 1L;
	private TaskDAO taskDAO;

    @Override
    public void init() 
    {
        taskDAO = new TaskDAO();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String mgr_id=request.getParameter("mgr_id");  
 		int mid=Integer.valueOf(mgr_id); 
  
        try 
        {
            List<Task> lists = taskDAO.lists(mid);
            //System.out.println("Data Printed");
            request.setAttribute("lists", lists);
            request.getRequestDispatcher("task_view.jsp").forward(request, response);
        } 
        catch (SQLException e) 
        {
            throw new ServletException("Cannot obtain data from DB", e);
        }
    }
}