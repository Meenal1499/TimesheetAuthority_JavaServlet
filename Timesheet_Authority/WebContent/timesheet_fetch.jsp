<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="footer.html"%> 
<%@include file="header.html"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch Time Sheet</title>
<style>
input[type=text], select {width: 100%;padding: 12px 20px;margin: 8px 0;display: inline-block;border: 1px solid #ccc;border-radius: 4px;box-sizing: border-box;}

input[type=submit] {width: 100%;background-color: #4CAF50;color: white;padding: 14px 20px;margin: 8px 0;border: none;border-radius: 4px;cursor: pointer;}

input[type=submit]:hover {background-color: #45a049;}

div {position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);border-radius: 10px;border: 10px solid black;background-color: #f2f2f2;padding: 20px;}

#button{font-size:20px;}

#entry{font-size:20px;}
</style>
</head>
<body style="font-family: Comic Sans MS;background-color:	#FFFF99;background-image: linear-gradient(to right, #FFFF99 ,#AFEEEE);">
<div>
<form action="search" method="POST">
<lable style="font-size:20px;">Employee Id:</lable>
<input type="text" id="entry" name="emp_id" placeholder="Enter here..." REQUIRED/>
<input type="submit" id="button" value="Search"/>
</form> 
</div>
</body>
</html>