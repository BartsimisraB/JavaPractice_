function ch() {
	if (document.fr.id == "") {
		alert("공백");
		return false;
	}
	else if (document.fr.age == "") {
		alert("나이 입력 해라");
		return false;
	}
	else if (isNaN(document.fr.age.value)) {
		alert("숫자로 입력해라");
		return false;
	}
	else {
		return true;
	}
}