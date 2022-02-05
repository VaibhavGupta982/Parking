   
function myfun(){
	var a=document.getElementById("vno").value;
	if(a=="")
		{
		document.getElementById("massages").innerHTML="please fill vehical number";
		return false;
		}
	if(isNaN(a))
	{
	document.getElementById("massages").innerHTML="please enter only numeric value";
	return false;
	}
	
	if(a.length<4)
	{
	document.getElementById("massages").innerHTML="**vehical number must be of last four digit of vehicle**";
	return false;
	}
	if(a.length>4)
	{
	document.getElementById("massages").innerHTML="**vehical number must be of last four digit of vehicle**";
	return false;
	}
	}
