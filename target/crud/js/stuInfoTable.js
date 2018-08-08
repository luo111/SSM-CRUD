var count;//总页数
var currentpage;//当前页
$(function() {
	to_page(1);
});
		
		function to_page(pn) {
			$.ajax({
				url:"../stuInfo",
				data:"pn="+pn,
				type:"get",
				success:function(result){
					//console.log(result);
					//1、解析并显示数据
					built_stuInfo_table(result);
					//2、解析并显示分页信息
					built_page_info(result);
					//3.解析显示分页条信息
					build_page_nav(result);
				}
			});
		}

		function built_stuInfo_table(result){
			$("#StuInfoTable tbody").empty();
			var stuInfo=result.extend.pageInfo.list;
			$.each(stuInfo,function(index,item){
				var checkBox_tab=$("<td><input type='checkbox' class='check_item'/></td>")
				var infoId_tab=$("<td></td>").append(item.infoId);
				var infoName_tab=$("<td></td>").append(item.infoName);
				//处理性别 
				var infoSex_tab=$("<td></td>").append(item.infoSex=="M"?"男":"女");
				var infoTel_tab=$("<td></td>").append(item.infoTel);
				var infoEmail_tab=$("<td></td>").append(item.infoEmail);
				var infoQq_tab=$("<td></td>").append(item.infoQq);
				var infoWechat_tab=$("<td></td>").append(item.infoWechat);
				var infoNote_tab=$("<td></td>").append(item.infoNote);
				/**
				 * 构造编辑和删除按钮
				 * 
					button class="btn btn-info btn-sm">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
						编辑
					</button>
					button class="btn btn-danger btn-sm">
							<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
							删除
					</button>
				 */
				
				var ediBtn=$("<button></button>").addClass("btn btn-info btn-sm edit_btn")
					.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
					//为编辑按钮添加一个自定义属性，当前Id	
					ediBtn.attr("edit-infoId",item.infoId);
				var delBtn=$("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
					.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
					delBtn.attr("del-infoId",item.infoId);
				var Btn=$("<td></td>") .append(ediBtn).append(" ").append(delBtn);
				$("<tr></tr>").append(checkBox_tab)
							  .append(infoId_tab)
							  .append(infoName_tab)
							  .append(infoSex_tab)
							  .append(infoTel_tab)
							  .append(infoEmail_tab)
							  .append(infoQq_tab)
							  .append(infoWechat_tab)
							  .append(infoNote_tab)
							  .append(Btn)
							  .appendTo("#StuInfoTable tbody");
				
				//alert用于测试
				//alert(item.infoName);
					
			});
		}
		
		//解析显示分页信息
		function built_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页，共" +
					result.extend.pageInfo.pages+"页，共"+
					result.extend.pageInfo.total+"条记录")
					count=result.extend.pageInfo.pages;
					currentpage=result.extend.pageInfo.pageNum;
		}
		
		//解析显示分页条
	function build_page_nav(result){
		$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi =$("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));
			//上一页
			var prePageLi  = $("<li></li>").append($("<a></a>").append("&laquo;").attr("href", "#"));
			
			//第一页不显示上一页导航
			if (result.extend.pageInfo.hasPreviousPage == false){
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}else {
				//添加翻页事件
				firstPageLi.click(function() {
					to_page(1);
				});
				prePageLi.click(function() {
					to_page(result.extend.pageInfo.pageNum - 1);
				});
			}
			
			//下一页
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;").attr("href", "#"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href", "#"));
			
			//最后一页不显示下一页导航
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}
			else {
				//添加翻页事件
				lastPageLi.click(function() {
					to_page(result.extend.pageInfo.pages);
				});
				nextPageLi.click(function() {
					to_page(result.extend.pageInfo.pageNum + 1);
				});
			}
			
			//添加首页和前一页提示
			ul.append(firstPageLi).append(prePageLi);
			
			var navNum = result.extend.pageInfo.navigatepageNums;
			//页码号1 2 3 ...
			$.each(navNum, function(index, item){
				var numLi = $("<li></li>").append($("<a></a>").append(item).attr("href", "#"));
				
				//当前页导航条高亮
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				//绑定单击事件
				numLi.click(function() {
					to_page(item);
				});
				ul.append(numLi);
			});
			
			//添加末页和后一页提示
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			$("#page_nav_area").append(navEle);
		}
	
	
		