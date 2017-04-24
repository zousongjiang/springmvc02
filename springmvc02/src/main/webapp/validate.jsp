<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();//项目名称
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证页面</title>

<style type="text/css">
font {
	color: red;
	font-size: 11px
}
</style>

</head>
<body>

	<sf:form action="validates/rule" method="post" modelAttribute="errs">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName" /><font><sf:errors
							delimiter="," path="userName"></sf:errors></font></td>
				<td>年龄：</td>
				<td><input type="text" name="age" /><font><sf:errors
							delimiter="," path="age"></sf:errors></font></td>
			</tr>
			<tr>
				<td>出生日期：</td>
				<td colspan="3"><input type="text" name="birthday" /><font><sf:errors
							delimiter="," path="birthday"></sf:errors></font></td>
			</tr>
			<tr>
				<td>是否婚配：</td>
				<td><input type="radio" name="marry" checked="checked"
					value="true" />是 <input type="radio" name="marry" value="false" />否
					<font><sf:errors delimiter="," path="marry"></sf:errors></font></td>
				<td>年收入：</td>
				<td><input type="text" name="income" /> <font><sf:errors
							delimiter="," path="income"></sf:errors></font></td>
			</tr>
			<tr>
				<td>个人兴趣：</td>
				<td colspan="3"><input type="checkbox" name="hobby" value="0" />看片儿
					<input type="checkbox" name="hobby" value="1" />打篮球 <input
					type="checkbox" name="hobby" value="2" />踢足球 <input type="checkbox"
					name="hobby" value="3" />撩汉子</td>
			</tr>

			<tr>
				<td>地址1：</td>
				<td><input type="text" name="adds[0].address" /></td>
				<td>地址2：</td>
				<td><input type="text" name="adds[1].address" /></td>
			</tr>

			<tr>
				<td>妻子1：</td>
				<td><input type="text" name="wifes[0].wifeName" /></td>
				<td>妻子2：</td>
				<td><input type="text" name="wifes[1].wifeName" /></td>
			</tr>

			<tr>
				<td>妻子3：</td>
				<td colspan="3"><input type="text" name="wifes[2].wifeName" /></td>
			</tr>

			<tr>
				<td>特长1：</td>
				<td><input type="text" name="maps['a']" /></td>
				<td>特长2：</td>
				<td><input type="text" name="maps['b']" /></td>
			</tr>

			<tr>
				<td>当前角色：</td>
				<td colspan="3"><select name="role.id">
						<option value="0">班长</option>
						<option value="1">副班</option>
						<option value="2">小喽喽</option>
				</select></td>
			</tr>

			<tr>
				<td colspan="4"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</sf:form>












</body>
</html>