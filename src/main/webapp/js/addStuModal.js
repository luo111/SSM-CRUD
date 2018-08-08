$("#addStuInfo_btn").click(function(){
	$("#stuModal form")[0].reset();
	$("#stuModal").modal({ 
		backdrop:"static"
	});
});

//保存新增员工信息
/**
 * 新增功能开始
 * @returns
 */
$("#stuInfo_save_btn").click(function() {
					if (!confirm_add_form()) {
						return false;
					}
					if($(this).attr("ajax-va")=="error"){
						return false;	
					}
						//模态框中填写的表单数据提交给服务器进行保存
						//alert($("#stuModal form").serialize());
						$.ajax({
								url : "../stuInfo",
								type : "POST",
								data : $("#stuModal form").serialize(),
								success : function(result) {
								if (result.code == 100) {
								//保存成功
								//alert(result.msg);
								//关闭模态框
								$("#stuModal").modal("hide");
								//到最后一页，发送ajax请求即可
								to_page(count);
								} 
							}
						});
				});


//校验表单数据 名字 邮箱
function confirm_add_form() {
	//正则表达式
	var empName = $("#infoName").val();
	//alert(empName);
	var regName = /(^[A-Za-z0-9]{6,16}$)|(^[\u2E80-\u9FFF]{2,5}$)/;
	//alert(regName.test(empName));
	if (!regName.test(empName)) {
		//alert("名字必须是2-5个中文或者6-16位英文数字组合");
		show_confirmInfo("#infoName","error","glyphicon glyphicon-remove");
		return false;
	} else {
		show_confirmInfo("#infoName","success","glyphicon glyphicon-ok");
	}
	//校验邮箱
	var email = $("#infoEmail").val();
	//alert(email);
	var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
	if (!regEmail.test(email)) {
		//alert("邮箱格式输入错误");
		show_confirmInfo("#infoEmail","error","glyphicon glyphicon-remove");
		return false;
	} else {
		show_confirmInfo("#infoEmail","success","glyphicon glyphicon-ok");
	}
	return true;
}


//正则校验代码抽取
function show_confirmInfo(info, status, msg) {
	$(info).parent().removeClass("has-success has-error");
	$(info).next("span").removeClass("glyphicon glyphicon-remove glyphicon glyphicon-ok");
	if ("success" == status) {
		$(info).parent().addClass("has-success");
		$(info).next("span").show().addClass(msg);
	} else if ("error" == status) {
		$(info).parent().addClass("has-error");
		$(info).next("span").show().addClass(msg);
	}
}


//员工姓名重复性校验
$("#infoName").change(function(){
	//发送ajax请求校验用户名是否可用
	var infoName=this.value;
	$.ajax({
		url:"../checkuser",
		data:"infoName="+infoName,
		type:"POST",
		success:function(result){
			if(result.code==100){
				show_confirmInfo("#infoName","success","glyphicon glyphicon-ok");
				$("#stuInfo_save_btn").attr("ajax-va", "success");
			}else{
				show_confirmInfo("#infoEmail","error","glyphicon glyphicon-remove");
				$("#stuInfo_save_btn").attr("ajax-va", "error");
			}
		},
	});
});
/**
 * 新增功能结束
 */


/**
 * 编辑（修改）功能开始
 */

$(document).on("click", ".edit_btn", function() {
	//查出员工信息
	getInfo($(this).attr("edit-infoId"));
	//弹出框,把员工ID传递给更新按钮 
	$("#stuInfo_update_btn").attr("edit-infoId", $(this).attr("edit-infoId"));
	$("#updateModal").modal({
		backdrop : "static"
	});
});

	function getInfo(infoId) {
		$.ajax({
			url : "../stuInfo/"+infoId,
			type : "GET",
			success : function(result) { 
				//console.log(result);
				var stuInfoData = result.extend.stuInfo;
				$("#update_infoName").text(stuInfoData.infoName);
				$("#updateModal input[name=infoSex]").val([ stuInfoData.infoSex]);
				$("#update_infoTel").val(stuInfoData.infoTel);
				$("#update_infoEmail").val(stuInfoData.infoEmail);
				$("#update_infoQq").val(stuInfoData.infoQq);
				$("#update_infoWechat").val(stuInfoData.infoWechat);
				$("#update_infoNote").val(stuInfoData.infoNote);	
			}
		});
	}
	
	
	//点击更新员工信息
	$("#stuInfo_update_btn").click(function() {
		//校验邮箱
		var email = $("#update_infoEmail").val();
		//alert(email);
		var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
		if (!regEmail.test(email)) {
			//alert("邮箱格式输入错误");
			show_confirmInfo("#update_infoEmail","error","glyphicon glyphicon-remove");
			return false;
		} else {
			show_confirmInfo("#update_infoEmail","success","glyphicon glyphicon-ok");
		}
		
		//更新数据
		$.ajax({
			url : "../stuInfo/" + $(this).attr("edit-infoId"),
			type : "PUT",
			data : $("#updateModal form").serialize(),
			success : function(result) {
				if (result.code == 100) {
					//保存成功
					//alert(result.msg);
					//关闭模态框
					$("#updateModal").modal("hide");
					//回到本页面
					to_page(currentpage);
				} else {
					alert("更新失败");
				}
			}
		});
	});
/**
 * 编辑功能结束
 */
	
	
/**
 * 删除功能开始
 */
	//单个删除
	$(document).on("click", ".delete_btn", function(){
		//弹出是否删窗口
		var deleteName=$(this).parents("tr").find("td:eq(1)").text();
		var delId=$(this).attr("del-infoId");
		//alert($(this).parents("tr").find("td:eq(1)").text());
		if(confirm("确认删除【"+deleteName+"】吗？")){
			//确认发送ajax请求
			$.ajax({
				url:"../stuInfo/"+delId,
				type:"DELETE",
				success:function(result){
					to_page(currentpage); 
				}
			});
		}
	});
	
	//全选or不全选
	$("#check_all").click(function(){
		//attr获取checked是undefined
		//prop修改原生属性
		$(".check_item").prop("checked",$(this).prop("checked"));
	});
	
	
	$(document).on("click", ".check_item", function(){
		var flag = $(".check_item:checked").length==$(".check_item").length;
		$("#check_all").prop("checked",flag);
	});
	
	
	$("#delete_all").click(function(){
		var infoNames = "";
		var del_idstr = "";
		$.each($(".check_item:checked"),function(index,item){
			infoNames += $(this).parents("tr").find("td:eq(2)").text() + ",";
			del_idstr += $(this).parents("tr").find("td:eq(1)").text() + "-";
		});
		infoNames = infoNames.substring(0,infoNames.length-1);
		del_idstr = del_idstr.substring(0,del_idstr.length-1);
		if(confirm("确认删除"+infoNames+"?")){
			$.ajax({
				url:"../stuInfo/" + del_idstr,
				type:"DELETE",
				success:function(result){
					alert(result.msg);
					to_page(currentpage);
				}
			});
		}
	});