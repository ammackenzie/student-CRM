<#-- @ftlvariable name="" type="uk.co.slc.cleanarch.view.CustomView" -->
<#assign colmn2lblsm = "col-lg-2 col-sm-2 col-md-2 col-form-label-sm">
<#assign colmn4lblsm = "col-lg-4 col-sm-4 col-md-4 col-form-label-sm">
<#assign colmn6lblsm = "col-lg-6 col-sm-6 col-md-6 col-form-label-sm">
<#assign colmn4lbl = "col-lg-4 col-sm-4 col-md-4 col-form-label">
<#assign colmn6lbl = "col-lg-6 col-sm-6 col-md-6 col-form-label">
<#assign colmn1 = "col-md-1 col-lg-1 col-sm-1">
<#assign colmn2 = "col-md-2 col-lg-2 col-sm-2">
<#assign colmn3 = "col-md-3 col-lg-3 col-sm-3">
<#assign colmn4 = "col-md-4 col-lg-4 col-sm-4">
<#assign colmn5 = "col-md-5 col-lg-5 col-sm-5">
<#assign colmn6 = "col-md-6 col-lg-6 col-sm-6">
<#assign colmn8 = "col-md-8 col-lg-8 col-sm-8">
<#assign colmn12 = "col-md-12 col-lg-12 col-sm-12">
<#assign showFormOnInit = true >
<#assign title = "test title" >
<!DOCTYPE html>
<html lang="en">

<head>
	<meta http-equiv="Content-type" content="text=html" charset="UTF-8">
	<title><#if title?? && title?has_content>DSA CORE :: Create Customer - ${title}</#if></title>
	<link href="/assets/css/ayTabsCss.css" rel="stylesheet">
</head>

<body class="app header-fixed sidebar-hidden aside-menu-fixed aside-menu-hidden">


<div class="app-body">
	<!-- Main content -->
	<main class="main" id="mwRecordView">
		<!-- Breadcrumb -->
		<ol id="SearchBreadCrumb" class="breadcrumb mb-0 pl-1 pb-0 pt-0">
			<li class="breadcrumb-item"><a href="/home">Home</a></li>
			<li class="breadcrumb-item"><a href="/customer/customerHome">Customer</a></li>
			<li class="breadcrumb-item">Create</li>
		</ol>
		<div class="container-fluid">
			<div class="animated fadeIn">
				<div class="row">
					<div class="col-lg-12">
						<!--/ end of card header!-->
						<div id="rowFirst" class="card-block col-lg-12">
							<div class="row col-lg-12">

								<div class="${colmn12}">
									<div class="card">
										<div class="card-header">
											<div class="btn-group float-left show">
												<div class="card-title">Customer Details</div>
											</div>
										</div>
										<div class="card-body">
											<#if title??>
											<div style="padding:8px;">
												<form id="createNewCustomerForm" method="post" enctype="application/x-www-form-urlencoded" <#if title?? && title?has_content>action='/customer/create'</#if>>
													<div class="row">
														<label class="${colmn6lbl}"><p>CRN<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " name="crn" id="crn" readonly value="<#if title?? && title?has_content>${title}</#if>"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>First Name<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " id="firstName" readonly value="<#if firstName??>${firstName}</#if>"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Last Name<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " id="lastName" readonly value="<#if lastName??>${lastName}</#if>"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Domicile<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<select class="selectpicker form-control"id="domicile" name="domicile">
																<option value="SFE">SFE</option>
																<option value="SFW">SFW</option>
															</select>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Course Start Date<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="date" class="selectpicker form-control " name="courseStartDate" id="courseStartDate"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Course End Date<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="date" class="selectpicker form-control " name="courseEndDate" id="courseEndDate"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Entitlement Start Date<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="date" class="selectpicker form-control " name="entitlementStartDate" id="entitlementStartDate"/>
															</div>
														</div>
													</div>
												</form>
													<div class="row">
														<div class="${colmn12}">
															<div class="float-right">
																<button id="submitCreateCustomerBtn" class="btn btn-primary showPointer" onclick="validateFormFields()" title="">
																	Submit
																</button>
																<a href="/customer/customerHome"><button id="cancelCreateCustomerBtn" class="btn btn-danger showPointer" onclick="" title="">
																	Cancel
																</button></a>
															</div>
														</div>
													</div>
											</div>
											</#if>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<!-- Modal -->
	</main>

</div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="/js/customerCreate.js"></script>
</body>

</html>