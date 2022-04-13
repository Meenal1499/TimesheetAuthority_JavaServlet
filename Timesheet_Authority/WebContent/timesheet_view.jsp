<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.dao.Timesheet"%> 
<%@page import="java.util.List"%> 
<%@page import="java.util.Date"%>
<%@include file="footer.html"%> 
<%@include file="header.html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee's Time Sheet</title>
<style>
#timesheet { width:700px;height:50%;text-align: center;}

#timesheet td, #timesheet th {border: 1px solid #ddd;padding: 10px;}

#timesheet tr:nth-child(even){background-color: #f2f2f2;}

#timesheet tr:nth-child(odd){background-color: #f2f2f2;}

#timesheet tr:hover {background-color: #ddd;}

#timesheet th {padding-top: 12px;padding-bottom: 12px;background-color: #4CAF50;color: white;}

div{position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);border-radius: 10px;background-color:black;padding: 10px;}
</style>
</head>
<body style="font-family: Comic Sans MS;background-color:	#FFFF99;background-image: linear-gradient(to right, #FFFF99 ,#AFEEEE);font-size:20px;">
<div>
<table id="timesheet">
<tr>
<th>Time Sheet ID</th>
<th>Employee ID</th>
<th>Task ID</th>
<th>Start Date</th>
<th>End Date</th>
</tr>
<%
	List<Timesheet> lists = (List<Timesheet>) request.getAttribute("lists");
	for(Timesheet list : lists) 
	{
		out.print("<tr>");
    	out.print("<td>"+list.getTimesheetId()+"</td>");
    	out.print("<td>"+list.getEmpId()+"</td>");
    	out.print("<td>"+list.getTaskId()+"</td>");
    	out.print("<td>"+list.getStartDate()+"</td>");
    	out.print("<td>"+list.getEndDate()+"</td>");
    	out.print("</tr>");
	}
	
%>
</table>
</div>
</body>
</html>