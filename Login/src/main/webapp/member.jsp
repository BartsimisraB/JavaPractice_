<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css"></style>
<script type="text/javascript" src="./script/login.js"defer></script>
</head>
<body><center>
<form action="memberProc.jsp" name="frm">
   <table border="1">
      <tr>
         <td>아이디<span class="required">*</span></td>
         <td><input type="text" name="id">
         <input type="button" name="checkid" value="중복확인" onclick="open_win('idCheck.jsp', 'id')" ></td>
      </tr>
      <tr>
         <td>비밀번호<span class="required">*</span></td>
         <td><input type="password" name="pwd"></td>
      </tr>
      <tr>
         <td>비밀번호 확인<span class="required">*</span></td>
         <td><input type="password" name="pwd1"></td>
      </tr>
      <tr>
         <td>이름<span class="required">*</span></td>
         <td><input type="text" name="name"></td>
      </tr>
      <tr>
         <td>성별<span class="required">*</span></td>
         <td><input type="radio" name="gender" value="M">남<input type="radio" name="gender" value="W">여</td>
      </tr>
      <tr>
         <td>생년월일<span class="required">*</span></td>
         <td><input type="text" name="birth"> ex)900323</td>
      </tr>
      <tr>
         <td>Email<span class="required">*</span></td>
         <td><input type="text" name="email"></td>
      </tr>
      <tr>
         <td>우편번호</td>
         <td><input type="text" name="zipcode" id="zipcode">&nbsp;<input type="button" name="findZipcode" value="우편번호 찾기"
         onclick="open_win('zip.jsp', 'zipcode')" ></td>
      </tr>
      <tr>
         <td>주소</td>
         <td><input type="text" name="address" id="address"></td>
      </tr>
      <tr>
         <td>취미</td>
         <td><input type="radio" name="hobby" value="web">인터넷
         <input type="radio" name="hobby" value="trip">여행
         <input type="radio" name="hobby" value="game">게임
         <input type="radio" name="hobby" value="movie">영화
         <input type="radio" name="hobby" value="health">운동</td>
      </tr>
      <tr>

         <td>직업</td>
         <td><select name="job">
            <option>선택하세요</option>
            <option value="student">학생</option>
            <option value="nothing">무직</option>
            <option value="developer">개발자</option>
            <option value="teacher">교사</option>
         </select></td>
      </tr>
      <tr>
      <td><input type="submit" value="회원가입" onclick="return loginCheck()">&nbsp;<input type="reset" value="다시쓰기"></td>
      </tr>
      
   </table>

</form>
</center>
</body>
</html>