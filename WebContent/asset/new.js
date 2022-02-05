
     function generateQR()
	 {
	    var d='user id:='; 
	   var myinput= $("#myinput").val();
	     
	   var e='            user name:='; 
	   var a=$("#uname").val();
	   
	   var f='            mobile number:='; 
	   var b=$("#mobile").val();
	  
	   var g='         vehicle:='; 
	   var c=$("#vehicle").val();
	   
	   var o='         Date:='; 
	   var p=$("#mt").val();
	   
	   var q='         Time:='; 
	   var r=$("#td").val();
	   
	   var h=d.concat(myinput);
	   var i=e.concat(a);
	   var j=f.concat(b);
	   var k=g.concat(c);
	   var s=o.concat(p);
	   var t=q.concat(r);
	   
	
	   var u=s.concat(t);
	   var l=h.concat(i);
	   var m=j.concat(k);
	   
	   var n=l.concat(m);
	   
	   var v=n.concat(u);
	   new QRCode(document.getElementById("qrcode"),v);
}