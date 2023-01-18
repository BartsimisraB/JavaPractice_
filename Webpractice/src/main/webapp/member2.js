function check() {
	if (document.f.age == "") {
		alert("나이 입력");
		return false;
	}
	else if (isNaN(document.f.age.value)) {
		alert("나이는 숫자로 입력");
		document.f.age.innerText = "";
		return false;
	}
	else {
		return true;
	}
}