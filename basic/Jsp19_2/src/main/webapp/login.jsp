<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>로그인</title>
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
					alert("정상 가입되었습니다.")
						window.location.replace("login.jsp");
				} else {
					alert(results[0].desc);
				}
			}
		});
	}	
		</script>
</head>
<body>

<form name="LoginProcess" id="LoginProcess">
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="text" name="pw"><br>
	 <input type="button" value="로그인" onclick="form_check()">
</form>

</body>
</html>