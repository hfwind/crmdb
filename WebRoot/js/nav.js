/*$(document).ready(function(){
	$("#nav>ul>li>div").click(function(){
			$("#nav>ul>li>ul").slideUp();
			$(this).siblings().fadeIn(1000);
	});
	$("#active").parent().css("display","block");
});*/

function clickall(num , op){
	var c = op.checked;
	$("input[id*='power_"+num+"']").attr("checked",c);
	
}

function clickchild(num){
	var flag = false;
	$("input[id*='power_"+num+"_']").each(function(i){
		if($(this).attr("checked")=="checked"){
			flag = true;
			$("input[id='power_"+num+"']").attr("checked","checked");
		}
	});
	if(!flag){		
		$("input[id='power_"+num+"']").removeAttr("checked");
	}
}