<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'users.jsp' starting page</title>
<script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:1419364062,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok2v=1613a3a185/"},atok:"1fca8a26fb9678bbb4b5c54c34e227b9",petok:"45b90b042f1480e125e673c9a4b5b0ae4f31d0b6-1420553921-1800",zone:"adbee.technology",rocket:"0",apps:{"ga_key":{"ua":"UA-49262924-2","ga_bs":"2"}}}];!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok2v=919620257c/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
</script>
<link rel="stylesheet" type="text/css"
	href="css/bootstrap/bootstrap.min.css" />

<script src="js/demo-rtl.js"></script>


<link rel="stylesheet" type="text/css" href="css/libs/font-awesome.css" />
<link rel="stylesheet" type="text/css" href="css/libs/nanoscroller.css" />

<link rel="stylesheet" type="text/css"
	href="css/compiled/theme_styles.css" />
<link href="css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css"/>
 
<script src="js/demo-rtl.js"></script>
 
 
<link rel="stylesheet" type="text/css" href="css/libs/font-awesome.css"/>
<link rel="stylesheet" type="text/css" href="css/libs/nanoscroller.css"/>
 
<link rel="stylesheet" type="text/css" href="css/compiled/theme_styles.css"/>
 
<link rel="stylesheet" href="css/libs/fullcalendar.css" type="text/css"/>
<link rel="stylesheet" href="css/libs/fullcalendar.print.css" type="text/css" media="print"/>
<link rel="stylesheet" href="css/compiled/calendar.css" type="text/css" media="screen"/>
<link rel="stylesheet" href="css/libs/morris.css" type="text/css"/>
<link rel="stylesheet" href="css/libs/daterangepicker.css" type="text/css"/>
<link rel="stylesheet" href="css/libs/jquery-jvectormap-1.2.2.css" type="text/css"/>
 
<link type="image/x-icon" href="favicon.png" rel="shortcut icon"/>
 
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700,300|Titillium+Web:200,300,400' rel='stylesheet' type='text/css'>
<!-- 拷贝的table -->

<link type="image/x-icon" href="favicon.png" rel="shortcut icon" />

<link
	href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700,300|Titillium+Web:200,300,400'
	rel='stylesheet' type='text/css'>
<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
		<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript">
/* <![CDATA[ */
var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-49262924-2']);
_gaq.push(['_trackPageview']);

(function() {
var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
})();

(function(b){(function(a){"__CF"in b&&"DJS"in b.__CF?b.__CF.DJS.push(a):"addEventListener"in b?b.addEventListener("load",a,!1):b.attachEvent("onload",a)})(function(){"FB"in b&&"Event"in FB&&"subscribe"in FB.Event&&(FB.Event.subscribe("edge.create",function(a){_gaq.push(["_trackSocial","facebook","like",a])}),FB.Event.subscribe("edge.remove",function(a){_gaq.push(["_trackSocial","facebook","unlike",a])}),FB.Event.subscribe("message.send",function(a){_gaq.push(["_trackSocial","facebook","send",a])}));"twttr"in b&&"events"in twttr&&"bind"in twttr.events&&twttr.events.bind("tweet",function(a){if(a){var b;if(a.target&&a.target.nodeName=="IFRAME")a:{if(a=a.target.src){a=a.split("#")[0].match(/[^?=&]+=([^&]*)?/g);b=0;for(var c;c=a[b];++b)if(c.indexOf("url")===0){b=unescape(c.split("=")[1]);break a}}b=void 0}_gaq.push(["_trackSocial","twitter","tweet",b])}})})})(window);

/* ]]> */
</script>
</head>

