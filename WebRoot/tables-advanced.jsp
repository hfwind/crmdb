<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tables-advanced.jsp' starting page</title>
   <script type="text/javascript">
//<![CDATA[
try{if (!window.CloudFlare) {var CloudFlare=[{verbose:0,p:1419364062,byc:0,owlid:"cf",bag2:1,mirage2:0,oracle:0,paths:{cloudflare:"/cdn-cgi/nexp/dok2v=1613a3a185/"},atok:"1fca8a26fb9678bbb4b5c54c34e227b9",petok:"edc3bb660c960db01c6473543c337c05ff828e55-1420553994-1800",zone:"adbee.technology",rocket:"0",apps:{"ga_key":{"ua":"UA-49262924-2","ga_bs":"2"}}}];!function(a,b){a=document.createElement("script"),b=document.getElementsByTagName("script")[0],a.async=!0,a.src="//ajax.cloudflare.com/cdn-cgi/nexp/dok2v=919620257c/cloudflare.min.js",b.parentNode.insertBefore(a,b)}()}}catch(e){};
//]]>
</script>
<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css"/>
 
<script src="js/demo-rtl.js"></script>
 
 
<link rel="stylesheet" type="text/css" href="css/libs/font-awesome.css"/>
<link rel="stylesheet" type="text/css" href="css/libs/nanoscroller.css"/>
 
<link rel="stylesheet" type="text/css" href="css/compiled/theme_styles.css"/>
 
