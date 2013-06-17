<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/common/head.jsp"%>
    <script type="text/javascript" src="./js/ajax-pushlet-client.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=8261c4a00ba9e82d1a1a9b287cde69ea"></script>
    <link type="text/css" rel="stylesheet" href="./css/test.css">
    <script type="text/javascript"> 
	    PL.webRoot= '<%=basePath%>';
	    PL._init(); 
	    PL.joinListen('myevent1'); 
	    function onData(event) { 
	    	var message= event.get('sysDate')+ '\n';
	    	var textarea = $('#textarea_1').append(message);
	    	textarea.scrollTop(textarea[0].scrollHeight - textarea.height());
	    	var map = new BMap.Map("div_x2");
	    	var point = new BMap.Point(116.400244,39.92556);
	    	map.centerAndZoom(point, 12);	    	
	    	var marker = new BMap.Marker(point);  // 创建标注
	    	map.addOverlay(marker);              // 将标注添加到地图中
	    	var label = new BMap.Label(message,{offset:new BMap.Size(20,-10)});
	    	marker.setLabel(label);	    	
	    } 
    </script>
<style type="text/css">
body, html,#div_x2 {width: 100%;height: 100%;overflow: hidden;margin:0;}
#l-map{height:100%;width:78%;float:left;border-right:2px solid #bcbcbc;}
#r-result{height:100%;width:20%;float:left;}
</style>    
</head>
<body>
	<div id="div_x1">
		<textarea id="textarea_1" readonly="readonly"></textarea>	
	</div>
	<div id="div_x2"></div>
</body>
</html>