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
    <title>Login</title>
    <jsp:include page="../layout/head.jsp"/>
</head>
<body>
<div class="container m-5 p-2" style="max-width: 60%">
    <h2>Login</h2>
    <form method="post" action="/login">
        <div class="mb-3">
            <label for="username" class="form-label">username</label>
            <input type="text" class="form-control" name="username" id="username" >
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" name="password" id="password">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>

<jsp:include page="../layout/foot.jsp"/>
</body>
</html>
