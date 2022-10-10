<%--
  Created by Albert Cai.
  User: user
  Date: 2022/10/9
  Time: 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lobster Web Access</title>
</head>
<div style="text-align: center">
    <form action="login" method="post" id="loginForm">
        Name: <input type="text" name="uname" id="uname"
                     value="${messageModel.object.lobsterClientName}"><br>
        Password: <input type="password" name="upwd" id="upwd"
                         value="${messageModel.object.lobsterClientPwd}"><br>
        <span id="lobsterClientName" style="front-size: 12px; color: red">
            ${messageModel.object.lobsterClientName}</span><br>
        <span id="lobsterClientPwd" style="front-size: 12px; color: red">
            ${messageModel.object.lobsterClientPwd}</span><br>
        <span id="msg" style="front-size: 12px; color: red">
            ${messageModel.msg}</span><br>
        <button type="button" id="loginBtn">Login</button>
        <button type="button">Register</button>
    </form>
</div>
<body>
<script src="js/jquery-3.4.1.js"></script>
<script>
    alert("Welcome to lobster web site, please login or register!");
    $("#loginBtn").click(function () {
        uname = $("#uname").val();
        upwd = $("#upwd").val();
        // judage if the name is empty
        if (isEmpty(uname)) {
            $("#msg").html("Lobster client name can't be empty");
            return;
        }
        //jude if the password is empty
        if (isEmpty(upwd)) {
            $("#msg").html("Lobster client password can't be empty");
            return;
        }
        $("#loginForm").submit();
    });
    // empty function will check strings str is empty or not, return boolean.
    function isEmpty(str) {
        if (str==null || str.trim()==""){
            return true;
        }
        return false;
    }
</script>
</body>
</html>