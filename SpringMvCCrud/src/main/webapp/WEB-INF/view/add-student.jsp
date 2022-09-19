<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Add student Form</h1>
		<form action="insertStudent" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Name">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="age">Age</label> <input type="text"
							class="form-control" id="age" name="age"
							placeholder="Enter Age"> 
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="course">Course</label> 
						<p>Please select your course</p>
   <input type="radio" id="html" name="course" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="course" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="javascript" name="course" value="JavaScript">
  <label for="javascript">JavaScript</label>
	<br>  

					</div>
				</div>
				</div>

			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>