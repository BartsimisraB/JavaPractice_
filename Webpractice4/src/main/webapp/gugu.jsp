<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
        var n = prompt("몇 단?");
        dan(n);
        
        function dan(n) {
            var m = parseInt(n);
            if (isNaN(m) || m < 1 || m > 9) {
                alert("잘못 입력");
                return;
            }
            else {
                    document.write(n + "단<br>");
                for (var i = 1; i <= 9; i++) {
                        document.write(n + "x" + i + "=" + n * i + "<br>");
                }
            }
        }
    </script>
</body>
</html>