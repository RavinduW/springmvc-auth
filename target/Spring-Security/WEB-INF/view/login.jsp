<%--
  Created by IntelliJ IDEA.
  User: ravindu_c
  Date: 10/22/2019
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Spring MVC Security</title>
</head>
<body>
    <h4>Login</h4>
    <br/>
    <form:form method="post" action="${pageContext.request.contextPath}/authenticateTheUser">

        <label>Username</label><br/>
        <input name="username" type="text" /><br/>
        <br/>
        <label>Password</label><br/>
        <input  name="password" type="password" /><br/>

        <br/>
        <button type="submit">Login</button>

    </form:form>
</body>
</html>
