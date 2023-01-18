function check(value) {
	if (value == null || value.length == 0 || value == "") {
		return false;
	}
	return true;
}

function emptycheck() {
	var id = document.getElementsByName("id")[0];
	var age = document.getElementsByName("age")[0];

	if (check(id.value) || check(age.value)) {
		alert("모두 입력하세요");
		return false;
	}
	if (age.value.equals("")) {
		alert("나이를 입력하세요.");
		return false;
	}
	return true;
}