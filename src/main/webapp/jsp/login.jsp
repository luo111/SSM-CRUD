<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	%>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
	<script src="${pageContext.request.contextPath }/jquery/jquery-1.11.1.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.js"></script>
</head>
<body>
    <div class="container">
        <div class="form row" >
           <form role="form" class="form-horizontal col-md-offset-2">
                
                <div class="form-group ">
                       <h3 class="form-title">
                      	<span style="display:block;width:100px;float:left">LOGIN</span>
                      	<span style="display:block;width:100px;float:right;margin-right:50px">
                       		<button type="button" id="btn_test" class="btn btn-success offset-9" >测试</button>
                        </span>
                       </h3>
                		
                </div>
                <div class="col-md-9">
                    <div class="form-group">
                    	<div class="input-group">
							  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
							  <input type="text" class="form-control" placeholder="username" aria-describedby="basic-addon1" id="username" name="username">
						</div>
					</div>
                    <div class="form-group ">
                    	<div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                            <input class="form-control required " type="password" placeholder="Password" id="password" name="password" maxlength="8"/>
                   		</div>
                    </div>
                    <div class="form-group col-md-offset-9">
                        <label class="checkbox">
                            <input type="checkbox" name="remember" />记住我
                        </label>
                    </div>
                    <div  id="loginForm" action="login/changeToMAIN.do" class="form-group ">
                        <button type="button" style="width:120px" class="btn btn-success pull-right"  data-toggle="modal" data-target="#myModal" >注册</button>
                		<button type="button" style="width:120px" id="btn_login" class="btn btn-success pull-right" >登陆</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script src="<%=basePath%>js/login.js"></script>
</body>
</html> 
