<#include "/includes/includes.ftl">
<#include "/includes/customerEditJs.ftl">
<#assign showFormOnInit = true >
<#assign title = "test title" >
<#assign currentCustomer = customer] >
<!DOCTYPE html>
<html lang="en">

<head>
	<meta http-equiv="Content-type" content="text=html" charset="UTF-8">
	<title><#if title??>Create Customer - ${title}</#if></title>
</head>

<body class="app header-fixed sidebar-hidden aside-menu-fixed aside-menu-hidden">


<div class="app-body">
	<!-- Main content -->
	<main class="main" id="mwRecordView">
		<!-- Breadcrumb -->
		<ol id="SearchBreadCrumb" class="breadcrumb mb-0 pl-1 pb-0 pt-0">
			<li class="breadcrumb-item"><a href="/customerHome">Home</a></li>
			<li class="breadcrumb-item"><a onclick="<#if currentCustomer.getId()??>onclick="redirectToCustomerDetails('${currentCustomer.getId()}')"</#if>redirectToCustomerDetails()">Customer Details</a></li>
			<li class="breadcrumb-item">Edit</li>
		</ol>
		<div class="container-fluid">
			<div class="animated fadeIn">
				<div class="row">
					<div class="col-lg-12">
						<!--/ end of card header!-->
						<div id="rowFirst" class="card-block col-lg-12">
						<div class="row col-lg-12">
							<div class="card  col-md-12">
								<div class="card-header">
									<div class="btn-group float-left show">
										<div class="btn-group float-left show">
											<b>Customer Details</b>
										</div>
									</div>
								</div>
								<div id="collapseBodyTypeDetails" class="collapse show" aria-labelledby="heading-example">
									<#if currentCustomer??>
										<div class="card-body">
											<#if currentCustomer??>
											<form id="updateCustomerForm" method="post" enctype="application/x-www-form-urlencoded" action='/updateCustomer'>
												<div class="row">
													<div class="col-lg-4">
														<div class="row">
															<label class="${colmn4lbl}">CRN:</label>
															<div class="${colmn8}">
																<div class="form-group row">
																	<input type="text" id="crn" class="selectpicker form-control" name="crn" readonly value='<#if currentCustomer.getCrn()??>${currentCustomer.getCrn()}</#if>'>
																</div>
															</div>
														</div>
														<div class="row">
															<label class="${colmn4lbl}">First Name:</label>
															<div class="${colmn8}">
																<div class="form-group row">
																	<input type="text" id="firstName" class="selectpicker form-control" name="firstName" value='<#if currentCustomer.getFirstName()??>${currentCustomer.getFirstName()}</#if>'>
																</div>
															</div>
														</div>
														<div class="row">
															<label class="${colmn4lbl}">Last Name:</label>
															<div class="${colmn8}">
																<div class="form-group row">
																	<input type="text" id="lastName" class="selectpicker form-control" name="lastName"  value='<#if currentCustomer.getLastName()??>${currentCustomer.getLastName()}</#if>'>
																</div>
															</div>
														</div>
													</div>
													<div class="col-lg-4">
														<div class="row">
															<label class="${colmn4lbl}">Course Start Date:</label>
															<div class="${colmn8}">
																<div class="form-group row">
																	<input type="date" id="courseStartDate" class="selectpicker form-control" name="courseStartDate" value='<#if currentCustomer.getCourseStartDateAsInputString()??>${currentCustomer.getCourseStartDateAsInputString()}</#if>'>
																</div>
															</div>
														</div>
														<div class="row">
															<label class="${colmn4lbl}">Course End Date:</label>
															<div class="${colmn8}">
																<div class="form-group row">
																	<input type="date" id="courseEndDate" class="selectpicker form-control" name="courseEndDate" value='<#if currentCustomer.getCourseEndDateAsInputString()??>${currentCustomer.getCourseEndDateAsInputString()}</#if>'>
																</div>
															</div>
														</div>
													</div>
												</div>
											</form>	
											</#if>
										</div>
										<div class="card-footer">
											<div class="row">
												<div class="${colmn12}">
													<div class="float-right">
															<button type="button" id="editCustomerBtn" class="btn btn-primary showPointer" onclick="validateFormFields()" title="Edit" >
																Submit
															</button>
														<a ><button id="cancelEditCustomerBtn" class="btn btn-danger showPointer" onclick="<#if currentCustomer.getId()??>redirectToCustomerDetails('${currentCustomer.getId()}')</#if>" title="">
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
		<!-- Modal -->
	</main>

</div>
</body>

</html>