<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="inputWb.jsp" method="post">
		<table border="1">
			<tr>
				<td>관심 언어</td>
				<td><input type="checkbox" name="lang" value="PHP">PHP
					<input type="checkbox" name="lang" value="JSP">JSP 
					<input type="checkbox" name="lang" value="ASP.NET">ASP.NET
					</td>
			</tr>
			<tr>
				<td>취미</td>
				<td><select name="hobby" size="2" multiple>
						<option value="영화">영화</option>
						<option value="운동">운동</option>
						<option value="독서">독서</option>
						<option value="기타">기타</option>
				</select>
			</tr>
		</table>
		<input type="submit" value="전송">
	</form>
</body>
</html>