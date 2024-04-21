<%--
Document : first
Created on : Apr 1, 2024, 9:27:38 AM
Author : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>My first JSP Page</h1>
<h2>Declarative tag :- <%! %></h2>
<h2>Scriplet tag :- <% %></h2>
<%!
int a=10;
int b=40;
int multiply()
{
return a*b;
}
String name="My name is shruti";
String reverse()
{
StringBuffer bf=new StringBuffer(name);
return bf.reverse().toString();
}
%>

<%=
reverse()
%>

<%
out.print("<br>");
out.print(a);
out.print("<br>");
out.print(b);
out.print("<br>");
out.print("Multiplication result is:- "+ multiply());
out.print("<br>");
out.print("Reverse of string in scriplet tag:- " + reverse());
%>

<% out.print("<br>");
out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>
</body>

</html>