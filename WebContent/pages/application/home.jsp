
<%@ include file="../../includes/header.jsp"%>

<%@ include file="../../includes/navbar.jsp"%>

<!-- <div id="image-slider"> -->
<!-- <h1>image slider goes here</h1> -->
<!-- </div> -->

<div id="main-content">
	<div id="left-content">
		<div class="side-content">
			<h4>Top movie</h4>
			<ul>
				<li><a href="Born series">Born series</a>
				<li><a href="MI">Mission Impossible</a>
				<li><a href="tramsporter">Transporter</a>
				<li><a href="matrix">Matrix</a>
			</ul>
		</div>
		<div class="side-content">
			<h4>UpComing movies</h4>
			<ul>
				<li><a href="Born series">Born</a>
				<li><a href="MI">Mission Impossible9</a>
				<li><a href="tramsporter">Transporter4</a>
			</ul>
		</div>
	</div>
	
	<div id="right-content">

	<c:choose>
		<c:when test="${movies.size()>0}">
		<ul>
			<c:forEach var="movie" varStatus="status" items="${movies}" step="1">
				<li>
				<div class="single-movie">
					<div class="movie-info">
						<p class="heading-format">
							<a href="#">${movie.title}</a>
						</p>
						<div class="image-hold">
							<img src="${movie.small_image}">
						</div>
						<div class="movie-content">
							<p>${movie.description}</p>
						</div>
						<div class="tags">${movie.release_date}</div>
					</div>
					<div class="movie-rate-bar">Rating of that movie:</div>
				</div>
				</li>
			</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			Data not found
			</c:otherwise>
	</c:choose>
	</div>


	<!-- 			<div class="single-movie"> -->
	<!-- 				<p class = "heading-format"> -->
	<%-- 					<a href="#">${movie.title}</a> --%>
	<!-- 				</p> -->
	<!-- 				<div class= "image-hold"> -->
	<%-- 					<img src="${movie.small_image}"> --%>
	<!-- 				</div> -->
	<!-- 				<div class= "movie-content"> -->
	<%-- 					<p>${movie.description}</p> --%>
	<!-- 				</div> -->
	<!-- 				<div class= "tags"> -->
	<%-- 					${movie.release_date} --%>
	<!-- 				</div> -->
	<!-- 			</div> -->

</div>

<%@ include file="../../includes/footer.jsp"%>

