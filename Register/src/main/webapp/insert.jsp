<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<pre>

<form action="insert" onsubmit="return validatePassword()">

NAME:<input type="text" name="name"><br>
EMAIL:<input type="email" name="email"><br>
PH:<input type="number" name="ph"><br>
DOB:<input type="date" name="dob"><br>
LOCATION:<input type="text" name="location"><br>
IDENTIFICATION DOCUMENT:<input type="file" name="identification document"><br>
<button>submit</button>
<button>cancle</button>

</body>
</html>