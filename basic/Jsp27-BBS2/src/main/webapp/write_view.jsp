<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.ckeditor.com/4.16.2/standard/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP/Servlet</title>
</head>
<body>
	
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<!-- cellpadding = 칸 안쪽 여백, cellspacing = 칸과 칸 사이의 여백 -->
		<form action="write.do" method="post">		
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" size = "50"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> 
				<textarea name="bContent" id="editor1" rows ="10" cols="80">
				</textarea>
                <script>
                 CKEDITOR.replace( 'editor1' );
                </script>
            </td>
			</tr>
				
			<tr >
				<td colspan="2">
					<input type="submit" value ="입력"> &nbsp;&nbsp;
					<a href="list.do">목록보기</a>
				</td>
			</tr>	
		</form>
	</table>
</body>	
</html>