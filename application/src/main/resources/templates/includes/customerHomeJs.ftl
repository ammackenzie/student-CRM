<script>
    $(document).ready(function () {
        myInit();
    });
    function myInit()
    {
		console.log("inside customerHome myInit");
    }
    function searchCustomerBtnClicked(paymentId){
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

    }

    function createCustomerBtnClicked(){
        var crn = $("#customerCrn").val();
        window.location='/customerCreate';

    }

</script>