<body>


	<div id="theme-wrapper">
		<header class="navbar" id="header-navbar">
		<div class="container">
			<a href="index.html" id="logo" class="navbar-brand"> <img
				src="img/logo.png" alt="" class="normal-logo logo-white" /> <img
				src="img/logo-black.png" alt="" class="normal-logo logo-black" /> <img
				src="img/logo-small.png" alt=""
				class="small-logo hidden-xs hidden-sm hidden" />
			</a>
			<div class="clearfix">
				<button class="navbar-toggle" data-target=".navbar-ex1-collapse"
					data-toggle="collapse" type="button">
					<span class="sr-only">Toggle navigation</span> <span
						class="fa fa-bars"></span>
				</button>
				<div
					class="nav-no-collapse navbar-left pull-left hidden-sm hidden-xs">
					<ul class="nav navbar-nav pull-left">
						<li><a class="btn" id="make-small-nav"> <i
								class="fa fa-bars"></i>
						</a></li>
					</ul>
				</div>
				<div class="nav-no-collapse pull-right" id="header-nav">
					<ul class="nav navbar-nav pull-right">
						<li class="mobile-search"><a class="btn"> <i
								class="fa fa-search"></i>
						</a>
							<div class="drowdown-search">
								
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Search..."> <i
											class="fa fa-search nav-search-icon"></i>
									</div>
								
							</div></li>
						<li class="dropdown hidden-xs"><a class="btn dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-warning"></i> <span
								class="count">8</span>
						</a>
							<ul class="dropdown-menu notifications-list">
								<li class="pointer">
									<div class="pointer-inner">
										<div class="arrow"></div>
									</div>
								</li>
								<li class="item-header">You have 6 new notifications</li>
								<li class="item"><a href="#"> <i class="fa fa-comment"></i>
										<span class="content">New comment on ‘Awesome P...</span> <span
										class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item"><a href="#"> <i class="fa fa-plus"></i>
										<span class="content">New user registration</span> <span
										class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item"><a href="#"> <i class="fa fa-envelope"></i>
										<span class="content">New Message from George</span> <span
										class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item"><a href="#"> <i
										class="fa fa-shopping-cart"></i> <span class="content">New
											purchase</span> <span class="time"><i class="fa fa-clock-o"></i>13
											min.</span>
								</a></li>
								<li class="item"><a href="#"> <i class="fa fa-eye"></i>
										<span class="content">New order</span> <span class="time"><i
											class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item-footer"><a href="#"> View all
										notifications </a></li>
							</ul></li>
						<li class="dropdown hidden-xs"><a class="btn dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-envelope-o"></i> <span
								class="count">16</span>
						</a>
							<ul class="dropdown-menu notifications-list messages-list">
								<li class="pointer">
									<div class="pointer-inner">
										<div class="arrow"></div>
									</div>
								</li>
								<li class="item first-item"><a href="#"> <img
										src="img/samples/messages-photo-1.png" alt="" /> <span
										class="content"> <span class="content-headline">
												George Clooney </span> <span class="content-text"> Look,
												just because I don't be givin' no man a foot massage don't
												make it right for Marsellus to throw... </span>
									</span> <span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item"><a href="#"> <img
										src="img/samples/messages-photo-2.png" alt="" /> <span
										class="content"> <span class="content-headline">
												Emma Watson </span> <span class="content-text"> Look, just
												because I don't be givin' no man a foot massage don't make
												it right for Marsellus to throw... </span>
									</span> <span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item"><a href="#"> <img
										src="img/samples/messages-photo-3.png" alt="" /> <span
										class="content"> <span class="content-headline">
												Robert Downey Jr. </span> <span class="content-text"> Look,
												just because I don't be givin' no man a foot massage don't
												make it right for Marsellus to throw... </span>
									</span> <span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
								</a></li>
								<li class="item-footer"><a href="#"> View all messages
								</a></li>
							</ul></li>
						<li class="hidden-xs"><a class="btn"> <i
								class="fa fa-cog"></i>
						</a></li>
						<li class="dropdown profile-dropdown"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"> <img
								src="img/${user.userPic}" alt="" /> <span
								class="hidden-xs">${user.trueName}</span> <b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="user-profile.html"><i class="fa fa-user"></i>Profile</a></li>
								<li><a href="#"><i class="fa fa-cog"></i>Settings</a></li>
								<li><a href="#"><i class="fa fa-envelope-o"></i>Messages</a></li>
								<li><a href="#"><i class="fa fa-power-off"></i>Logout</a></li>
							</ul></li>
						<li class="hidden-xxs"><a class="btn"> <i
								class="fa fa-power-off"></i>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
		</header>
		<div id="page-wrapper" class="container">
			<div class="row">
				<div id="nav-col">
					<section id="col-left" class="col-left-nano">
					<div id="col-left-inner" class="col-left-nano-content">
						<div id="user-left-box" class="clearfix hidden-sm hidden-xs">
							<img alt="" src="img/${user.userPic}" />
							<div class="user-box">
								<span class="name"> Welcome<br /> ${user.trueName}
								</span> <span class="status"> <i class="fa fa-circle"></i>
									Online
								</span>
							</div>
						</div>
						<div class="collapse navbar-collapse navbar-ex1-collapse"
							id="sidebar-nav">
							<ul class="nav nav-pills nav-stacked">
								<li class="active"><a href="index.html"> <i
										class="fa fa-dashboard"></i> <span>Dashboard</span> <span
										class="label label-info label-circle pull-right">28</span>
								</a></li>
								<li class="open active">
