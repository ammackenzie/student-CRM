(function(){
  console.log("Hello FreeMarker Form!");
})();

	function searchCustomerBtnClicked(paymentId){
		var crn = $("#customerCrn").val();
		console.log("crn: " + crn);
		alert(crn);
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

	}

    function createCustomerBtnClicked(){
        var crn = $("#customerCrn").val();
        window.location='/customerCreate';

    }