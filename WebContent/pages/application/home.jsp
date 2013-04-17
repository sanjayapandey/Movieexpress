
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
			<div id="middle-content">
			
<!-- 			Start Code for the Star Rating -->
			
			<span id="rateStatus">Rate Me...</span>
		<span id="ratingSaved">Rating Saved!</span> 


		<div id="rateMe" title="Rate Me...">
    		<a onclick="rateIt(this)" id="_1" title="ehh..." onmouseover="rating(this)" onmouseout="off(this)"></a>
   			<a onclick="rateIt(this)" id="_2" title="Not Bad" onmouseover="rating(this)" onmouseout="off(this)"></a>
    		<a onclick="rateIt(this)" id="_3" title="Pretty Good" onmouseover="rating(this)" onmouseout="off(this)"></a>
    		<a onclick="rateIt(this)" id="_4" title="Excellent" onmouseover="rating(this)" onmouseout="off(this)"></a>
    		<a onclick="rateIt(this)" id="_5" title="Best" onmouseover="rating(this)" onmouseout="off(this)"></a>

		</div>
		
 <script src="resources/js/javascript.js"></script>
		
			
			End of the code for star rating
			
				<h3>Top Rating movies:</h3>
				<img alt="Top1" src="resources/images/top1.jpg" height="200px" />
				<img alt="Top1" src="resources/images/top1.jpg" height="200px" />
				<img alt="Top1" src="resources/images/top1.jpg" height="200px"  />
				<img alt="Top1" src="resources/images/top1.jpg" height="200px" />
				<img alt="Top1" src="resources/images/top1.jpg" height="200px" />
				<img alt="Top1" src="resources/images/top1.jpg" height="200px" />
			</div>
<!-- 			<div id="rate-movie"> -->
<!-- 			<h4>Rate movie yourself</h4> -->
<!-- 			</div> -->
			
		</div>

<%@ include file="../../includes/footer.jsp" %>

