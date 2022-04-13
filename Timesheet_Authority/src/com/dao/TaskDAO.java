package com.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.connection.*;

public class TaskDAO 
{
	Connection connection=ConnectionFactory.getConnection();
	public List<Task> lists(int mgr_id) throws SQLException 
	{
        List<Task> lists = new ArrayList<>();

        try
        {
        	//System.out.println("DB Connected");
        		
        	PreparedStatement ps=connection.prepareStatement("select * from TASK where mgr_id=?");
			ps.setInt(1,mgr_id);
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()) 
            {
            	Task list = new Task();
                list.setMgrId(resultSet.getInt("mgr_id"));
                list.setTaskId(resultSet.getInt("task_id"));
                list.setTask(resultSet.getString("task"));
                lists.add(list);
            }
            //System.out.println("Data Fetched");
        }
        catch(Exception e) 
        {
        	e.printStackTrace();
        } 
        return lists;
    }
}