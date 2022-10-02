<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age Calculator</title>
</head>
<body>
<h1>Age Calculator</h1>
<form action="getYearServlet" method="post">
Enter the year that you were born:
<input type="text" name="userYear" size="10">
<input type="submit" value="Calculate Age">
</form>
</body>
</html>