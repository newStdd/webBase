<%
	String path= request.getContextPath();
	String basePath= request.getScheme()+ "://"+ request.getServerName()+ ":"+ request.getServerPort()+ path+ "/";
%>
<script type="text/javascript" src="<%=path%>/js/jquery-1.10.1.js"></script>
<link type="text/css" rel="stylesheet" href="<%=path%>/css/css.css">
