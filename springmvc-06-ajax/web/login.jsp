<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>

    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"username":$('#username').val()},
                success:function (data) {
                    console.log(data);
                    if(data.toString()==="ok"){
                        $('#usernameInfo').css("color","green").html(data);
                    }else {
                        $('#usernameInfo').css("color","red").html(data);
                    }

                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"password":$('#password').val()},
                success:function (data) {
                    console.log(data);
                    if(data.toString()==="ok"){
                        $('#passwordInfo').css("color","green").html(data);
                    }else {
                        $('#passwordInfo').css("color","red").html(data);
                    }
                }
            })
        }
    </script>
</head>
<body>

<p>
    用户名：<input type="text" id="username" onblur="a1()">
    <span id="usernameInfo"></span>
</p>
<p>
    密码：<input type="text" id="password" onblur="a2()">
    <span id="passwordInfo"></span>
</p>

</body>
</html>
