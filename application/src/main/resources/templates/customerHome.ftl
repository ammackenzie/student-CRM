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
		<button id="customerSupplierBtn" onclick="createCustomerBtnClicked()" title="Search">
        	Create
        </button>
        <h1>Spring Boot Form Submission</h1>
        <#if customer?? >
            Your submitted data<br>
            CRN: ${customer.crn}<br>
            Name: ${customer.firstName} ${customer.lastName}<br>
        <#else>
        </#if>
        <#include "/includes/includes.ftl">
		<#include "/includes/customerHomeJs.ftl">
    </body>
</html>