<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="no" />
<meta name="keywords" content="" />
<title>BuyItemAdd</title>


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

</head>
<body>

	<div id="header">

	</div>

	<div id="main">
		<div id="top">
			<p>BuyItemAdd</p>
		</div>

		<div id="text-center">
			<table>
				<s:form action="BuyItemAddConfirmAction">

					<tr>
						<td>ID</td>

						<td>
							<input type="text" name="id" value="">
						</td>
					</tr>

					<tr>
						<td>パスワード</td>


						<td>
							<input type="text" name="itemName" value="">
						</td>
					</tr>

					<tr>
						<td>価格</td>

						<td>
							<input type="text" name="itemPrice" value="">
						</td>
					</tr>

					<tr>
						<td>個数</td>

						<td>
							<input type="text" name="itemStock" value="">
						</td>
					</tr>

					<tr>
							<td><input type="submit" value="送信"></td>
					</tr>

				</s:form>

			</table>

		</div>
	</div>


</body>
</html>