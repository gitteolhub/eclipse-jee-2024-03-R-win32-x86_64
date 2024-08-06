<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko-kr">
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%-- <%=1+2+3+4+5 %> 부분은 Tomcat이 미리 처리해서 계산한 값인 15만이 html source로 나온다. --%>
1 ~ 5까지의 합 : <%= 1+2+3+4+5 %>
<%-- <%= %> 사이에 Java code를 적는것이지만 ;을 적으면 오류가 난다. 또 오류가 날시 원본 code가 그대로 드러나서 JSP는 보안이 취약하다 --%>
임의의 수(난수) : <%= Math.random() %>
</body>
</html>