<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TokenRequest</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/oauth2/access_token" method="post">
<input type="hidden" value="authorization_code" name="grant_type"/>
<input type="text" value="client_id_value" name="client_id"/>
<input type="hidden" value="scope" name="scope"/>
<input type="hidden" value="stateasadas" name="state"/>
<input type="hidden" value="redirect_uri" name="redirect_uri"/>
<input type="hidden" value="code-----" name="code"/>
<input type="submit" value="token"/>
</form>
</body>
</html>