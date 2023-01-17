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
	function checkDates(startDate, endDate){
		var d1 = new Date(startDate);
		var d2 = new Date(endDate);
		var dateValidation =(d1<d2);
		var startDate = !startDate;
		var endDate = !endDate;
		if(startDate){
			alert('Start date cannot be blank');
		}
		if(endDate){
			alert('End date cannot be blank');
		}
		if(!dateValidation){
			alert('Course end date cannot be earlier than start date');
		}
		return !startDate && !endDate && dateValidation;
	}
	function validateCourseDuration(startDate, endDate){
		var d1 = new Date(startDate);
		var d2 = new Date(endDate);
		var dateValidation =(d1<d2);
		var startYear = d1.getYear();
		var endYear = d2.getYear();
		return !(endYear > (startYear+17));
	}
</script>