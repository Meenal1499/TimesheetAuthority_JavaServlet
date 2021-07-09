<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.virtusa.dao.Task"%> 
<%@page import="com.virtusa.dao.TaskDAO"%> 
<%@page import="java.util.List"%> 
<%@page import="java.util.Date"%>
<%@include file="footer.html"%> 
<%@include file="header.html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee's Tasks</title>
<style>
#task { width:700px;height:50%;text-align: center;}

#task td, #task th {border: 1px solid #ddd;padding: 10px;}

#task tr:nth-child(even){background-color: #f2f2f2;}

#task tr:nth-child(odd){background-color: #f2f2f2;}

#task tr:hover {background-color: #ddd;}

#task th {padding-top: 12px;padding-bottom: 12px;background-color: #4CAF50;color: white;}

div{position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);border-radius: 10px;background-color:black;padding: 10px;}
</style>
</head>
<body style="font-family: Comic Sans MS;background-color:	#FFFF99;background-image: linear-gradient(to right, #FFFF99 ,#AFEEEE); font-size:20px;">
<div>
<table id="task">
<tr>
<th>Manager ID</th>
<th>Task ID</th>
<th>Task</th>
</tr>
<%
	List<Task> lists = (List<Task>) request.getAttribute("lists");
	for(Task list : lists) 
	{
		out.print("<tr>");
    	out.print("<td>"+list.getMgrId()+"</td>");
    	out.print("<td>"+list.getTaskId()+"</td>");
    	out.print("<td>"+list.getTask()+"</td>");
    	out.print("</tr>");
	}
%>
</table>
</div>
</body>
</html>