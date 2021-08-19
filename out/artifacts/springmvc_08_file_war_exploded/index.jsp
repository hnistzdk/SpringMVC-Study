<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p>
      文件上传：
  <form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
      <input type="file" name="file">
      <input type="submit" value="upload">
  </form>
  </p>
  </body>

  <p>
      文件下载：
      <a href="/download">下载</a>
  </p>

</html>
