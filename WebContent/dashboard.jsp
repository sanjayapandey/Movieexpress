
<%@ include file="../../includes/header.jsp" %>

<%@ include file="../../includes/navbar.jsp" %>

<!-- <div id="image-slider"> -->
<!-- <h1>image slider goes here</h1> -->
<!-- </div> -->

<div id="main-content">
			<div id="left-content">
				<div class="side-content">
				<h4>Top movie</h4>
					<ul>
						<li><a href="Born series">Born series</a></li>
						<li><a href="MI">Mission Impossible</a></li>
						<li><a href="tramsporter">Transporter</a></li>
						<li><a href="matrix">Matrix</a></li>
				</ul>
				</div>
				<div class="side-content">
				<h4>UpComing movies</h4>
				<ul>
						<li><a href="Born series">Born</a></li>
						<li><a href="MI">Mission Impossible9</a></li>
						<li><a href="tramsporter">Transporter4</a></li>
						
					</ul>
				</div>
			</div>
			<div id="middle-content">
				<form method="post" action="">
				<table>
				<tr>
					<td>Movie Title</td>
					<td><input type="text" name="mName"></td>
				</tr>
				<tr>
					<td>Movie Description </td>
					<td><textarea rows="8" cols="60" name="mDesc"></textarea></td>
				</tr>
				
				<tr>
					<td>Image Small</td>
					<td><input type="file" name="sImage"></td>
				</tr>
				
				<tr>
					<td>Image Large</td>
					<td><input type="file" name="lImage"></td>
				</tr>
				<tr>
					<td>Director</td>
					<td><input type="button" value="+" onclick="clickDirector();"></td>
				
				</tr>
				<tr>
				
				<td id="director">First Name<input type="text" name="dfName">Middle Name<input type="text" name="dmName">Last Name<input type="text" name="dlName"></td>
				
				</tr>
				
				<tr>
				<td>Writer</td>
					<td><input type="button" value="+" onclick="clickWriter();"></td>
				</tr><tr>
				
				<td id="writer">First Name<input type="text" name="wfName">Middle Name<input type="text" name="wmName">Last Name<input type="text" name="wlName"></td>
				
				</tr>
				</table>
				 				
				</form>
			</div>
<!-- 			<div id="rate-movie"> -->
<!-- 			<h4>Rate movie yourself</h4> -->
<!-- 			</div> -->
			
		</div>

<%@ include file="../../includes/footer.jsp" %>

