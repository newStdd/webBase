<%
	String fullPath= request.getScheme()+ "://"+ request.getServerName()+ ":"+ request.getServerPort()+ request.getContextPath()+ "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="<%=fullPath%>js/jquery-1.10.1.js"></script>
<link type="text/css" rel="stylesheet" href="<%=fullPath%>css/css.css">
