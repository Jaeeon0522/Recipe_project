<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "top_menu.jsp"  %> 

	<h1> 레시피 정보를 입력하세요 </h1>
<%

		String errorMessage = (String)request.getAttribute("errorMessage");
	if(errorMessage != null){
		// 내장 참조 변수(request) 8개가 있다.
%>
	<h3 style = "color:red"> <%= errorMessage %> </h3>
	
<% } %>
	<form method = "post" action="./recipe.do">
	<!-- 입력의 경계의 form -->
	<!-- 전송하는 목적에 특별한 행위를 만든다. -->
	 	레시피이름 : <input type = "text" name="recipename" /> <br/>
	 	종류 : <input type = "text" name="rtype" /> <br/>
	 	난이도 : <input type = "text" name="rlevel" /> <br/>
	 	좋아요 : <input type = "text" name="rlike" /> <br/>
	 	조리시간 : <input type = "text" name="rtime" /> <br/>
	 	조회수 : <input type = "text" name="rclick" /> <br/>
	 	스크랩 : <input type = "text" name="rcrap" /> <br/>
	 	<input type="submit" value = "등록" />
	 	<input type="reset" value = "취소" />
	</form>
</body>
</html>