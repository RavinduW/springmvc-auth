<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ravindu_c
  Date: 10/22/2019
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Security</title>
</head>
<body>
    <h4>Index</h4>
    <br/>
    <p>
        User:<security:authentication property="principal.username"/>
        <br/><br/>
        Roles:<security:authentication property="principal.authorities"/>
    </p>
    <form:form action="${pageContext.request.contextPath}/logout" method="post">
        <input type="submit" value="Logout" />
    </form:form>
</body>
</html>
