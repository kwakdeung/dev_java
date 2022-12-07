<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">		
		<form action="reply.do" method="post">
			<input type="hidden" name="bId"      value="${reply_view.bId}">
			<input type="hidden" name="bGroup"   value="${reply_view.bGroup}">
			<input type="hidden" name="bStep"    value="${reply_view.bStep}">
			<input type="hidden" name="bIndent"  value="${reply_view.bIndent}">
			<tr>
				<td> 번호 </td>
				<td> ${reply_view.bId} </td>
			</tr>
			<tr>	
				<td> 히트 </td>
				<td> ${reply_view.bHit} </td>
			</tr>	
				<td> 이름 </td>
				<td> <input type="text" name="bName" value="${reply_view.bName}"></td>
			</tr>	
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value="${reply_view.bTitle}"></td>
			</tr>	
				<td> 내용 </td>
				<td> 
					<textarea rows="10" name="bContent" id="summernote">${reply_view.bContent}</textarea>
					<script>
				      $('#summernote').summernote({
				        placeholder: 'Hello Bootstrap 4',
				        tabsize: 2,
				        height: 100
				      });
				    </script> 
				</td>			
			</tr>		
			<tr>		
				<td colspan="2"> <input type="submit" value="답변"> 
				<a href="list.do?page=<%= session.getAttribute("cpage") %>">목록</a></td>	
			</tr>		
		</form>
		
	</table>
</body>
</html>