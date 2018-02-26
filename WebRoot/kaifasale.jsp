<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css"/>
 
<script src="js/demo-rtl.js"></script>
 
 
<link rel="stylesheet" type="text/css" href="css/libs/font-awesome.css"/>
<link rel="stylesheet" type="text/css" href="css/libs/nanoscroller.css"/>
 
<link rel="stylesheet" type="text/css" href="css/compiled/theme_styles.css"/>
 
 
<link type="image/x-icon" href="favicon.png" rel="shortcut icon"/>
 
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700,300|Titillium+Web:200,300,400' rel='stylesheet' type='text/css'>
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

function deletesale(id,name){
if(confirm("确定删除客户名称为:"+name+"的销售计划吗?")){
location="deleteSale?saleId="+id;
}
}

function xiugai(id){
location="salexiang?saleId="+id;
}
</script>
  </head>
  
  <body>
    

<div id="theme-wrapper">
<header class="navbar" id="header-navbar">
<div class="container">
<a href="index.html" id="logo" class="navbar-brand">
<img src="img/logo.png" alt="" class="normal-logo logo-white"/>
<img src="img/logo-black.png" alt="" class="normal-logo logo-black"/>
<img src="img/logo-small.png" alt="" class="small-logo hidden-xs hidden-sm hidden"/>
</a>
<div class="clearfix">
<button class="navbar-toggle" data-target=".navbar-ex1-collapse" data-toggle="collapse" type="button">
<span class="sr-only">Toggle navigation</span>
<span class="fa fa-bars"></span>
</button>
<div class="nav-no-collapse navbar-left pull-left hidden-sm hidden-xs">
<ul class="nav navbar-nav pull-left">
<li>
<a class="btn" id="make-small-nav">
<i class="fa fa-bars"></i>
</a>
</li>
</ul>
</div>
<div class="nav-no-collapse pull-right" id="header-nav">
<ul class="nav navbar-nav pull-right">
<li class="mobile-search">
<a class="btn">
<i class="fa fa-search"></i>
</a>
<div class="drowdown-search">
<form role="search">
<div class="form-group">
<input type="text" class="form-control" placeholder="Search...">
<i class="fa fa-search nav-search-icon"></i>
</div>
</form>
</div>
</li>
<li class="dropdown hidden-xs">
<a class="btn dropdown-toggle" data-toggle="dropdown">
<i class="fa fa-warning"></i>
<span class="count">8</span>
</a>
<ul class="dropdown-menu notifications-list">
<li class="pointer">
<div class="pointer-inner">
<div class="arrow"></div>
</div>
</li>
<li class="item-header">You have 6 new notifications</li>
<li class="item">
<a href="#">
<i class="fa fa-comment"></i>
<span class="content">New comment on ‘Awesome P...</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<i class="fa fa-plus"></i>
<span class="content">New user registration</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<i class="fa fa-envelope"></i>
<span class="content">New Message from George</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<i class="fa fa-shopping-cart"></i>
<span class="content">New purchase</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<i class="fa fa-eye"></i>
<span class="content">New order</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item-footer">
<a href="#">
View all notifications
</a>
</li>
</ul>
</li>
<li class="dropdown hidden-xs">
<a class="btn dropdown-toggle" data-toggle="dropdown">
<i class="fa fa-envelope-o"></i>
<span class="count">16</span>
</a>
<ul class="dropdown-menu notifications-list messages-list">
<li class="pointer">
<div class="pointer-inner">
<div class="arrow"></div>
</div>
</li>
<li class="item first-item">
<a href="#">
<img src="img/samples/messages-photo-1.png" alt=""/>
<span class="content">
<span class="content-headline">
George Clooney
</span>
<span class="content-text">
Look, just because I don't be givin' no man a foot massage don't make it
right for Marsellus to throw...
</span>
</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<img src="img/samples/messages-photo-2.png" alt=""/>
<span class="content">
<span class="content-headline">
Emma Watson
</span>
<span class="content-text">
Look, just because I don't be givin' no man a foot massage don't make it
right for Marsellus to throw...
</span>
</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item">
<a href="#">
<img src="img/samples/messages-photo-3.png" alt=""/>
<span class="content">
<span class="content-headline">
Robert Downey Jr.
</span>
<span class="content-text">
Look, just because I don't be givin' no man a foot massage don't make it
right for Marsellus to throw...
</span>
</span>
<span class="time"><i class="fa fa-clock-o"></i>13 min.</span>
</a>
</li>
<li class="item-footer">
<a href="#">
View all messages
</a>
</li>
</ul>
</li>
<li class="hidden-xs">
<a class="btn">
<i class="fa fa-cog"></i>
</a>
</li>
<li class="dropdown profile-dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">
<img src="img/${user.userPic}" alt=""/>
<span class="hidden-xs">${user.trueName}</span> <b class="caret"></b>
</a>
<ul class="dropdown-menu">
<li><a href="user-profile.html"><i class="fa fa-user"></i>Profile</a></li>
<li><a href="#"><i class="fa fa-cog"></i>Settings</a></li>
<li><a href="#"><i class="fa fa-envelope-o"></i>Messages</a></li>
<li><a href="#"><i class="fa fa-power-off"></i>Logout</a></li>
</ul>
</li>
<li class="hidden-xxs">
<a class="btn">
<i class="fa fa-power-off"></i>
</a>
</li>
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
<img alt="" src="img/${user.userPic}"/>
<div class="user-box">
<span class="name">
Welcome<br/>
Scarlett
</span>
<span class="status">
<i class="fa fa-circle"></i> Online
</span>
</div>
</div>
<div class="collapse navbar-collapse navbar-ex1-collapse" id="sidebar-nav">
<ul class="nav nav-pills nav-stacked">
<li class="active">
<a href="index.html">
<i class="fa fa-dashboard"></i>
<span>Dashboard</span>
<span class="label label-info label-circle pull-right">28</span>
</a>
</li>
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
<div id="content-wrapper"><div class="row">
<div class="col-lg-12">
<div class="row">
<div class="col-lg-12">
<ol class="breadcrumb">
<li><a href="index.jsp">首页</a></li>
<li class="active"><span>销售机会</span></li>
</ol>
<div class="clearfix">
<h1 class="pull-left">销售机会管理</h1>
<div class="pull-right top-page-ui">
<a href="#" class="btn btn-primary pull-right">
<i class="fa fa-plus-circle fa-lg"></i> 新建
</a>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="main-box no-header clearfix">
<div class="main-box-body clearfix">
<div class="table-responsive">
<form action="shaixuan" method="post">
<div align="center">
<table>
	<tr>
		<td>客户名称:<input type="text" name="vo.kehuName" value="${vo.kehuName}" class="form-control" style="width: 300px"/></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td>概要:<input type="text" name="vo.prefile" value="${vo.prefile}" class="form-control" style="width: 300px"/></td>
		<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td>联系人:<input type="text" name="vo.lineMan" value="${vo.lineMan}" class="form-control" style="width: 300px"/></td>
			<td><div style="padding-top: 19px;margin: 10px;"><input type="button" value="帮助" class="form-control"/ style="background-color:#ccc "></div></td>
			<td><div style="padding-top: 19px;margin: 10px;"><input type="submit" value="查询" class="form-control"/ style="background-color:#ccc "></div></td>
	</tr>
