<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script>	
		
		
	function form_check() {
		submit_ajax();
	}
		
	function submit_ajax() {
		var queryString = $("#LoginProcess").serialize();
		$.ajax({
			url: '/Jsp19/LoginProcess',
			type: 'POST',
			data: queryString,
			dataType: 'json',
			success: function(json) {
				var results = eval(json);
				console.log(results);
				if (results[0].result=="ok") {
					alert("회원정보가 수정 되었습니다.")
						window.location.replace("login.jsp");
				} else {
					alert(results[0].desc);
				}
			}
		});
	}	
		</script>
<title>수정</title>
</head>
<body>
<%= session.getAttribute("name") %>님의 회원정보 수정이 정상 처리 되었습니다.<br><p>
<a href="logout.jsp" >로그아웃</a> &nbsp;&nbsp; <a href="modify.jsp">정보수정</a>

</body>
</html>