<link rel="stylesheet" type="text/css" href="css/libs/dataTables.fixedHeader.css">
<link rel="stylesheet" type="text/css" href="css/libs/dataTables.tableTools.css">
 
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
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>


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
<a href="tables.jsp">
Simple
</a>
</li>
<li>
<a href="tables-advanced.jsp" class="active">
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
<li class="active"><span>Advanced tables</span></li>
</ol>
<h1>Advanced tables</h1>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="main-box clearfix">
<header class="main-box-header clearfix">
<h2>Table with JS pagination, search, ordering, export to pdf and lots more.</h2>
</header>
<div class="main-box-body clearfix">
<div class="table-responsive">
<table id="table-example" class="table table-hover">
<thead>
<tr>
<th>Name</th>
<th>Position</th>
<th>Office</th>
<th>Age</th>
<th>Start date</th>
<th>Salary</th>
</tr>
</thead>
<tbody>
<tr>
<td>Tiger Nixon</td>
<td>System Architect</td>
<td>Edinburgh</td>
<td>61</td>
<td>2011/04/25</td>
<td>$320,800</td>
</tr>
<tr>
<td>Garrett Winters</td>
<td>Accountant</td>
<td>Tokyo</td>
<td>63</td>
<td>2011/07/25</td>
<td>$170,750</td>
</tr>
<tr>
<td>Ashton Cox</td>
<td>Junior Technical Author</td>
<td>San Francisco</td>
<td>66</td>
<td>2009/01/12</td>
<td>$86,000</td>
</tr>
<tr>
<td>Cedric Kelly</td>
<td>Senior Javascript Developer</td>
<td>Edinburgh</td>
<td>22</td>
<td>2012/03/29</td>
<td>$433,060</td>
</tr>
<tr>
<td>Airi Satou</td>
<td>Accountant</td>
<td>Tokyo</td>
<td>33</td>
<td>2008/11/28</td>
<td>$162,700</td>
</tr>
<tr>
<td>Brielle Williamson</td>
<td>Integration Specialist</td>
<td>New York</td>
<td>61</td>
<td>2012/12/02</td>
<td>$372,000</td>
</tr>
<tr>
<td>Herrod Chandler</td>
<td>Sales Assistant</td>
<td>San Francisco</td>
<td>59</td>
<td>2012/08/06</td>
<td>$137,500</td>
</tr>
<tr>
<td>Rhona Davidson</td>
<td>Integration Specialist</td>
<td>Tokyo</td>
<td>55</td>
<td>2010/10/14</td>
<td>$327,900</td>
</tr>
<tr>
<td>Colleen Hurst</td>
<td>Javascript Developer</td>
<td>San Francisco</td>
<td>39</td>
<td>2009/09/15</td>
<td>$205,500</td>
</tr>
<tr>
<td>Sonya Frost</td>
<td>Software Engineer</td>
<td>Edinburgh</td>
<td>23</td>
<td>2008/12/13</td>
<td>$103,600</td>
</tr>
<tr>
<td>Jena Gaines</td>
<td>Office Manager</td>
<td>London</td>
<td>30</td>
<td>2008/12/19</td>
<td>$90,560</td>
</tr>
<tr>
<td>Quinn Flynn</td>
<td>Support Lead</td>
<td>Edinburgh</td>
<td>22</td>
<td>2013/03/03</td>
<td>$342,000</td>
</tr>
<tr>
<td>Charde Marshall</td>
<td>Regional Director</td>
<td>San Francisco</td>
<td>36</td>
<td>2008/10/16</td>
<td>$470,600</td>
</tr>
<tr>
<td>Haley Kennedy</td>
<td>Senior Marketing Designer</td>
<td>London</td>
<td>43</td>
<td>2012/12/18</td>
<td>$313,500</td>
</tr>
<tr>
<td>Tatyana Fitzpatrick</td>
<td>Regional Director</td>
<td>London</td>
<td>19</td>
<td>2010/03/17</td>
<td>$385,750</td>
</tr>
<tr>
<td>Michael Silva</td>
<td>Marketing Designer</td>
<td>London</td>
<td>66</td>
<td>2012/11/27</td>
<td>$198,500</td>
</tr>
<tr>
<td>Paul Byrd</td>
<td>Chief Financial Officer (CFO)</td>
<td>New York</td>
<td>64</td>
<td>2010/06/09</td>
<td>$725,000</td>
</tr>
<tr>
<td>Gloria Little</td>
<td>Systems Administrator</td>
<td>New York</td>
<td>59</td>
<td>2009/04/10</td>
<td>$237,500</td>
</tr>
<tr>
<td>Bradley Greer</td>
<td>Software Engineer</td>
<td>London</td>
<td>41</td>
<td>2012/10/13</td>
<td>$132,000</td>
</tr>
<tr>
<td>Dai Rios</td>
<td>Personnel Lead</td>
<td>Edinburgh</td>
<td>35</td>
<td>2012/09/26</td>
<td>$217,500</td>
</tr>
<tr>
<td>Jenette Caldwell</td>
<td>Development Lead</td>
<td>New York</td>
<td>30</td>
<td>2011/09/03</td>
<td>$345,000</td>
</tr>
<tr>
<td>Yuri Berry</td>
<td>Chief Marketing Officer (CMO)</td>
<td>New York</td>
<td>40</td>
<td>2009/06/25</td>
<td>$675,000</td>
</tr>
<tr>
<td>Caesar Vance</td>
<td>Pre-Sales Support</td>
<td>New York</td>
<td>21</td>
<td>2011/12/12</td>
<td>$106,450</td>
</tr>
<tr>
<td>Doris Wilder</td>
<td>Sales Assistant</td>
<td>Sidney</td>
<td>23</td>
<td>2010/09/20</td>
<td>$85,600</td>
</tr>
<tr>
<td>Angelica Ramos</td>
<td>Chief Executive Officer (CEO)</td>
<td>London</td>
<td>47</td>
<td>2009/10/09</td>
<td>$1,200,000</td>
</tr>
<tr>
<td>Gavin Joyce</td>
<td>Developer</td>
<td>Edinburgh</td>
<td>42</td>
<td>2010/12/22</td>
<td>$92,575</td>
</tr>
<tr>
<td>Jennifer Chang</td>
<td>Regional Director</td>
<td>Singapore</td>
<td>28</td>
<td>2010/11/14</td>
<td>$357,650</td>
</tr>
<tr>
<td>Brenden Wagner</td>
<td>Software Engineer</td>
<td>San Francisco</td>
<td>28</td>
<td>2011/06/07</td>
<td>$206,850</td>
</tr>
<tr>
<td>Fiona Green</td>
<td>Chief Operating Officer (COO)</td>
<td>San Francisco</td>
<td>48</td>
<td>2010/03/11</td>
<td>$850,000</td>
</tr>
<tr>
<td>Shou Itou</td>
<td>Regional Marketing</td>
<td>Tokyo</td>
<td>20</td>
<td>2011/08/14</td>
<td>$163,000</td>
</tr>
<tr>
<td>Michelle House</td>
<td>Integration Specialist</td>
<td>Sidney</td>
<td>37</td>
<td>2011/06/02</td>
<td>$95,400</td>
</tr>
<tr>
<td>Suki Burks</td>
<td>Developer</td>
<td>London</td>
<td>53</td>
<td>2009/10/22</td>
<td>$114,500</td>
</tr>
<tr>
<td>Prescott Bartlett</td>
<td>Technical Author</td>
<td>London</td>
<td>27</td>
<td>2011/05/07</td>
<td>$145,000</td>
</tr>
<tr>
<td>Gavin Cortez</td>
<td>Team Leader</td>
<td>San Francisco</td>
<td>22</td>
<td>2008/10/26</td>
<td>$235,500</td>
</tr>
<tr>
<td>Martena Mccray</td>
<td>Post-Sales support</td>
<td>Edinburgh</td>
<td>46</td>
<td>2011/03/09</td>
<td>$324,050</td>
</tr>
<tr>
<td>Unity Butler</td>
<td>Marketing Designer</td>
<td>San Francisco</td>
<td>47</td>
<td>2009/12/09</td>
<td>$85,675</td>
</tr>
<tr>
<td>Howard Hatfield</td>
<td>Office Manager</td>
<td>San Francisco</td>
<td>51</td>
<td>2008/12/16</td>
<td>$164,500</td>
</tr>
<tr>
<td>Hope Fuentes</td>
<td>Secretary</td>
<td>San Francisco</td>
<td>41</td>
<td>2010/02/12</td>
<td>$109,850</td>
</tr>
<tr>
<td>Vivian Harrell</td>
<td>Financial Controller</td>
<td>San Francisco</td>
<td>62</td>
<td>2009/02/14</td>
<td>$452,500</td>
</tr>
<tr>
<td>Timothy Mooney</td>
<td>Office Manager</td>
<td>London</td>
<td>37</td>
<td>2008/12/11</td>
<td>$136,200</td>
</tr>
<tr>
<td>Jackson Bradshaw</td>
<td>Director</td>
<td>New York</td>
<td>65</td>
<td>2008/09/26</td>
<td>$645,750</td>
</tr>
<tr>
<td>Olivia Liang</td>
<td>Support Engineer</td>
<td>Singapore</td>
<td>64</td>
<td>2011/02/03</td>
<td>$234,500</td>
</tr>
<tr>
<td>Bruno Nash</td>
<td>Software Engineer</td>
<td>London</td>
<td>38</td>
<td>2011/05/03</td>
<td>$163,500</td>
</tr>
<tr>
<td>Sakura Yamamoto</td>
<td>Support Engineer</td>
<td>Tokyo</td>
<td>37</td>
<td>2009/08/19</td>
<td>$139,575</td>
</tr>
<tr>
<td>Thor Walton</td>
<td>Developer</td>
<td>New York</td>
<td>61</td>
<td>2013/08/11</td>
<td>$98,540</td>
</tr>
<tr>
<td>Finn Camacho</td>
<td>Support Engineer</td>
<td>San Francisco</td>
<td>47</td>
<td>2009/07/07</td>
<td>$87,500</td>
</tr>
<tr>
<td>Serge Baldwin</td>
<td>Data Coordinator</td>
<td>Singapore</td>
<td>64</td>
<td>2012/04/09</td>
<td>$138,575</td>
</tr>
<tr>
<td>Zenaida Frank</td>
<td>Software Engineer</td>
<td>New York</td>
<td>63</td>
<td>2010/01/04</td>
<td>$125,250</td>
</tr>
<tr>
<td>Zorita Serrano</td>
<td>Software Engineer</td>
<td>San Francisco</td>
<td>56</td>
<td>2012/06/01</td>
<td>$115,000</td>
</tr>
<tr>
<td>Jennifer Acosta</td>
<td>Junior Javascript Developer</td>
<td>Edinburgh</td>
<td>43</td>
<td>2013/02/01</td>
<td>$75,650</td>
</tr>
<tr>
<td>Cara Stevens</td>
<td>Sales Assistant</td>
<td>New York</td>
<td>46</td>
<td>2011/12/06</td>
<td>$145,600</td>
</tr>
<tr>
<td>Hermione Butler</td>
<td>Regional Director</td>
<td>London</td>
<td>47</td>
<td>2011/03/21</td>
<td>$356,250</td>
</tr>
<tr>
<td>Lael Greer</td>
<td>Systems Administrator</td>
<td>London</td>
<td>21</td>
<td>2009/02/27</td>
<td>$103,500</td>
</tr>
<tr>
<td>Jonas Alexander</td>
<td>Developer</td>
<td>San Francisco</td>
<td>30</td>
<td>2010/07/14</td>
<td>$86,500</td>
</tr>
<tr>
<td>Shad Decker</td>
<td>Regional Director</td>
<td>Edinburgh</td>
<td>51</td>
<td>2008/11/13</td>
<td>$183,000</td>
</tr>
<tr>
<td>Michael Bruce</td>
<td>Javascript Developer</td>
<td>Singapore</td>
<td>29</td>
<td>2011/06/27</td>
<td>$183,000</td>
</tr>
<tr>
<td>Donna Snider</td>
<td>Customer Support</td>
<td>New York</td>
<td>27</td>
<td>2011/01/25</td>
<td>$112,000</td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-lg-12">
<div class="main-box clearfix">
<header class="main-box-header clearfix">
<h2>Long table with fixed header</h2>
</header>
<div class="main-box-body clearfix">
<div class="table-responsive">
<table id="table-example-fixed" class="table table-hover">
<thead>
<tr>
<td>Donna Snider</td>
<td>Customer Support</td>
<td>New York</td>
<td>27</td>
<td>2011/01/25</td>
<td>$112,000</td>
</tr>
</tbody>
</table>
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
 
<script src="js/jquery.dataTables.js"></script>
<script src="js/dataTables.fixedHeader.js"></script>
<script src="js/dataTables.tableTools.js"></script>
<script src="js/jquery.dataTables.bootstrap.js"></script>
 
<script src="js/scripts.js"></script>
<script src="js/pace.min.js"></script>
 
<script>
	$(document).ready(function() {
		var table = $('#table-example').dataTable({
			'info': false,
			'sDom': 'lTfr<"clearfix">tip',
			'oTableTools': {
	            'aButtons': [
	                {
	                    'sExtends':    'collection',
	                    'sButtonText': '<i class="fa fa-cloud-download"></i>&nbsp;&nbsp;&nbsp;<i class="fa fa-caret-down"></i>',
	                    'aButtons':    [ 'csv', 'xls', 'pdf', 'copy', 'print' ]
	                }
	            ]
	        }
		});
		
	    //var tt = new $.fn.dataTable.TableTools( table );
		//$( tt.fnContainer() ).insertBefore('div.dataTables_wrapper');
		
		var tableFixed = $('#table-example-fixed').dataTable({
			'info': false,
			'pageLength': 50
		});
		
		new $.fn.dataTable.FixedHeader( tableFixed );
	});
	</script>

  </body>
</html>
