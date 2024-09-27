<%--
  Created by IntelliJ IDEA.
  User: MBK670
  Date: 9/27/2024
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>CHào mừng bạn ${sessionScope.containsKey("userLogin")?sessionScope.get("userLogin").fullName:""} đến với trang người dùng</h1>
</body>
</html>
