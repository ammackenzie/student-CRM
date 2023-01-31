<script>
    $(document).ready(function () {
        myInit();
    });
    function myInit()
    {
		console.log("inside customerDetails myInit");
    }
	
	function redirectToCustomerEdit(id){
		window.location='/'+id+'/customerEdit';
	}
</script>