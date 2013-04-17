<%@ include file="../../includes/header.jsp"%>

<%@ include file="../../includes/navbar.jsp"%>

<div id="image-slider">
	<h1>image slider goes here</h1>
</div>

<div id="main-content">
	<div class="login-form">
		<h4>Please login:</h4>
		<form action="login" method="POST">
			User name: <input type="text" name="username" /> <br>
			Password: <input type="password" name="password" /><br>
			Remember: <input type="checkbox" name="remember"/> <br>
			 <input type="submit" name="login" value="submit" />
		</form>
		</div>

		
	</div>

	<%@ include file="../../includes/footer.jsp"%>