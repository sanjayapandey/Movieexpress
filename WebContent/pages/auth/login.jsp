<%@ include file="../../includes/header.jsp"%>

<%@ include file="../../includes/navbar.jsp"%>


<div id="main-content" >
	<form action="login" method="post" class="form-signin">
            <h2 class="form-signin-heading">Please sign in</h2>
            <input type ="text" name="userName" class="input-block-level" placeholder="User Name">
            <input type ="password" name="password" class="input-block-level" placeholder="Password">
            <label class="checkbox">
              <input name="remember" type="checkbox" value="true"> Remember me
            </label>
            <input type="submit" value  ="Sign in" class="submit-button" >
        </form>

	</div>

	<%@ include file="../../includes/footer.jsp"%>