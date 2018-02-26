<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tables.jsp' starting page</title>
    <script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:1419364062,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok2v=1613a3a185/"},atok:"1fca8a26fb9678bbb4b5c54c34e227b9",petok:"741689df844b5dd5b929a1a25343f03523c8ae7f-1420553920-1800",zone:"adbee.technology",rocket:"0",apps:{"ga_key":{"ua":"UA-49262924-2","ga_bs":"2"}}}];!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok2v=919620257c/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
</script>
<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css"/>
 
<script src="js/demo-rtl.js"></script>
 
 
<link rel="stylesheet" type="text/css" href="css/libs/font-awesome.css"/>
<link rel="stylesheet" type="text/css" href="css/libs/nanoscroller.css"/>
 
<link rel="stylesheet" type="text/css" href="css/compiled/theme_styles.css"/>
 
<link rel="stylesheet" href="css/libs/daterangepicker.css" type="text/css"/>
 
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
<img src="img/samples/scarlet-159.png" alt=""/>
<span class="hidden-xs">Scarlett Johansson</span> <b class="caret"></b>
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
<img alt="" src="img/samples/scarlet-159.png"/>
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
<li>
<a href="index.jsp">
<i class="fa fa-dashboard"></i>
<span>Dashboard</span>
<span class="label label-info label-circle pull-right">28</span>
</a>
</li>
<li class="open active">
<a href="#" class="dropdown-toggle">
<i class="fa fa-table"></i>
<span>Tables</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="tables.jsp" class="active">
Simple
</a>
</li>
<li>
<a href="tables-advanced.jsp">
Advanced
</a>
</li>
<li>
<a href="users.jsp">
Users
</a>
</li>
</ul>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-envelope"></i>
<span>Email</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="email-inbox.html">
Inbox
</a>
</li>
<li>
<a href="email-detail.html">
Detail
</a>
</li>
<li>
<a href="email-compose.html">
Compose
</a>
</li>
</ul>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-bar-chart-o"></i>
<span>Graphs</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="graphs-morris.html">
Morris &amp; Mixed
</a>
</li>
<li>
<a href="graphs-flot.html">
Flot
</a>
</li>
<li>
<a href="graphs-dygraphs.html">
Dygraphs
</a>
</li>
<li>
<a href="graphs-xcharts.html">
xCharts
</a>
</li>
</ul>
</li>
<li>
<a href="widgets.html">
<i class="fa fa-th-large"></i>
<span>Widgets</span>
<span class="label label-success pull-right">New</span>
</a>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-desktop"></i>
<span>Pages</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="calendar.html">
Calendar
</a>
</li>
<li>
<a href="gallery.html">
Gallery
</a>
</li>
<li>
<a href="gallery-v2.html">
Gallery v2
</a>
</li>
<li>
<a href="pricing.html">
Pricing
</a>
</li>
<li>
<a href="projects.html">
Projects
</a>
</li>
<li>
<a href="team-members.html">
Team Members
</a>
</li>
<li>
<a href="timeline.html">
Timeline
</a>
</li>
<li>
<a href="timeline-grid.html">
Timeline Grid
</a>
</li>
<li>
<a href="user-profile.html">
User Profile
</a>
</li>
<li>
<a href="search.html">
Search Results
</a>
</li>
<li>
<a href="invoice.html">
Invoice
</a>
</li>
<li>
<a href="intro.html">
Tour Layout
</a>
</li>
</ul>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-edit"></i>
<span>Forms</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="form-elements.html">
Elements
</a>
</li>
<li>
<a href="x-editable.html">
X-Editable
</a>
</li>
<li>
<a href="form-wizard.html">
Wizard
</a>
</li>
<li>
<a href="form-wizard-popup.html">
Wizard popup
</a>
</li>
<li>
<a href="form-wysiwyg.html">
WYSIWYG
</a>
</li>
<li>
<a href="form-summernote.html">
WYSIWYG Summernote
</a>
</li>
<li>
<a href="form-ckeditor.html">
WYSIWYG CKEditor
</a>
</li>
<li>
<a href="form-dropzone.html">
Multiple File Upload
</a>
</li>
</ul>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-desktop"></i>
<span>UI Kit</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="ui-elements.html">
Elements
</a>
</li>
<li>
<a href="notifications.html">
Notifications &amp; Alerts
</a>
</li>
<li>
<a href="modals.html">
Modals
</a>
</li>
<li>
<a href="video.html">
Video
</a>
</li>
<li>
<a href="#" class="dropdown-toggle">
Icons
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="icons-awesome.html">
Awesome Icons
</a>
</li>
<li>
<a href="icons-halflings.html">
Halflings Icons
</a>
</li>
</ul>
</li>
<li>
<a href="ui-nestable.html">
Nestable List
</a>
</li>
<li>
<a href="typography.html">
Typography
</a>
</li>
<li>
<a href="#" class="dropdown-toggle">
3 Level Menu
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="#">
3rd Level
</a>
</li>
<li>
<a href="#">
3rd Level
</a>
</li>
<li>
<a href="#">
3rd Level
</a>
</li>
</ul>
</li>
</ul>
</li>
<li>
<a href="maps.html">
<i class="fa fa-map-marker"></i>
<span>Google Maps</span>
<span class="label label-danger pull-right">Updated</span>
</a>
</li>
<li>
<a href="#" class="dropdown-toggle">
<i class="fa fa-file-text-o"></i>
<span>Extra pages</span>
<i class="fa fa-chevron-circle-right drop-icon"></i>
</a>
<ul class="submenu">
<li>
<a href="faq.html">
FAQ
</a>
</li>
<li>
<a href="emails.html">
Email Templates
</a>
</li>
<li>
<a href="login.html">
Login
</a>
</li>
<li>
<a href="login-full.html">
Login Full
</a>
</li>
<li>
<a href="registration.html">
Registration
</a>
</li>
<li>
<a href="registration-full.html">
Registration Full
</a>
</li>
<li>
<a href="forgot-password.html">
Forgot Password
</a>
</li>
<li>
<a href="forgot-password-full.html">
Forgot Password Full
</a>
</li>
<li>
<a href="lock-screen.html">
Lock Screen
</a>
</li>
<li>
<a href="lock-screen-full.html">
Lock Screen Full
</a>
</li>
<li>
<a href="error-404.html">
Error 404
</a>
</li>
<li>
<a href="error-404-v2.html">
Error 404 Nested
</a>
</li>
<li>
<a href="error-500.html">
Error 500
</a>
</li>
<li>
<a href="extra-grid.html">
Grid
</a>
</li>
</ul>
</li>
</ul>
</div>
</div>
</section>
</div>
<div id="content-wrapper">
<div class="row">
<div class="col-lg-12">
<div class="row">
<div class="col-lg-12">
<ol class="breadcrumb">
<li><a href="#">Home</a></li>
<li class="active"><span>Tables</span></li>
</ol>
<h1>Tables <small>Secondary headline</small></h1>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="main-box clearfix">
<header class="main-box-header clearfix">
<h2 class="pull-left">Orders</h2>
<div id="reportrange" class="pull-right daterange-filter">
<i class="icon-calendar"></i>
<span></span> <b class="caret"></b>
</div>
</header>
<div class="main-box-body clearfix">
<div class="table-responsive">
<table class="table">
<thead>
<tr>
<th><a href="#"><span>Order ID</span></a></th>
<th><a href="#" class="desc"><span>Date</span></a></th>
<th><a href="#" class="asc"><span>Customer</span></a></th>
<th class="text-center"><span>Status</span></th>
<th class="text-right"><span>Price</span></th>
</tr>
</thead>
<tbody>
<tr>
<td>
<a href="#">#8002</a>
</td>
<td>
2013/08/08
</td>
<td>
<a href="#">Robert De Niro</a>
</td>
<td class="text-center">
<span class="label label-success">Completed</span>
</td>
<td class="text-right">
&dollar; 825.50
</td>
</tr>
<tr>
<td>
<a href="#">#5832</a>
</td>
<td>
2013/08/08
</td>
<td>
<a href="#">John Wayne</a>
</td>
<td class="text-center">
<span class="label label-warning">On hold</span>
</td>
<td class="text-right">
&dollar; 923.93
</td>
</tr>
<tr>
<td>
<a href="#">#2547</a>
</td>
<td>
2013/08/08
</td>
<td>
<a href="#">Anthony Hopkins</a>
</td>
<td class="text-center">
<span class="label label-primary">Pending</span>
</td>
<td class="text-right">
&dollar; 1.625.50
</td>
</tr>
<tr>
<td>
<a href="#">#9274</a>
</td>
<td>
2013/08/08
</td>
<td>
<a href="#">Charles Chaplin</a>
</td>
<td class="text-center">
<span class="label label-danger">Cancelled</span>
</td>
<td class="text-right">
&dollar; 35.34
</td>
</tr>
<tr>
<td>
<a href="#">#8463</a>
</td>
<td>
2013/08/08
</td>
<td>
<a href="#">Gary Cooper</a>
</td>
<td class="text-center">
<span class="label label-success">Completed</span>
</td>
<td class="text-right">
&dollar; 34.199.99
</td>
</tr>
</tbody>
</table>
</div>
<ul class="pagination pull-right">
<li><a href="#"><i class="fa fa-chevron-left"></i></a></li>
<li><a href="#">1</a></li>
<li><a href="#">2</a></li>
<li><a href="#">3</a></li>
<li><a href="#">4</a></li>
<li><a href="#">5</a></li>
<li><a href="#"><i class="fa fa-chevron-right"></i></a></li>
</ul>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="main-box clearfix">
<header class="main-box-header clearfix">
<h2 class="pull-left">Products</h2>
<div class="filter-block pull-right">
<div class="form-group pull-left">
<input type="text" class="form-control" placeholder="Search...">
<i class="fa fa-search search-icon"></i>
</div>
<a href="#" class="btn btn-primary pull-right">
<i class="fa fa-plus-circle fa-lg"></i> Add product
</a>
</div>
</header>
<div class="main-box-body clearfix">
<div class="table-responsive">
<table class="table">
<thead>
<tr>
<th><a href="#"><span>Product</span></a></th>
<th class="text-right"><a href="#" class="asc"><span>Price</span></a></th>
<th class="text-center"><span>Status</span></th>
<th class="text-center"><a href="#" class="desc"><span>Date updated</span></a></th>
<th>&nbsp;</th>
</tr>
</thead>
<tbody>
<tr>
<td>
iPad Mini 32GB Wifi
</td>
<td class="text-right">
&dollar; 625.50
</td>
<td class="text-center">
<span class="label label-warning">Inactive</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
<tr>
<td>
MacBook Air 11"
</td>
<td class="text-right">
&dollar; 999.00
</td>
<td class="text-center">
<span class="label label-success">Active</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
<tr>
<td>
iPad 128GB Wifi+3G
</td>
<td class="text-right">
&dollar; 1825.00
</td>
<td class="text-center">
<span class="label label-success">Active</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
<tr>
<td>
iMac 27" Quad Core i5 3.2GHz
</td>
<td class="text-right">
&dollar; 1.920.50
</td>
<td class="text-center">
<span class="label label-success">Active</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
<tr>
<td>
Mac Pro 2.8GHz 4-Core Intel Xeon
</td>
<td class="text-right">
&dollar; 4.625.50
</td>
<td class="text-center">
<span class="label label-warning">Inactive</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
<tr>
<td>
MacBook Pro 15" Retina Core i7 2.7GHz
</td>
<td class="text-right">
&dollar; 1.435.50
</td>
<td class="text-center">
<span class="label label-success">Active</span>
</td>
<td class="text-center">
2013/08/08 12:08
</td>
<td style="width: 15%;">
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
</span>
</a>
<a href="#" class="table-link danger">
<span class="fa-stack">
<i class="fa fa-square fa-stack-2x"></i>
<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
</span>
</a>
</td>
</tr>
</tbody>
</table>
</div>
<ul class="pagination pull-right">
<li><a href="#"><i class="fa fa-chevron-left"></i></a></li>
<li><a href="#">1</a></li>
<li><a href="#">2</a></li>
<li><a href="#">3</a></li>
<li><a href="#">4</a></li>
<li><a href="#">5</a></li>
<li><a href="#"><i class="fa fa-chevron-right"></i></a></li>
</ul>
</div>
</div>
</div>
</div>
<div class="row">


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
 
