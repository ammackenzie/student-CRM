(function(){
  console.log("Hello FreeMarker Form!");
})();

	function searchCustomerBtnClicked(paymentId){
		var crn = $("#customerCrn").val();
		console.log("crn: " + crn);
		$.get("/" + crn + "/customerSearch", function (data) {
		    if(!$.trim(data)){
		        alert("No customer found for crn: " + crn);
		    }else{
                console.log("firstName:" + data.firstName);
                console.log("lastName:" + data.lastName);
            }

        });
       	/*	$.ajax({
			type: "GET",
			dataType: 'json',
			url: "/" + crn + "/customerSearch",
			success: function (data) {
				console.log("data:" + data)
			}
		});*/

	}

	function fillCustomerFields(data){

	}