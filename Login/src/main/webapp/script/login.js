function open_win(url, name) {
	window.open(url, name, "width=500, height=230");
}
function loginCheck() {
	if (document.frm.id.value == "") {
		alert("id를 입력하세요.");
		return false;
	}
	else if (document.frm.pwd.value == "") {
		alert("패스워드를 입력하세요.");
		return false;
	}
	else if (document.frm.pwd1.value == "") {
		alert("패스워드를 입력하세요.");
		return false;
	}
	else if (document.frm.pwd.value != document.frm.pwd1.value) {
		alert("패스워드가 일치하지 않습니다.")
		return false;
	}
	else if (document.frm.name.value == "") {
		alert("이름을 입력하세요.");
		return false;
	}
	else if (document.frm.gender.value == "") {
		alert("성별을 입력하세요.");
		return false;
	}
	else if (document.frm.birth.value == "") {
		alert("생년월일을 입력하세요.");
		return false;
	}
	else if (document.frm.email.value == "") {
		alert("이메일을 입력하세요.");
		return false;
	}
	else {
		alert("회원가입이 완료되었습니다.");
		return true;
	}
}
function login() {
	if (document.form.id.value.equals(document.form.input_id.value)
		&& document.form.pwd.value.equals(document.form.input_pwd.value)) {
		alert("아이디와 비밀번호가 존재하지 않습니다.");
		return false;
	}
	return true;
}

function blankCheck(f) {
	var id = f.id.value;
	id = id.trim();
	if (id.length < 3) {
		alert("아이디는 3자 이상 입력해주십시오.");
		return false;
	}
	return true;
}

function checkValue(f) {
	if (!f.id.value) {
		alert("아이디를 입력하세요");
		inputForm.id.focus();
		return false;
	}
	if (!f.pw.value) {
		alert("비밀번호를 입력하세요");
		inputForm.password.focus();
		return false;
	}
	alert("로그인 되었습니다.");
	return true;
}

function goJoinForm() {
	location.href = "member.jsp";
}

function idCheck() {
	if (document.frm.id.value.equals(document.frm.inputid.value)) {
		alert("이미 존자하는 아이디입니다.");
		return false;
	}
	return true;
}

function logoutPro() {
	location.href = "logoutProc.jsp";
}

function research() {
	if (document.frm.zipcode.value.length == 0) {
		alert("우편번호를 입력하세요");
		return false;
	}
	return true;
}

function apply(id) {
	opener.document.frm.id.value = id;
	window.close();
}

