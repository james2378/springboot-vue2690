<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑家具信息</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>家具信息管理</span></li>
								<li class="breadcrumb-item active"><span>编辑家具信息</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">家具信息信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>家具名称</label>
										<input name="jiajumingcheng" id="jiajumingcheng" name="jiajumingcheng" class="form-control" placeholder="家具名称">
									</div>
									<div class="form-group col-md-6">
										<label>家具分类</label>
										<select id="jiajufenleiSelect" name="jiajufenlei" class="form-control">
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>家具风格</label>
										<input name="jiajufengge" id="jiajufengge" name="jiajufengge" class="form-control" placeholder="家具风格">
									</div>
									<div class="form-group col-md-6">
										<label>家具图片</label>
										<div><img id="jiajutupianImg" src="" width="100" height="100">
										<div class="upload">选择文件<input name="file" type="file" id="jiajutupianupload" class="form-control-file"></div>
										<input name="jiajutupian" id="jiajutupian-input" type="hidden"></div>
									</div>
									<div class="form-group col-md-6">
										<label>家具材料</label>
										<input name="jiajucailiao" id="jiajucailiao" name="jiajucailiao" class="form-control" placeholder="家具材料">
									</div>
									<div class="form-group col-md-6">
										<label>家具产地</label>
										<input name="jiajuchandi" id="jiajuchandi" name="jiajuchandi" class="form-control" placeholder="家具产地">
									</div>
									<div class="form-group col-md-6">
										<label>家具品牌</label>
										<input name="jiajupinpai" id="jiajupinpai" name="jiajupinpai" class="form-control" placeholder="家具品牌">
									</div>
									<div class="form-group col-md-6">
										<label>采购价格</label>
										<input name="caigoujiage" id="caigoujiage" name="caigoujiage" class="form-control" placeholder="采购价格">
									</div>
									<div class="form-group col-md-6">
										<label>销售价格</label>
										<input name="xiaoshoujiage" id="xiaoshoujiage" name="xiaoshoujiage" class="form-control" placeholder="销售价格">
									</div>
									<div class="form-group col-md-6">
										<label>家具数量</label>
										<input name="jiajushuliang" id="jiajushuliang" name="jiajushuliang" class="form-control" placeholder="家具数量">
									</div>
									<div class="form-group col-md-6">
										<label>信息备注</label>
										<textarea  name="xinxibeizhu" class="form-control" id="xinxibeizhu" rows="3"></textarea>
									</div>
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../static/utils.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "jiajuxinxi";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};

		var jiajufenleiOptions = [];

		function jiajufenleiSelect(){
			http("option/jiajufenlei/jiajufenlei","GET",{},(res)=>{
				if(res.code == 0){
					jiajufenleiOptions = res.data;
					var nullOption = document.createElement('option');
					var jiajufenleiSelect = document.getElementById('jiajufenleiSelect');
					jiajufenleiSelect.appendChild(nullOption);
					for(var i=0;i<jiajufenleiOptions.length;i++){
						var jiajufenleiOption = document.createElement('option');
						jiajufenleiOption.setAttribute('name','jiajufenleiOption');
						jiajufenleiOption.setAttribute('value',jiajufenleiOptions[i]);
						jiajufenleiOption.innerHTML = jiajufenleiOptions[i];									
						if(ruleForm.jiajufenlei == jiajufenleiOptions[i]){
							jiajufenleiOption.setAttribute('selected','selected');
						}
						jiajufenleiSelect.appendChild(jiajufenleiOption);
					}
				}
			});
		}	

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "jiajuxinxi/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
			$('#jiajutupianupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {				
					document.getElementById('jiajutupian-input').setAttribute('value',"upload/"+data.result.file);
					if(document.getElementById('jiajutupianFileName') != null){
						document.getElementById('jiajutupianFileName').innerHTML = "上传成功!";
					}				
					$("#jiajutupianImg").attr("src",baseUrl+"upload/"+data.result.file);								
				}
			});
		}  
		//取消 
		function cancel() {
            window.location.href = "list.jsp";
		}
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return unescape(r[2]); 
			return null; 
		}

		// 表单提交
		function submit() {

			var crossFlag = getQueryString("cross");
			if(validform() ==true && compare() == true){
				if(crossFlag) {
				}
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(crossFlag) {
					var statusColumnName = window.sessionStorage.getItem('statusColumnName'); 
					var statusColumnValue = window.sessionStorage.getItem('statusColumnValue'); 
					var obj = JSON.parse(window.sessionStorage.getItem('crossObj'));
					if(statusColumnName!='') {
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = window.sessionStorage.getItem('crossTableName');
							httpJson(crossTableName + "/update","POST",obj,(res)=>{
								if(res.code == 0){
									console.log('更新属性成功');
								}
							});   
						} else  {
							crossuserid = Number(window.sessionStorage.getItem('userid'));
							crossrefid = obj["id"];
							crossoptnum = window.sessionStorage.getItem('statusColumnName');
							crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					data.crossuserid=crossuserid;
					data.crossrefid=crossrefid;
					http("jiajuxinxi/page","GET",{
						page:1,
						limit:10,
						crossuserid:data.crossuserid,
						crossrefid:data.crossrefid,			
					},(res)=>{
						if(res.data.total >= crossoptnum){
							alert(window.sessionStorage.getItem('tips'));
							return false;
						} else {
							httpJson("jiajuxinxi/"+urlParam,"POST",data,(res)=>{
								if(res.code == 0){
									window.sessionStorage.removeItem('id');
									let flag = true;
									if(crossFlag) {
									}

									if(flag){
										alert(successMes);
									}
									if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
										window.sessionStorage.removeItem('onlyme');
										window.location.href="${pageContext.request.contextPath}/index.jsp";
									}else{
                                        window.location.href = "list.jsp";
									}
									
								}
							});
						}
					});
				} else {
					httpJson("jiajuxinxi/"+urlParam,"POST",data,(res)=>{
						if(res.code == 0){
							window.sessionStorage.removeItem('id');
							let flag = true;
							if(crossFlag) {
							}

							if(flag){
								alert(successMes);
							}
							if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
								window.sessionStorage.removeItem('onlyme');
								window.location.href="${pageContext.request.contextPath}/index.jsp";
							}else{
                                        window.location.href = "list.jsp";
							}
							
						}
					});
				}
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    jiajufenlei: {
					required: true,
					},
				    jiajufengge: {
					required: true,
					},
				    jiajutupian: {
					},
				    jiajucailiao: {
					required: true,
					},
				    jiajuchandi: {
					},
				    jiajupinpai: {
					},
				    caigoujiage: {
					required: true,
					},
				    xiaoshoujiage: {
					required: true,
					},
				    jiajushuliang: {
					required: true,
					},
				    xinxibeizhu: {
					},
				    clicktime: {
					},
				},
				messages: {
					jiajufenlei: {
						required: "家具分类不能为空",
					},
					jiajufengge: {
						required: "家具风格不能为空",
					},
					jiajutupian: {
					},
					jiajucailiao: {
						required: "家具材料不能为空",
					},
					jiajuchandi: {
					},
					jiajupinpai: {
					},
					caigoujiage: {
						required: "采购价格不能为空",
					},
					xiaoshoujiage: {
						required: "销售价格不能为空",
					},
					jiajushuliang: {
						required: "家具数量不能为空",
					},
					xinxibeizhu: {
					},
					clicktime: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("jiajuxinxi/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												jiajufenleiSelect();
						//注册表单验证
						$(validform());	
					}
				});
			}else{
				jiajufenleiSelect();	



		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#clicktimeDate").datetimepicker({ 
				autoclose: true,
				format:'yyyy-mm-dd hh:ii:ss',
				minuteStep:1,
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
		}		
		function calculationSE(colName){
			//单列求和接口
			http("jiajuxinxi"+colName,"GET",{
				tableName: "jiajuxinxi",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){
				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#jiajumingcheng").val(ruleForm.jiajumingcheng);	
			var jiajufenleiOptions = document.getElementsByClassName("jiajufenleiOption");
			for(var jiajufenleiCount = 0; jiajufenleiCount < jiajufenleiOptions.length;jiajufenleiCount++){
				if(jiajufenleiOptions[jiajufenleiCount].getAttribute('value') == ruleForm.jiajufenlei){
					jiajufenleiOptions[jiajufenleiCount].setAttribute('selected','selected');
				}
			}
			$("#jiajufengge").val(ruleForm.jiajufengge);	
			$("#jiajutupian-input").val(ruleForm.jiajutupian);
			$("#jiajucailiao").val(ruleForm.jiajucailiao);	
			$("#jiajuchandi").val(ruleForm.jiajuchandi);	
			$("#jiajupinpai").val(ruleForm.jiajupinpai);	
			$("#caigoujiage").val(ruleForm.caigoujiage);	
			$("#xiaoshoujiage").val(ruleForm.xiaoshoujiage);	
			$("#jiajushuliang").val(ruleForm.jiajushuliang);	
			$("#xinxibeizhu").val(ruleForm.xinxibeizhu);
				
					}		
		//图片显示
		function showImg(){
			var jiajutupianFileName = "\"" + ruleForm.jiajutupian + "\"";
			$("#jiajutupianImg").attr("src",baseUrl+ruleForm.jiajutupian);
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.jiajumingcheng != null && res.data.jiajumingcheng != ''){

						$("#jiajumingcheng").val(res.data.jiajumingcheng);
						$("#jiajumingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jiajufenlei != null && res.data.jiajufenlei != ''){

						var jiajufenleiOptions = document.getElementsByClassName("jiajufenleiOption");
						for(var jiajufenleiCount = 0; jiajufenleiCount < jiajufenleiOptions.length;jiajufenleiCount++){
							if(jiajufenleiOptions[jiajufenleiCount].getAttribute('value') == res.data.jiajufenlei){
								jiajufenleiOptions[jiajufenleiCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.jiajufengge != null && res.data.jiajufengge != ''){

						$("#jiajufengge").val(res.data.jiajufengge);
						$("#jiajufengge").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jiajutupian != null && res.data.jiajutupian != ''){

						$("#jiajutupianImg").attr("src",baseUrl+res.data.jiajutupian);
						$("#jiajutupian-input").val(res.data.jiajutupian);
					}
					if(res.data != null && res.data != '' && res.data.jiajucailiao != null && res.data.jiajucailiao != ''){

						$("#jiajucailiao").val(res.data.jiajucailiao);
						$("#jiajucailiao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jiajuchandi != null && res.data.jiajuchandi != ''){

						$("#jiajuchandi").val(res.data.jiajuchandi);
						$("#jiajuchandi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jiajupinpai != null && res.data.jiajupinpai != ''){

						$("#jiajupinpai").val(res.data.jiajupinpai);
						$("#jiajupinpai").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.caigoujiage != null && res.data.caigoujiage != ''){

						$("#caigoujiage").val(res.data.caigoujiage);
						$("#caigoujiage").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.xiaoshoujiage != null && res.data.xiaoshoujiage != ''){

						$("#xiaoshoujiage").val(res.data.xiaoshoujiage);
						$("#xiaoshoujiage").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.jiajushuliang != null && res.data.jiajushuliang != ''){

						$("#jiajushuliang").val(res.data.jiajushuliang);
						$("#jiajushuliang").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.xinxibeizhu != null && res.data.xinxibeizhu != ''){

						$("#xinxibeizhu").val(res.data.xinxibeizhu);
					}
					if(res.data != null && res.data != '' && res.data.clicktime != null && res.data.clicktime != ''){

					}
				}
			});  
            }
		window.sessionStorage.removeItem('crossTableName');
		window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
            if(window.sessionStorage.getItem('role')!="管理员") {
				$('#money').attr('readonly','readonly');
            }
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(parseInt(largerVal)<=parseInt(smallerVal)){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