</table>

</div>
</form>

<table class="table user-list table-hover">
<thead>
<tr>
<th><span>编号</span></th>
<th class="text-right"><span>客户名称</span></th>
<th class="text-center"><span>概要</span></th>
<th class="text-center"><span>联系人</span></th>
<th class="text-center"><span>联系人电话</span></th>
<th class="text-center"><span>创建时间</span></th>
<th class="text-center"><span>操作</span></th>
</tr>
</thead>
<tbody>
<c:forEach var="s" items="${sclist}">
<tr>
<td>
${s.saleId}
</td>
<td class="text-right">
${s.customerName}
</td>
<td class="text-center">
<span class="label label-warning">${s.profile}</span>
</td>
<td class="text-center">
${s.linkman}
</td>
<td class="text-center">
${s.linkTel}
</td>
<td class="text-center">
${s.createTime}
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="javascript:xiugai(${s.saleId})" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="javascript:deletesale(${s.saleId},'${s.customerName}')" class="table-link danger" >
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
</c:forEach>

</tbody>
</table>
<ul class="pagination pull-right">
<li>
<pg:pager items="${pageMax }" url="fenSale" maxPageItems="4" maxIndexPages="4" export="curPage=pageNumber">
									<pg:first>
										<a href="<%=pageUrl%>">首页</a>
									</pg:first>

									<pg:prev>
										<a href="<%=pageUrl%>">上一页</a>
									</pg:prev>

									<pg:pages>
										<c:choose>
											<c:when test="${curPage == pageNumber}">
												[${pageNumber }]
											</c:when>
											<c:otherwise>
												<a href="<%=pageUrl%>">${pageNumber }</a>
											</c:otherwise>
										</c:choose>
									</pg:pages>

									<pg:next>
										<a href="<%=pageUrl%>">下一页</a>
									</pg:next>

									<pg:last>
										<a href="<%=pageUrl%>">尾页</a>
									</pg:last>

								</pg:pager>
