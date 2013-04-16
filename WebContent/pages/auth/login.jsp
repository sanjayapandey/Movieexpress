<%@ include file="../../includes/header.jsp"%>

<%@ include file="../../includes/navbar.jsp"%>

<div id="image-slider">
	<h1>image slider goes here</h1>
</div>

<div id="main-content">
	<div class="login-form">
		<h4>Please login:</h4>
		<form action="validateUser" method="post">
			User name: <input type="text" name="username" /> <br>
			Password: <input type="password" name="password" /><br>
			 <input type="submit" name="login" value="submit" />
		</form>
		</div>

		<div class="signup-form">
			<h4>Don't have account!! Ok, signup here</h4>
			<form action="signup" method="post">
				User name: <input type="text" name="username" /><br> 
				Password: <input type="password" name="password" /> <br>
				Repassword:<input type="password" name="repassword" /><br> 
				<input type="submit" name="login" value="submit" />
			</form>
		</div>

	</div>

	<%@ include file="../../includes/footer.jsp"%>