<c:forEach var="fu" items="${list}">
              <c:forEach var="pow" items="${polist}">
	              <c:if test="${pow.navId.navId eq fu.navId}">
		                 <a href="#" class="dropdown-toggle">
						<i class="fa fa-table"></i>
						<span>${fu.navName}</span>
						<i class="fa fa-chevron-circle-right drop-icon"></i>
						</a>
	              </c:if>
              </c:forEach>
           <c:forEach var="zi" items="${alllist }">
            <c:if test="${zi.pid eq fu.navId}">
               <c:forEach var="po" items="${polist}">
                 <c:if test="${po.navId.navId eq zi.navId}">
                    <ul class="submenu">
					<li>
					<a href="${zi.url}">${zi.navName}</a>
					</li>
					</ul>
                 </c:if>
               </c:forEach> 
            </c:if>
           </c:forEach>
        </c:forEach>
</li>
							</ul>
						</div>
					</div>
					</section>
				</div>
				<div id="content-wrapper">
					<div class="row" >
						<div class="col-lg-12">
							<div class="row">
								<div class="col-lg-12">
									<ol class="breadcrumb">
										<li><a href="Loss.jsp">数据字典管理</a></li>
										<li class="active"><span>修改数据字典条目</span></li>
									</ol>
									<div class="clearfix"></div>
								</div>
							</div>
							<div class="row" >
								<div class="col-lg-12" >
									 <div class="main-box no-header clearfix" style="height:"><!-- 板块 -->
										<div class="main-box-body clearfix">
											<div class="table-responsive" >
												<form action="Byidupda?id=${data.dataId}" method="post">
													<div align="center">
													<h1>修改字典新建页面</h1>
														<table align="right">
															<tr>
																<!-- <td><div style="padding-top: 19px;margin: 10px;"><input type="button" value="帮助" class="form-control"/></div></td> -->
																<td><div style="padding-top: 19px;margin: 10px;">
																		<button type="button" class="form-control">
																			<a href="Alldata" style="color: #06060B">返回</a>
																		</button>
																	</div></td>
																<td><div style="padding-top: 19px;margin: 10px;">
																		<input type="submit" value="保存" class="form-control" />
																	</div></td>
															</tr>
														</table>
													</div>
												
												<!-- <table class="table user-list table-hover"
													class="query_form_table">
													<tr>
														<th style="background-color: #98F5FF">编号</th>
														<td>1</td>
														<th class="info">客户</th>
														<td>阳光实业</td>
													</tr>
													<tr>
														<th class="info">客户经理</th>
														<td>球球</td>
														<th class="info">上次下单时间</th>
														<td>2005年12月07日</td>
													</tr>
													<tr>
														<th class="info">暂缓措施</th>
														<td colspan="3">打电话给客户了解不再购买本公司产品的原因。<br>
															发送新产品目录给客户。
														</td>
													</tr>
													<tr>
														<th class="info">追加暂缓措施</th>
														<td colspan="3"><textarea rows="6" cols="50"></textarea><span
															class="red_star">*</span></td>
													</tr>
												</table>
												 -->
					<div class="col-lg-12" >
<div class="row">

<div class="row"><!-- 第一行四列 -->
<div class="col-lg-6" style="width:350px">
<div class="main-box" style="background-color: #87CEFA">
<header class="main-box-header clearfix">
<h2 align="center">编号:</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box" >
<header class="main-box-header clearfix">
<h2>${data.dataId}</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box" style="background-color: #87CEFA">
<header class="main-box-header clearfix">
<h2 align="center">类别:</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box">
<header class="main-box-header clearfix">
<h2><input type="text" name="leibie" value="${data.dataType}"/><span style="color: red">*</span></h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
</div>

<div class="row"><!-- 第二行四列 -->
<div class="col-lg-6" style="width:350px">
<div class="main-box" style="background-color: #87CEFA">
<header class="main-box-header clearfix">
<h2 align="center">条目:</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box" >
<header class="main-box-header clearfix">
<h2><input type="text" name="tiaomu" value="${data.entry}"/><span>*</span></h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box" style="background-color: #87CEFA">
<header class="main-box-header clearfix">
<h2 align="center">值:</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box">
<header class="main-box-header clearfix">
<h2><input type="text" value="${data.dataValue}" name="zhi"/><span style="color: red">*</span></h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
</div>
<div class="row"><!-- 第二行四列 -->
<div class="col-lg-6" style="width:350px">
<div class="main-box" style="background-color: #87CEFA">
<header class="main-box-header clearfix">
<h2 align="center">是否可编辑:</h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>
<div class="col-lg-6" style="width: 350px">
<div class="main-box" >
<header class="main-box-header clearfix">
<h2><input type="checkbox" name="bianji" value="1" checked="checked"/></h2>
</header>
<div class="main-box-body clearfix">
<div id="hero-graph"></div>
</div>
</div>
</div>


