<%--
  Created by Albert Cai
  User: Albert Cai
  Date: 2022/10/7
  Time: 2:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>--%>
    <%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>--%>
    <meta charset="UTF-8">
    <title>User Login</title>
</head>
<div style="text-align: center">
    <form action="login" method="post" id="loginForm">
        Name: <input type="text" name="uname" id="uname"><br>
        Password: <input type="password" name="upwd" id="upwd"><br>
        <span id="msg" style="front-size: 12px; color: red"> </span><br>
        <button type="button" id="loginBtn">Login</button>
        <button type="button">Register</button>
    </form>
</div>

<body>

</body>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<%--<script type="text/javascript" src="js/jquery/dist/jquery.js"></script>--%>

<script type="text/javascript">

    //get the element based on the document.getElementById
    var loginBtn = document.getElementById('loginBtn');

    //bond the element with eventListener
    loginBtn.addEventListener('click', function() {
        var uname = $("#uname").val();
        var upwd = $("#upwd").val();
        // judage if the name is empty
        if (isEmpty(uname)) {
            $("#span").html("LobsterLover name can't be empty");
            return;
        }

        //jude if the password is empty
        if (isEmpty(upwd)) {
            $("#span").html("LobsterLover password can't be empty");
            return;
        }

        // if the above is not empty, hand click to send the form
        $("#loginForm").submit();
    }, false);

    // empty function will check strings str is empty or not, return boolean.
    function isEmpty(str) {
        if (str==null || str.trim()==""){
            return true;
        }
        return false;
    }
</script>
</html>