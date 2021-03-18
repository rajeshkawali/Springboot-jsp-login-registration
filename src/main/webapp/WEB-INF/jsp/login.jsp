<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Webonise</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div>
		<a class="button btn btn-info" href="/registration">Register</a>
	</div>
	<div class="container">
	<h3> ${message}</h3>
		<form:form method="post" action="login" modelAttribute="user">
			<div class="col-xs-4">
			<fieldset class="form-group">
				<form:label path="username">User Name</form:label>
				<form:input path="username" type="text" class="form-control" required="required" />
				<form:errors path="username" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="password">Password</form:label>
				<form:input path="password" type="text" class="form-control" required="required" />
				<form:errors path="password" cssClass="text-warning" />
			</fieldset>
			
			<button type="submit" class="btn btn-success">Login</button>
			</div>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
</body>
</html>