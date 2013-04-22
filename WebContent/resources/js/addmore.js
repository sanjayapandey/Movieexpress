function clickDirector(){
var x = document.getElementById("director");
x.innerHTML = x.innerHTML + "<br> First Name<input type='text' name='dfName' > Middle Name<input type='text' name='dmName' >Last Name<input type='text' name='dlName' >";
}

function clickWriter(){
	var x = document.getElementById("writer");
	x.innerHTML  = x.innerHTML + "<br> First Name<input type='text' name='wfName' > Middle Name<input type='text' name='wmName' >Last Name<input type='text' name='wlName' >";
}