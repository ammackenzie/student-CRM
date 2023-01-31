<#include "/includes/includes.ftl">
<#include "/includes/customerCreateJs.ftl">
<#assign showFormOnInit = true >
<#assign title = "test title" >
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
												<div class="card-title">Create Customer</div>
											</div>
										</div>
										<div class="card-body">
											<#if title??>
											<div style="padding:8px;">
												<form id="createNewCustomerForm" method="post" enctype="application/x-www-form-urlencoded" action='/createCustomer'>
													<div class="row">
														<label class="${colmn6lbl}"><p>CRN<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " name="crn" id="crn" value="<#if title??>${title}</#if>" maxlength="11"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>First Name<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " id="firstName" name="firstName" value="<#if firstName??>${firstName}</#if>"/>
															</div>
														</div>
													</div>
													<div class="row">
														<label class="${colmn6lbl}"><p>Last Name<b style="color:red;">*</b></p></label>
														<div class="${colmn6}">
															<div class="form-group row">
																<input type="text" class="selectpicker form-control " id="lastName" name="lastName" value="<#if lastName??>${lastName}</#if>"/>
															</div>
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
												</form>
													<div class="row">
														<div class="${colmn12}">
															<div class="float-right">
																<button id="submitCreateCustomerBtn" class="btn btn-primary showPointer" onclick="validateFormFields()" title="">
																	Submit
																</button>
																<a href="/customerHome"><button id="cancelCreateCustomerBtn" class="btn btn-danger showPointer" onclick="" title="">
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
</body>

</html>