</li>
</ul>



</div>
</div>
</div>
</div>
</div>
</div>
</div>
<footer id="footer-bar" class="row">
<p id="footer-copyright" class="col-xs-12">
&copy; 2014 <a href="http://www.adbee.sk/" target="_blank">Adbee digital</a>. Powered by Centaurus Theme.
</p>
</footer>
</div>
</div>
</div>
</div>
<div id="config-tool" class="closed">
<a id="config-tool-cog">
<i class="fa fa-cog"></i>
</a>
<div id="config-tool-options">
<h4>Layout Options</h4>
<ul>
<li>
<div class="checkbox-nice">
<input type="checkbox" id="config-fixed-header"/>
<label for="config-fixed-header">
Fixed Header
</label>
</div>
</li>
<li>
<div class="checkbox-nice">
<input type="checkbox" id="config-fixed-sidebar"/>
<label for="config-fixed-sidebar">
Fixed Left Menu
</label>
</div>
</li>
<li>
<div class="checkbox-nice">
<input type="checkbox" id="config-fixed-footer"/>
<label for="config-fixed-footer">
Fixed Footer
</label>
</div>
</li>
<li>
<div class="checkbox-nice">
<input type="checkbox" id="config-boxed-layout"/>
<label for="config-boxed-layout">
Boxed Layout
</label>
</div>
</li>
<li>
<div class="checkbox-nice">
<input type="checkbox" id="config-rtl-layout"/>
<label for="config-rtl-layout">
Right-to-Left
</label>
</div>
</li>
</ul>
<br/>
<h4>Skin Color</h4>
<ul id="skin-colors" class="clearfix">
<li>
<a class="skin-changer" data-skin="" data-toggle="tooltip" title="Default" style="background-color: #34495e;">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-white" data-toggle="tooltip" title="White/Green" style="background-color: #2ecc71;">
</a>
</li>
<li>
<a class="skin-changer blue-gradient" data-skin="theme-blue-gradient" data-toggle="tooltip" title="Gradient">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-turquoise" data-toggle="tooltip" title="Green Sea" style="background-color: #1abc9c;">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-amethyst" data-toggle="tooltip" title="Amethyst" style="background-color: #9b59b6;">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-blue" data-toggle="tooltip" title="Blue" style="background-color: #2980b9;">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-red" data-toggle="tooltip" title="Red" style="background-color: #e74c3c;">
</a>
</li>
<li>
<a class="skin-changer" data-skin="theme-whbl" data-toggle="tooltip" title="White/Blue" style="background-color: #3498db;">
</a>
</li>
</ul>
</div>
</div>
 
<script src="js/demo-skin-changer.js"></script>  
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.nanoscroller.min.js"></script>
<script src="js/demo.js"></script>  
 
 
<script src="js/scripts.js"></script>
<script src="js/pace.min.js"></script>

  </body>
</html>
