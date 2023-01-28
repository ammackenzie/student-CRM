<#include "/includes/includes.ftl">
<#include "/includes/customerHomeJs.ftl">
<#assign showFormOnInit = true >
<#assign title = "test title" >
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-type" content="text=html" charset="UTF-8">
	<title>Customer Search</title>
</head>

<body class="app header-fixed sidebar-hidden aside-menu-fixed aside-menu-hidden">
<div class="app-body">
	<!-- Main content -->
	<main class="main" id="mwRecordView">
		<!-- Breadcrumb -->
		<ol id="SearchBreadCrumb" class="breadcrumb mb-0 pl-1 pb-0 pt-0">
			<li class="breadcrumb-item"><a href="/customerHome">Home</a></li>
			<li class="breadcrumb-item"><a href="/customer/customerHome">Customer</a></li>
			<li class="breadcrumb-item">Create</li>
		</ol>
		<div class="container-fluid">
			<div class="animated fadeIn">
				<div class="row">
					<div class="col-lg-12">
						<div id="rowFirst" class="card-block col-lg-12">
							<div class="row col-lg-12">
								<div class="${colmn12}">
									<div class="card">
										<div class="card-header">
											<div class="btn-group float-left show">
												<div class="card-title">Customer Search</div>
											</div>
										</div>
										<div class="card-body">
											<div style="padding:8px;">
												<div class="row">
													<label class="${colmn2lblsm}"><p>CRN<b style="color:red;">*</b></p></label>
													<div class="${colmn4}">
														<div class="form-group row">
															<input type="text" class="selectpicker form-control " name="customerCrn" id="customerCrn" value="" placeholder="CRN" maxlength="11"/>
														</div>
													</div>
													<div class="${colmn6}">
														<div class="float-right">
															<button id="searchCustomerBtn" class="btn btn-primary showPointer" onclick="searchCustomerBtnClicked()" title="">
																Search
															</button>
															<button id="createCustomerBtn" onclick="createCustomerBtnClicked()" class="btn btn-success showPointer" onclick="" title="">
																Create
															</button>
														</div>
													</div>
												</div>
											</div>
										</div>
										<div class="card-body">

											<div style="padding:8px;">
												<table id="chaserConfigTbl" class="table table-striped table-bordered table-hover"
													   cellspacing="0">
													<thead>
													<tr>
														<th>Report Id</th>
														<th>Report Id</th>
														<th>Report Id</th>
														<th>Report Id</th>
														<th>Report Id</th>

														<th>Report Id</th>

													</tr>
													</thead>
												</table>
												<div style="clear:both;">&nbsp;</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</main>
</div>

</body>
<!--
    <body>
    <h1>Customer search</h1>
        <input id="customerCrn" type="text" placeholder="Search crn">
        <button id="customerSupplierBtn" onclick="searchCustomerBtnClicked()" title="Search">
        	Search
        </button>
		<button id="customerSupplierBtn"  title="Search">
        	Create
        </button>
        <h1>Spring Boot Form Submission</h1>
        <#if customer?? >
            Your submitted data<br>
            CRN: ${customer.crn}<br>
            Name: ${customer.firstName} ${customer.lastName}<br>
        <#else>
        </#if>
    </body>
	-->
</html>