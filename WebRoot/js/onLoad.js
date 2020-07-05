window.onload=function(){
	initProvince();
	provide.onchange=provinceChange;
	city.onchange=cityChange;
	
	var myform=document.forms[0];
	myform.onsubmit=checkForm;
	
	var inputs=document.getElementsByTagName("input");
	for(var i=0;i<inputs.length;i++){
		var type=input[i].type;
		if(type=="text"||type=="password"){
			inputs[i].onfocus=onFoucs;
			inputs[i].onblur=onBlur;
		}
	}
};