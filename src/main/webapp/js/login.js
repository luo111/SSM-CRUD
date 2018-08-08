$("#btn_login").click(function(){
  var username = $("#username").val();
  var password = $("#password").val();
  $.ajax({
      type: "POST",
      url: "login/start.do",
      data: {
    	  username : username, 
    	  password : password,
    	  },
      dataType: "json",
      success: function(data){
                 if(data.result){
                	 window.location.href="jsp/stuInfoTable.jsp" 
                	       
                 }
                 
               }
  });
})

