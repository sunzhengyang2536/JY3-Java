<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/5/2019
  Time: 下午 2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <table border="1px">
      <thead>
        <th>用户名</th>
        <th>密码</th>
      </thead>
      <c:forEach items="${users}" var="user" >
         <tr>
           <td>${user.userName}</td>
           <td>${user.psw}</td>
         </tr>
      </c:forEach>
    </table>
  </body>
</html>
