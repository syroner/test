<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>管理者画面</title>

<style type="text/css">

#main{
	widh:100%;
	height:500px;
	text-align:center;
}

#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
}

table{
	text-align:center;
	margin:0 auto;
}

.box{text-align:center;
	marigin:0 auto;

}

#text-center{
		display:display:inline;
		text-align:center;

}



}
</style>

</head>
<body>

	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>

		<div id="text-center">

				<div class="box">
					<table>

						<tr>
							<td>商品</td>
						</tr>


					<s:form action="BuyItemAddAction">
						<tr>

							<td>
								<input type="submit" value="追加">
							</td>
						</tr>

					</s:form>

						<tr>


							<td>
								<input type="submit"  value="一覧">
							</td>
						</tr>



					</table>
				</div>


					<table>

						<tr>
							<td>ユーザー</td>
						</tr>

						<s:form action="UserCreateAction">
						<tr>
							<td>
								<input type="submit" value="追加">
							</td>
						</tr>
						</s:form>


						<s:form action="UserListAction">
						<tr>
							<td>
								<input type="submit"  value="一覧">
							</td>
						</tr>

						</s:form>
					</table>

			</div>
		</div>



</body>
</html>