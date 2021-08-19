<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ajax</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js">

    </script>
    <script>
        function a1() {
            $.post({
              // xhrFields:{
              //   withCredentials:true
              // },
              url:"${pageContext.request.contextPath}/a1",
              data:{"name":$("#username").val()},
              success:function (data) {
                alert(data);
              }
            })
        }
    </script>
  </head>
  <body>

<%--    失去焦点的时候，发起一个请求(携带信息)到后台--%>
  用户名：<input type="text" id="username" onblur="a1()">

  </body>
</html>
