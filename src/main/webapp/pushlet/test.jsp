<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/common/head.jsp"%>
    <script type="text/javascript" src="./js/ajax-pushlet-client.js"></script>
    <script type="text/javascript"> 
    		PL.webRoot= '<%=basePath%>';
        PL._init(); 
        PL.joinListen('myevent1'); 
        function onData(event) { 
        	$("#textarea_1").html(event.get("key1"));
        } 
     </script>
</head>
<body>
<textarea id="textarea_1"></textarea>
</body>
</html>