<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>dateFormat 태그 사용</title>
</head>
<body>

<c:set var="now" value="<%= new java.util.Date() %>" />
<fmt:formatDate value="${now}" type="date" dateStyle="full" /> <br>
<fmt:formatDate value="${now}" type="date" dateStyle="short" /> <br>
<fmt:formatDate value="${now}" type="time" /> <br>
<fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" /> <br>
<fmt:formatDate value="${now}" pattern="z a h:mm" /> <br>

</body>
</html>
