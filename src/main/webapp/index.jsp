<%--
  Created by IntelliJ IDEA.
  User: 23216
  Date: 2020/6/24
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="account/findAll">查看所以账户信息</a>

    <form action="onefile" method="post" enctype="multipart/form-data">
        <input type="file" name="myfile"/><br/>
        <input type="text" name="description"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
