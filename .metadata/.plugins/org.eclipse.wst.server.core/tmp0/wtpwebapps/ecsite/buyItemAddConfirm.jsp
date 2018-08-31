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
<title>BuyItemAddConfirm</title>

<style type="text/css">
</head>
<body>


	table{
	text-align:center;
	margin:0 auto;
	}

	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}



	#main {
		width:100%;
		height:500px;
		text-align:center;
	}

	#text-center{
			display:inline-block;
			text-align:center;
}
</style>

</body>


	<div id="main">
		<div id="top">
			<p>BuyItemAddConfirm</p>
		</div>

		<div id="text-center">

				<table>
				<s:form action="BuyItemAddCompleteAction" >
					<tr>
						<td>Id</td>
						<td><s:property value="id" /></td>
					</tr>

					<tr>
						<td>商品名</td>
						<td><s:property value="itemName" /></td>
					</tr>

					<tr>
						<td>商品価格</td>
						<td><s:property value="itemPrice" /></td>
					</tr>

					<tr>
						<td>商品個数</td>
						<td><s:property value="itemStock" /></td>
					</tr>

					<tr>
						<td>
							<input type="button" value="完了" onclick="submitAction('BuyItemAddCompleteAction')" />
						</td>
					</tr>
					</s:form>
				</table>

		</div>
	</div>

</html>