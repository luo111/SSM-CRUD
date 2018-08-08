<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<!-- 数据添加的模态框  -->
<div class="modal fade" id="stuModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">添加信息</h4>
      </div>
      <div class="modal-body">
      	<!-- 添加界面表单 -->
	      <form class="form-horizontal">
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoName" class="form-control" id="infoName" placeholder="Name">
			      <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true" 
			     				style="display:none"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
			    <div class="col-sm-10">
			      	<label class="radio-inline">
					 	<input type="radio" name="infoSex" id="sex1_add" value="M" checked="checked"> 男
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="infoSex" id="sex2_add" value="F">女
					</label>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Telphone</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoTel" class="form-control" id="infoTel" placeholder="Telphone">
			    </div>
			  </div>
			    <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoEmail" class="form-control" id="infoEmail" placeholder="Email">
			      <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true" 
			     				style="display:none"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">QQ</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoQq" class="form-control" id="infoQq" placeholder="QQ">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Wechat</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoWechat" class="form-control" id="infoWechat" placeholder="Wechat">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">备注</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoNote" class="form-control" id="infoNote" placeholder="">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox"> Remember me
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Sign in</button>
			    </div>
			  </div>
		</form>
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button id="stuInfo_save_btn" type="button" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</div>


<!-- 数据修改的模态框 -->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">修改信息</h4>
      </div>
      <div class="modal-body">
      	<!-- 添加界面表单 -->
	      <form class="form-horizontal">
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
			    <div class="col-sm-10">
			      <p id="update_infoName" class="form-control-static"></p>
			   	  <!--
			   	  <input type="text" name="infoName" class="form-control" id="update_infoName" placeholder="Name">
			        -->
			      <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true" 
			     				style="display:none"></span>
			     
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
			    <div class="col-sm-10">
			      	<label class="radio-inline">
					 	<input type="radio" name="infoSex" id="update_sex1" value="M" checked="checked"> 男
					</label>
					<label class="radio-inline">
					  	<input type="radio" name="infoSex" id="update_sex2" value="F">女
					</label>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Telphone</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoTel" class="form-control" id="update_infoTel" placeholder="Telphone">
			    </div>
			  </div>
			    <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoEmail" class="form-control" id="update_infoEmail" placeholder="Email">
			      <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true" 
			     				style="display:none"></span>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">QQ</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoQq" class="form-control" id="update_infoQq" placeholder="QQ">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">Wechat</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoWechat" class="form-control" id="update_infoWechat" placeholder="Wechat">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">备注</label>
			    <div class="col-sm-10">
			      <input type="text" name="infoNote" class="form-control" id="update_infoNote" placeholder="">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox"> Remember me
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Sign in</button>
			    </div>
			  </div>
		</form>
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button id="stuInfo_update_btn" type="button" class="btn btn-primary">更新</button>
      </div>
    </div>
  </div>
</div>
<script src="${pageContext.request.contextPath}/js/addStuModal.js"></script>
</body>
</html>