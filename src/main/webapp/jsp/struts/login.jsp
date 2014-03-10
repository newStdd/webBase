<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/common/common.jsp"%>
	</head>
	<body>
		<%@ include file="/jsp/header.jsp"%>
	      <s:form name="login" action="login!login" method="post" >
          <s:textfield name="username" label="帐号"></s:textfield>
          <s:password name="password"  label="密码"></s:password>
          <s:submit></s:submit>
      </s:form>
	</body>
</html>