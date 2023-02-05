<script>
    $(document).ready(function () {
        myInit();
    });
    function myInit()
    {
		console.log("inside customerCreate myInit");
    }
	function validateFormFields(){
		if(validateFields() && checkIfCustomerAlreadyExists($("#crn").val())){
			$("#createNewCustomerForm").submit();
		}else{
		}
	}
	function validateFields(){
		var errorField = false;
		if(($("#crn").val().length) !=11){
			alert('CRN must be 11 digits');
			errorField = true;
		}
		if(!checkDates($("#courseStartDate").val(), $("#courseEndDate").val())){
			errorField = true;
		}
		if(!validateCourseDuration($("#courseStartDate").val(), $("#courseEndDate").val())){
			alert('Course duration cannot exceed 21 years');
			errorField = true;
		}
		return !errorField;
	}
	
	function checkIfCustomerAlreadyExists(crn){
		var result;
		$.ajax({
			type: "GET",
			dataType: 'json',
			url: "/" + crn + "/customerSearch",
			success: function (data) {
				result = data;
			},
			async: false
		});
		if ($.trim(result) == '' ) {
			return true;
		} 
		else { 
			alert("Customer already exists for CRN: " + crn);
			return false;
		} 
	}
</script>