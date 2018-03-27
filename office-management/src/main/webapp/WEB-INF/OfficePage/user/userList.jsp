<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	  <table>
     <tr>
        <td>用户名</td>
        <td>绑定员工</td>
        <td>操作</td>
        </tr>
     <c:forEach items="${requestScope.userList}" var="user">
     <tr>
        <td>${user.userName}</td>
        <td>${user.emp.empName}</td>
     </tr>
     </c:forEach>
   </table>
</body>
</html>