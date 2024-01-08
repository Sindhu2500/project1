<%@page import="ServeletsCrud.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> l1=(List<StudentDto>)request.getAttribute("studentlist"); %>
<table border="5px" id="table">
<tr>
<th>id</th>
<th>name</th>
<th>number</th>
<th>gender</th>
<th>delete</th>
<th>Update</th>
</tr>
<% for(StudentDto a1:l1) {%>
<tr>
<th><%=a1.getStd_id() %></th>
<th><%=a1.getStd_name() %></th>
<th><%=a1.getGender() %></th>
<th><%=a1.getPh_no() %></th>
<td><a href="delete1?Std_id=<%=a1.getStd_id()%>">Delete</a></td>
<td><a href="update1.jsp?
Std_id=<%=a1.getStd_id()%>
&Std_name=<%=a1.getStd_name()%>
&Ph_no=<%=a1.getPh_no()%>
&Gender=<%=a1.getGender()%>
">Update</a></td>
</tr>
<% }%>
</table>
</body>
</html>