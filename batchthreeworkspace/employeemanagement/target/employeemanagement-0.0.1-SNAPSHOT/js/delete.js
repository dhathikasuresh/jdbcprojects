			function deleteEmployee(eno) {
				$("#empDataTable").show();
				$("#formTab").hide();
				$("#findid").hide();
				
				$.get('deleteById', {
					"eno" : eno
				}, function(data) {
					$("#print").html(data);
					alert("DELETED SUCCESS");
					location.reload();
					$("#empDataTable").show();
				});
			}