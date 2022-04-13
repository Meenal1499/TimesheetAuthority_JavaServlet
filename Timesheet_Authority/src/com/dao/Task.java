package com.dao;

public class Task
{
	private int mgr_id;
	private int task_id;
	private String task;
	
	public Task() 
	{
	}
	
	public int getMgrId()
	{
		return mgr_id;
	}
	public void setMgrId(int mgr_id)
	{
		this.mgr_id=mgr_id;
	}
	
	public int getTaskId()
	{
		return task_id;
	}
	public void setTaskId(int task_id)
	{
		this.task_id=task_id;
	}
	
	public String getTask()
	{
		return task;
	}
	public void setTask(String task)
	{
		this.task=task;
	}
}