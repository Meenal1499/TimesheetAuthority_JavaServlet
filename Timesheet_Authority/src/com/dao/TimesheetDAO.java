package com.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.connection.*;

public class TimesheetDAO 
{
	Connection connection=ConnectionFactory.getConnection();
	
	public List<Timesheet> lists(int emp_id) throws SQLException 
	{
        List<Timesheet> lists = new ArrayList<>();

        try
        {	
        	//System.out.println("db");   
        	
        	PreparedStatement ps=connection.prepareStatement("select * from TIMESHEET where emp_id=?");
			ps.setInt(1,emp_id);
            ResultSet resultSet = ps.executeQuery();
         
            while (resultSet.next()) 
            {
                Timesheet list = new Timesheet();
                list.setTimesheetId(resultSet.getInt("timesheet_id"));
                list.setEmpId(resultSet.getInt("emp_id"));
                list.setTaskId(resultSet.getInt("task_id"));
                list.setStartDate(resultSet.getDate("start_date"));
                list.setEndDate(resultSet.getDate("end_date"));
                lists.add(list);
            }
            
            //System.out.println("Data Fetched");	
        }
        catch(Exception e) {e.printStackTrace();}
        return lists;    
    }
}