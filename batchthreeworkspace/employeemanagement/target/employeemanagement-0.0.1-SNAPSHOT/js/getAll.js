$(document)
		.ready(
				function() {
					$("#formTab").hide();
					var empGet = function() {
						$("#empDataTable").show();
						$("#formTab").hide();
						$("#update").hide();
						$.get('findAll', function(data, status) {
							showData(data);
						});

					};

					function showData(data) {
						for (var i = 0; i < data.length; i++) {
							drawRow(data[i]);
						}
					}
					var j = 1;
					function drawRow(rowData) {
						var row = $("<tr />")
						$("#empDataTable").append(row); 
						row.append($("<td class = 'center number'>" + "SNO: "
								+ (j++) + "</td>"));
						row.append($("<td>" + rowData.eno + "</td>"));
						row.append($("<td>" + rowData.ename + "</td>"));
						row.append($("<td>" + rowData.esal + "</td>"));
						row.append($("<td>" + rowData.edob.year + "-"
								+ rowData.edob.month + "-" + rowData.edob.day
								+ "</td>"));
						row.append($("<td>" + rowData.ecity + "</td>"));

						row
								.append($("<td><button onclick='updateEmployee("
										+ rowData.eno
										+ ")'><img src='css/edit.png' alt='edit' class='iconImg'/></button></a></td>"));

						row
								.append($("<td> <button onclick='deleteEmployee("
										+ rowData.eno
										+ ")'><img src='css/delete.png' alt='edit' class='iconImg'/></button></a></td>"));
					}

					empGet();

					// Count the total employees
					$(function() {
						$("#GetCount").click(
								function() {
									var rowCount = $("#empDataTable td")
											.closest("tr").length;
									alert("No Of Employees: " + rowCount);
								});
					});

					$("#insert").click(function() {
						$("#empDataTable").hide();
						$("#update").hide();
						$("#formTab").show();
					});

					$('#submit').click(function(e) {
						// $('#formTab').html('<img src="css/loading.gif">
						// </img> <br/> Please Wait...');
						e.preventDefault();
						var ename = $("#ename").val();
						var esal = $("#esal").val();
						var edob = $("#edob").val();
						var ecity = $("#ecity").val();
						$.post('saveOrUpdate', {
							"ename" : ename,
							"esal" : esal,
							"edob" : edob,
							"ecity" : ecity
						}, function(data, status) {
							showData(data);
						});
						location.reload();
					});

					$("#findall").click(function() {

						location.reload();
					});
					
					$("#updateTab").click(function() {
						// $('#updateTab').html('<img src="css/loading.gif">
						//</img> <br/> Please Wait...');
						var eno = $("#ueno").val();
						var ename = $("#uename").val();
						var esal = $("#uesal").val();
						var edob = $("#uedob").val();
						var ecity = $("#uecity").val();
						//alert(eno + "" + ename + "" + esal + " ");
						$.post('UpdateData', {
							"eno" : eno,
							"ename" : ename,
							"esal" : esal,
							"edob" : edob,
							"ecity" : ecity
						}, function(data, status) {

							showData(data);
						});
					 location.reload();
					});
					

					$('#getid').click(
							function(e) {
								$("#empDataTable").hide();
								$("#formTab").hide();
								e.preventDefault();
								var eno = $("#eno").val();
								$.get('findById', {
									"eno" : eno
								}, function(data, status) {
									// alert("data :"+data);
									// $("#print").show();
									// findBy(data);
									$("#print").html("<td>" +
											" " + data.eno + "  " + data.ename
													+ "  " + data.esal + "  "
													+ data.edob.year + "-"
													+ data.edob.month + "-"
													+ data.edob.day + " "
													+ data.ecity)+"</td>";
								});

							});

				});