</div>


</div>							 


											</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<footer id="footer-bar" class="row">
					<p id="footer-copyright" class="col-xs-12">
						&copy; 2014 <a href="http://www.adbee.sk/" target="_blank">Adbee
							digital</a>. Powered by Centaurus Theme.
					</p>
					</footer>
				</div>
			</div>
		</div>
	</div>
	<div id="config-tool" class="closed">
		<a id="config-tool-cog"> <i class="fa fa-cog"></i>
		</a>
		<div id="config-tool-options">
			<h4>Layout Options</h4>
			<ul>
				<li>
					<div class="checkbox-nice">
						<input type="checkbox" id="config-fixed-header" /> <label
							for="config-fixed-header"> Fixed Header </label>
					</div>
				</li>
				<li>
					<div class="checkbox-nice">
						<input type="checkbox" id="config-fixed-sidebar" /> <label
							for="config-fixed-sidebar"> Fixed Left Menu </label>
					</div>
				</li>
				<li>
					<div class="checkbox-nice">
						<input type="checkbox" id="config-fixed-footer" /> <label
							for="config-fixed-footer"> Fixed Footer </label>
					</div>
				</li>
				<li>
					<div class="checkbox-nice">
						<input type="checkbox" id="config-boxed-layout" /> <label
							for="config-boxed-layout"> Boxed Layout </label>
					</div>
				</li>
				<li>
					<div class="checkbox-nice">
						<input type="checkbox" id="config-rtl-layout" /> <label
							for="config-rtl-layout"> Right-to-Left </label>
					</div>
				</li>
			</ul>
			<br />
			<h4>Skin Color</h4>
			<ul id="skin-colors" class="clearfix">
				<li><a class="skin-changer" data-skin="" data-toggle="tooltip"
					title="Default" style="background-color: #34495e;"> </a></li>
				<li><a class="skin-changer" data-skin="theme-white"
					data-toggle="tooltip" title="White/Green"
					style="background-color: #2ecc71;"> </a></li>
				<li><a class="skin-changer blue-gradient"
					data-skin="theme-blue-gradient" data-toggle="tooltip"
					title="Gradient"> </a></li>
				<li><a class="skin-changer" data-skin="theme-turquoise"
					data-toggle="tooltip" title="Green Sea"
					style="background-color: #1abc9c;"> </a></li>
				<li><a class="skin-changer" data-skin="theme-amethyst"
					data-toggle="tooltip" title="Amethyst"
					style="background-color: #9b59b6;"> </a></li>
				<li><a class="skin-changer" data-skin="theme-blue"
					data-toggle="tooltip" title="Blue"
					style="background-color: #2980b9;"> </a></li>
				<li><a class="skin-changer" data-skin="theme-red"
					data-toggle="tooltip" title="Red"
					style="background-color: #e74c3c;"> </a></li>
				<li><a class="skin-changer" data-skin="theme-whbl"
					data-toggle="tooltip" title="White/Blue"
					style="background-color: #3498db;"> </a></li>
			</ul>
		</div>
	</div>

	<script src="js/demo-skin-changer.js"></script>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery.nanoscroller.min.js"></script>
	<script src="js/demo.js"></script>
<script src="js/demo-skin-changer.js"></script>  
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.nanoscroller.min.js"></script>
<script src="js/demo.js"></script>  
 
<script src="js/jquery-ui.custom.min.js"></script>
<script src="js/fullcalendar.min.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script src="js/raphael-min.js"></script>
<script src="js/morris.min.js"></script>
<script src="js/moment.min.js"></script>
<script src="js/daterangepicker.js"></script>
<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="js/jquery-jvectormap-world-merc-en.js"></script>
<script src="js/gdp-data.js"></script>
<script src="js/flot/jquery.flot.js"></script>
<script src="js/flot/jquery.flot.min.js"></script>
<script src="js/flot/jquery.flot.pie.min.js"></script>
<script src="js/flot/jquery.flot.stack.min.js"></script>
<script src="js/flot/jquery.flot.resize.min.js"></script>
<script src="js/flot/jquery.flot.time.min.js"></script>
<script src="js/flot/jquery.flot.threshold.js"></script>
<script src="js/jquery.countTo.js"></script>
 
<script src="js/scripts.js"></script>
<script src="js/pace.min.js"></script>

	<script src="js/scripts.js"></script>
	<script src="js/pace.min.js"></script>

</body>
</html>
