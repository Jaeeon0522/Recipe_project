<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Enroll.do" method="POST" style="display: inherit;">  <!-- ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ -->

	 	레시피이름 : <input type = "text" name="recipename" /> <br/>
	 	종류 : <input type = "text" name="rtype" /> <br/>
	 	난이도 : <input type = "text" name="rlevel" /> <br/>
	 	조리시간 : <input type = "text" name="rtime" /> <br/>
	 	<input type="submit" value = "등록" />
	 	<input type="reset" value = "취소" />

</form>
</html>