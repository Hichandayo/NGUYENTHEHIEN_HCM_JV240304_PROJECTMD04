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
    <title>Register</title>
    <jsp:include page="../layout/head.jsp"/>
</head>
<body>
<div class="container m-5 p-2" style="max-width: 60%">
    <h2>Đăng ki</h2>
    <form method="post" action="/register">
        <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" name="username" id="username">
        </div> <div class="mb-3">
        <div class="mb-3">
            <label for="pasword" class="form-label">Password</label>
            <input type="password" class="form-control" name="password" id="pasword">
        </div>
        <div class="mb-3">
            <label for="confirmPass" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" name="confirmPassword" id="confirmPass">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp">
        </div>
        <label for="fullname" class="form-label">Fullname</label>
        <input type="text" class="form-control" id="fullname" name="fullName">
    </div>
        <div class="mb-3">
            <label for="phone" class="form-label">Phone</label>
            <input type="text" class="form-control" name="phone" id="phone" >
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" id="address" name="address">
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>

<jsp:include page="../layout/foot.jsp"/>
</body>
</html>
