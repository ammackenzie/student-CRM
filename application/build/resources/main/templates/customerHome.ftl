<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Spring Boot Form Submission</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
    <h1>Customer search</h1>
        <input id="customerCrn" type="text" placeholder="Search crn">
        <button id="customerSupplierBtn" onclick="searchCustomerBtnClicked()" title="Search">
        	Search
        </button>
        <h1>Add Customer</h1>
        <#if customer?? >
            Your submitted data<br>
            CRN: ${customer.crn}<br>
            Name: ${customer.firstName} ${customer.lastName}<br>
        <#else>
            <form action="/customerHome" method="post">
                <div>CRN:</div>
                <input type="text" name="crn"/>
                <div>First Name:</div>
                <input type="text" name="firstName"/>
                <div>Last Name:</div>
                 <input type="text" name="lastName"/>
                <br/><br/>
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
            </form>
        </#if>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="/js/main.js"></script>
    </body>
</html>