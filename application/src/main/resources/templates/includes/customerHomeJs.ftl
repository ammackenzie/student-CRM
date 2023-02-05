<script>
    var myCustomersTable;

	$(document).ready(function () {
        myInit();
    });
	
    function myInit()
    {
		console.log("inside customerHome myInit");
		renderOnce();
		$('#createCustomerBtn').prop('disabled',true).css('opacity',0.5);
    }
 /*   function searchCustomerBtnClicked(paymentId){
        var crn = $("#customerCrn").val();
        $.get("/" + crn + "/customerSearch", function (data) {
            console.log("data:" + data)
        });
        /*	$.ajax({
            type: "GET",
            dataType: 'json',
            url: "/" + crn + "/customerSearch",
            success: function (data) {
                console.log("data:" + data)
            }
        });*/

    //}
	var globalname;
	function searchCustomerBtnClicked(){
		var searchedForName = $('#customerCrn').val();

		if (searchedForName.length > 0){
			globalName = searchedForName;
			findAllContains(searchedForName);

		}
	}
	
	function searchBarListenerPostSearch(){
		$('#customerCrn').on('input', function() {
			$('#createCustomerBtn').prop('disabled',true).css('opacity',0.5);
		});
	}


	function updateButton(){
		if(myCustomersTable != null) {
			if (myCustomersTable.page.info().recordsDisplay > 0) {
				$('#createCustomerBtn').prop('disabled',true).css('opacity',0.5);
			} else {
				$('#createCustomerBtn').prop('disabled',false).css('opacity',1.0);
			}
		}
	}

	function findAllContains(name){
		if(validateCustomerCrn(name)){
			myCustomersTable.destroy();
			renderPartialDataTable(name);
		}else{
			alert("error",'Please only enter letters, numbers for Customer CRN');
		}
	}
	
	function validateCustomerCrn(name){
		var re = new RegExp("^([a-zA-Z0-9 ]{0,})$");
		if (re.test(name)) {
			return true;
		} else {
			alert("error",'Please only enter letters, numbers for Customer crn');
			return false;
		}
	}
    function createCustomerBtnClicked(){
        var crn = $("#customerCrn").val();
        window.location='/'+ crn +'/customerCreate';
    }
	
	function redirectToCustomerDetails(id){
        window.location='/'+id+'/customerDetails';
    }
	
	function renderOnce(){
		var data = "";
		myCustomersTable = $('#chaserConfigTbl').DataTable(
				{
					data: data,
					colReorder: false,
					order: [[ 0, 'desc' ]],
					pageLength: 10,
					"searching": false,
					"language": {"emptyTable": " "},
					drawCallback: function(settings) {

						var pagination = $(this).closest('.dataTables_wrapper').find('.dataTables_paginate');
						if($('.dataTables_empty').is(':visible') == true)
						{
							pagination.toggle(false);//this.api().page.info().pages > 1);
						}
						else if(this.api().page.info().pages > 1){
							pagination.toggle(true);
						}else
						{
							pagination.toggle(false);
						}

					},
					columns: [
						{title: "CRN", "data": "crn", "defaultContent": "","bSortable":true,"bSearchable": true},
						{title: "First Name", "data": "firstName", "defaultContent": "","bSortable":true,"bSearchable": true},
						{title: "Last Name", "data": "lastName", "defaultContent": "","bSortable":true,"bSearchable": true},
						{title: "Course Start Date", "data": "courseStartDate", "defaultContent": "","bSortable":true,"bSearchable": true,"sClass": "makeCenterAlign"},
						{title: "Course End Date", "data": "courseLastDate", "defaultContent": "","bSortable":true,"bSearchable": true,"sClass": "makeCenterAlign"},
					]
				}
		);

		$("#chaserConfigTbl").show();
	}
	
	function renderPartialDataTable(name) {
		$.ajax({
			"url":  "" + name + "/containsView",
			"type": "GET",
			"contentType": "application/json"
		}).done(function (data) {

			if (data.length != 3323) {
				myCustomersTable = $('#chaserConfigTbl').DataTable(
						{
							data: data,
							colReorder: false,
							order: [[ 0, 'desc' ]],
							pageLength: 10,
							"searching": false,
							"language": {"emptyTable": "No matching customer records found"},
							drawCallback: function(settings) {

								var pagination = $(this).closest('.dataTables_wrapper').find('.dataTables_paginate');
								if($('.dataTables_empty').is(':visible') == true)
								{
									pagination.toggle(false);//this.api().page.info().pages > 1);
								}
								else if(this.api().page.info().pages > 1){
									pagination.toggle(true);
								}else
								{
									pagination.toggle(false);
								}

							},
							columns: [
								{title: "CRN", "data": "crn", "defaultContent": "","bSortable":true,"bSearchable": true},
								{title: "First Name", "data": "firstName", "defaultContent": "","bSortable":true,"bSearchable": true},
								{title: "Last Name", "data": "lastName", "defaultContent": "","bSortable":true,"bSearchable": true},
								{title: "Course Start Date", "data": "courseStartDate", "defaultContent": "","bSortable":true,"bSearchable": true},
								{title: "Course End Date", "data": "courseEndDate", "defaultContent": "","bSortable":true,"bSearchable": true},
								{title: " ", "data": "name", "defaultContent": "","bSearchable": false,"bSortable": false,sWidth: "20%",
									render: function (data, type, row) {
										try{
											//return " <button class='btn btn-warning showPointer' onclick='javascript:redirectToSupplierDetails(\""+row.name+"\");'> Details </button>"
											return " <button class='btn btn-warning showPointer' onclick='javascript:redirectToCustomerDetails(\""+row.id+"\");'> Details </button>"
										}catch (e){return "";}
									}
								},

							]
						}
				);
			} else {
				//window.location.replace("/login");
			}



			$("#chaserConfigTbl").show();
			updateButton();
			searchBarListenerPostSearch();
		});
	}

</script>