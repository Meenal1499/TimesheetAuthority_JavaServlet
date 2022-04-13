package com.dao;

import java.util.Date;

public class Timesheet
{
	private int timesheet_id;
	private int emp_id;
	private int task_id;
	private Date start_date;
	private Date end_date;
	
	public Timesheet() 
	{
	}
	
	public int getTimesheetId()
	{
		return timesheet_id;
	}
	public void setTimesheetId(int timesheet_id)
	{
		this.timesheet_id=timesheet_id;
	}
	
	public int getEmpId()
	{
		return emp_id;
	}
	public void setEmpId(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	public int getTaskId()
	{
		return task_id;
	}
	public void setTaskId(int task_id)
	{
		this.task_id=task_id;
	}
	
	public Date getStartDate()
	{
		return start_date;
	}
	public void setStartDate(Date start_date)
	{
		this.start_date=start_date;
	}
	
	public Date getEndDate()
	{
		return end_date;
	}
	public void setEndDate(Date end_date)
	{
		this.end_date=end_date;
	}
}