<script src="js/moment.min.js"></script>
<script src="js/daterangepicker.js"></script>
 
<script src="js/scripts.js"></script>
<script src="js/pace.min.js"></script>
 
<script type="text/javascript">
	$(document).ready(function() {
		$('#reportrange').daterangepicker({
			startDate: moment().subtract('days', 29),
			endDate: moment(),
			minDate: '01/01/2012',
			maxDate: '12/31/2014',
			dateLimit: { days: 60 },
			showDropdowns: true,
			showWeekNumbers: true,
			timePicker: false,
			timePickerIncrement: 1,
			timePicker12Hour: true,
			ranges: {
				'Today': [moment(), moment()],
				'Yesterday': [moment().subtract('days', 1), moment().subtract('days', 1)],
				'Last 7 Days': [moment().subtract('days', 6), moment()],
				'Last 30 Days': [moment().subtract('days', 29), moment()],
				'This Month': [moment().startOf('month'), moment().endOf('month')],
				'Last Month': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
			},
			opens: 'left',
			buttonClasses: ['btn btn-default'],
			applyClass: 'btn-small btn-primary',
			cancelClass: 'btn-small',
			format: 'MM/DD/YYYY',
			separator: ' to ',
			locale: {
				applyLabel: 'Submit',
				fromLabel: 'From',
				toLabel: 'To',
				customRangeLabel: 'Custom Range',
				daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr','Sa'],
				monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
				firstDay: 1
			}
		 },
		 function(start, end) {
		  console.log("Callback has been called!");
		  $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
		 }
	  );
	  //Set the initial state of the picker label
	  $('#reportrange span').html(moment().subtract('days', 29).format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));
	});
	</script>
  </body>
</html>
