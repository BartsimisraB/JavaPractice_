
function checkform() {
	if (document.fr.name.value == "") {
		alert("이름을 입력하세요");
		history.go(-1);
	}
	else if (document.fr.pernum1.value == "" || document.fr.pernum2.value == "") {
		alert("주민번호를 전부 입력하세요");
		history.go(-1);
	}
	else if (document.fr.id.value == "") {
		alert("아이디를 입력하세요");
		history.go(-1);
	} 
	else if (document.fr.pw.value == "") {
		alert("비밀번호를 입력하세요.");
		history.go(-1);
	} 
	else if (document.fr.pw.value != document.fr.pwcheck.value) {
		alert("비밀번호가 일치하지 않습니다");
		history.go(-1);
	}
	else if (document.fr.id.length <= 4) {
		alert("아이디는 4글자 이상 입력해 주세요");
		history.go(-1);
	}
	else if (document.fr.addrnum.value.indexOf('-') == -1) {
		alert("우편번호는 - 를 포함해 작성해 주세요");
		history.go(-1);
	}
	else if (document.fr.phone.value.indexOf('-') == -1) {
		alert("핸드폰 번호는 - 를 포함해 작성해 주세요");
		history.go(-1);
	}
	else {
		document.fr.submit();
	}

}

function checkemail() {
	if (document.fr.selectEmail.value == '1') {
		document.fr.email2.readOnly = false;
		document.fr.email2.value = '';
		document.fr.email2.focus();
	}
	else {
		document.fr.email2.readOnly = true;
		document.fr.email2.value = document.fr.selectEmail.value;
	}
}

