<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />

<title>ユーザーリスト</title>

<style type="text/css">


table{
	text-align:center;
	margin:0 auto;
}

#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
}

#main{
	width:100%;
	heigiht:500px;
	text-align:center;
}

#text-center{
			display:inline-block;
			text-align:center;
	}

</style>
</head>
<body>
	<div id="header">

	</div>

	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>

		<div>
			<table>
				<s:iterator value="userList">

				<tr>
					<td>ログインId</td>
					<td>ログインパスワード</td>
					<td>ユーザー名</td>
					<td>Id</td>
					<td>日時</td>
				</tr>

				<tr>
					<td><s:property value="loginId" /></td>

					<td><s:property value="loginPassword" /></td>

					<td><s:property value="userName" /></td>

					<td><s:property value="id" /></td>

					<td><s:property value="insert_date" /></td>
				</tr>
				</s:iterator>
			</table>
		</div>
	</div>


</body>
</html>