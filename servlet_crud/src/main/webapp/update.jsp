<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update1">
id:<input type="number" name="Std_id" value=<%=request.getParameter("Std_id")%> readonly="readonly"><br>
Name:<input type="text" name="Std_name" value=<%=request.getParameter("Std_name")%>><br>
Number:<input type="number" name="ph_no" value=<%=request.getParameter("Ph_no")%>><br>

<% if(request.getParameter("Gender").equals("male")){ %>
Male:<input type="radio" name="Gender" value="male" checked="checked">
Female:<input type="radio" name="Gender" value="female">
<%} else{%>
Male:<input type="radio" name="Gender" value="male" >
Female:<input type="radio" name="Gender" value="female" checked="checked">
<%}%>
<br>
<button type="submit">Update</button>
<button type="reset">Cancel</button>




</form>
</body>
</html>