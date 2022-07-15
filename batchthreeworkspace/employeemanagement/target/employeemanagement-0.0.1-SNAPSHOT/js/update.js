function updateEmployee(eno) {
	$("#empTable").hide();
	$("#formTab").hide();
	$("#findid").hide();
	$("#empDataTable").hide();
	$("#update").show();
	// alert(eno);
	$.get('UpdateData', {
		"eno" : eno
	}, function(data) {
		showUpdateForm(data);
	});
	location.reload();
}
function showUpdateForm(myData) {
	$("#ueno").val(myData.eno);
	$("#uename").val(myData.ename);
	$("#uesal").val(myData.esal);
	$("#uedob").val(
			myData.edob.year + "-" + myData.edob.month + "-" + myData.edob.day);
	$("#uecity").val(myData.ecity);
	location.reload();
	$("#empDataTable").show();
	// console.log(data);
}
