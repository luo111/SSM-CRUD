<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
	不以/开始的相对路径，以当前资源的路径为基准，容易出现问题
	以/开始的相对路径，资源以服务器的路径为标准
	比如(http://localhost:3360):需要加上项目名
	http://localhost:3306/crud
 -->
<!-- Bootstrap -->
<link href="${APP_PATH}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<!-- 信息显示页面  -->
	<div class="container" >
		<!-- 标题  -->
		<div class="row">
			<div class="col-md-12"><h1>信息管理</h1></div>
		</div>
		<!-- 按钮  -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button id="addStuInfo_btn" data-toggle="modal" data-target="stuModal" data-dissmiss="modal" class="btn btn-info">新增</button>
				<button id="delete_all" class="btn btn-danger ">删除</button>
			</div> 
		</div>
		<!-- 显示数据  -->
		<div class="row">
			<table id="StuInfoTable" class="table table-hover">
				<thead>
					<tr>
						<th>
							<input id="check_all" type="checkbox"></input>
						</th>
						<th>ID</th>
						<th>姓名</th>
						<th>性别</th>
						<th>Tel</th>
						<th>Email</th>
						<th>QQ</th>
						<th>Wechat</th>
						<th>备注</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<!-- 显示分页信息栏  -->
		<div class="row">
			<!-- 分页文字信息  -->
			<div id="page_info_area" class="col-md-6">
			</div>
			<!-- 分页条-->
			<div id="page_nav_area" class="col-md-6">
			</div>
		</div>
	</div>
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边)  -->
	<script src="${pageContext.request.contextPath }/jquery/jquery-1.11.0.min.js"></script>
	<!--  加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。  -->
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.js"></script>
	<script src="${pageContext.request.contextPath }/js/stuInfoTable.js"></script>
	<script src="${pageContext.request.contextPath }/js/addStuModal.js"></script>
	<jsp:include page="addStuModal.jsp"/>
</body>
</html>