<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="./Join.css">
    <script defer src="Join.js"></script>
</head>
<body>
    <form method="post" action="JoinServlet" name="fr">
      <div>
        <label class="topic">이름</label><span>*</span> <input type="text" name="name" placeholder="이름 입력"/>
      </div>
      <div>
        <label class="topic">주민등록번호</label><span>*</span> <input type="text" name="pernum1" placeholder="주민번호 입력"/> - <input type="password" name="pernum2" /> 
      </div>
      <div>
        <label class="topic">아이디</label><span>*</span> <input type="text" name="id" placeholder="아이디 입력"/>
      </div>
      <div>
        <label class="topic">비밀번호</label><span>*</span> <input type="password" name="pw" placeholder="비밀번호 입력"/>
      </div>
      <div>
        <label class="topic">비밀번호 확인</label><span>*</span> <input type="password" name="pwcheck" placeholder="비밀번호 입력"/>
      </div>
      <div>
        <label class="topic">이메일</label>
        <input type="text" name="email1" id="email1"/>@
        <input type="text" name="email2" id="email2"/>
        <select name = "selectEmail" id="selectEmail" onChange="checkemail();">
         	<option value="1">직접 입력</option>
         	<option value="naver.com" selected>naver.com</option>
	 		<option value="hanmail.net">hanmail.net</option>
	 		<option value="nate.com">nate.com</option>
	 		<option value="gmail.com">gmail.com</option>
        </select>
      </div>
      <div>
        <label class="topic">우편번호</label><input type="text" name="addrnum"placeholder="우편번호 - 포함"/>
      </div>
      <div>
        <label class="topic">주소</label><input type="text" name="addr1" placeholder="주소 입력"/> <input type="text" name="addr2"/>
      </div>
      <div>
        <label class="topic">핸드폰번호</label><input type="tel" name="phone" placeholder="전화번호 입력"/>
      </div>
      <div>
        <label class="topic" for="job">직업</label>
        <select id="job" name="job" size="3" >
            <option value="학생">학생</option>
            <option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
            <option value="언론">언론</option>
        </select>
      </div>
      <div>
        <label class="topic" for="info">메일/SMS 정보 수신</label>
            <input type="radio" name="info" id="info" value="ok" checked/>수신
            <input type="radio" name="info" id="info" value="no" />수신거부
      </div>
        <input id="confirm" type="button" value="회원가입" onclick="checkform()" onsubmit="return false">&nbsp;&nbsp;<input type="reset" value="취소">
    </form>
</body>
</html>