<script>
    $(document).ready(function () {
        myInit();
    });
    function myInit()
    {
		console.log("inside customerCreate myInit");
    }
	function validateFormFields(){
		if(validateFields()){
			console.log("validate fields success");
			$("#createNewCustomerForm").submit();
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
</script>