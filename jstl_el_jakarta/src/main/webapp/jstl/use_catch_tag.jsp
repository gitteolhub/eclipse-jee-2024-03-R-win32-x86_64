<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>catch 태그</title>
</head>
<body>

<c:catch var="ex">
name 파라미터의 값 = <%= request.getParameter("name") %><br>
<%  if (request.getParameter("name").equals("test")) {  %>
${param.name}은 test 입니다.
<%  }   %>
</c:catch>
<p>
<c:if test="${ex != null}">
예외가 발생하였습니다:<br>
${ex}
</c:if>

</body>
</html>
