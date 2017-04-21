$(function() {
  
	//给按钮添加一个点击事件
	$('#btn').click(function(){
		var url = "sys/login";
		$.ajax({
			type:"GET",
			url:url,
			data:"userName=xiaohua&pwd=123456",
			async:true,
			success:function(msg){
				alert(msg);
				
			}
			
			
		});
		
		
		
		
	});
});