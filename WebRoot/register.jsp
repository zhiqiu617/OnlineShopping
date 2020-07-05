﻿<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/cascade.js" type="text/javascript"></script>
<script src="js/registerCheck.js" type="text/javascript"></script>
<title>用户注册</title>
<!-- <link href="css/register.css" rel="stylesheet" type="text/css"> -->
</head>
<body>
	<!--顶部区域 start-->
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		class="top_line">
		<tr>
			<td bgcolor="#f7f7f7">
				<table width="1200" border="0" cellspacing="0" cellpadding="0"
					align="center">
					<tr>
						<td class="padding-top"><img alt="收藏"
							src="photo/index/store.png" width="18" height="18">收藏|HI，欢迎来订购！
							<a href="login.jsp" class="orange">[请登录]</a> <a
							href="register.jsp" class="orange">[免费注册]</a></td>
						<td align="right">客户服务<img alt="arrow"
							src="photo/index/menu.png" width="18" height="18">&nbsp;
							网站导航<img alt="arrow" src="photo/index/site.png" width="18"
							height="18">&nbsp; <span class="droparrow"> <span
								class="shopcart"></span>我的购物车 <span class="orange">0</span>件<img
								alt="arrow" src="photo/index/shoppingcar.png" width="18"
								height="18">
						</span>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<!--顶部区域end-->
	<!--  logo和 banner start-->
	<table width="1200px" border="0" cellspacing="0" cellpadding=0
		" align="center">
		<tr>
			<td height="95"><a href=" "><img
					src="photo/index/banner7.jpg" width="1600" height="180"></a></td>
		</tr>
	</table>

	<!-- 菜单导航 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		bgcolor="#ce2626">
		<tr>
			<td>
				<table width="1200" border="0" cellspacing="0" cellpadding="4"
					align="center" class="nav_font16">
					<tr>
						<td width="200" height="30px">&nbsp;</td>
						<td width="80" align="center" class="nav_active">
						  <a href="shoppingIndex.jsp" class="white">首页</a></td>
						<td width="100" align="center">最新上架</td>
						<td width="100" align="center">品牌活动</td>
						<td width="100" align="center">原厂直供</td>
						<td width="80" align="center">团购</td>
						<td width="100" align="center">限时抢购</td>
						<td width="100" align="center">促销打折</td>
						<td width="200" align="center">&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>


	<!--  注册部分 start-->
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		bgcolor="#f8f8f8">
		<tr>
			<td>
				<table
					style="background-image: url('photo/register_bg1.jpg'); background-position: center;"
					width="92%" border="0" cellspacing="0" cellpadding="0"
					bgcolor="#ffffff" align="center">
					<tr>
						<td valign="top"><h2 align="center">用户注册</h2>
							<hr width="90%" align="center" color="#ccc" /></td>
						<td width="30" rowspan="2" align="middle"><img src=""
							align="right" /></td>
					</tr>
					<tr>
						<td valign="top">
							<!-- enctype="multipart/form-data" -->
							<form action="userform" method="post" name="register">
								<table width="90%" border="0" cellspacing="0" cellpadding="0"
									class="reg" align="center">
									<tr>
										<td width="80" align="center" height="60px">用户名：</td>
										<td><input name="userName" type="text"
											style="width: 400px; height: 38px;"
											onpropertychange="userName.innerHTML=''" placeholder="请输入用户名">&nbsp;
											<b><span id="userName" style="color: red"></span></b></td>
									</tr>

									<tr>
										<td width="80" align="center" height="60px">邮箱地址：</td>
										<td><input name="email" type="text"
											style="width: 400px; height: 38px;"
											onpropertychange="email.innerHTML=''" placeholder="请输入邮箱地址">&nbsp;
											<b><span id="email" style="color: red"></span></b></td>
									</tr>

									<tr>
										<td width="80" align="center" height="60px">设置密码：</td>
										<td><input name="userPwd"
											style="width: 400px; height: 38px;" type="password"
											onpropertychange="userPwd.innerHTML=''">&nbsp; <b><span
												id="userPwd" style="color: red"></span></b></td>
									</tr>

									<tr>
										<td>&nbsp;</td>
										<td class="gray12">6-12个字符，由字母、数字和符号的两种以上组合。&nbsp;</td>
									</tr>

									<tr>
										<td width="80" align="center" height="60px">确认密码：</td>
										<td><input name="userRePwd" type="password"
											style="width: 400px; height: 38px;"
											onpropertychange="userRePwd.innerHTML=''">&nbsp; <b><span
												id="userRePwd" style="color: red"></span></b></td>
									</tr>


									<tr>
										<td width="80" align="center" height="60px">真实姓名：</td>
										<td><input name="realName" type="text"
											style="width: 400px; height: 38px;"
											onpropertychange="realName.innerHTML=''"
											placeholder="请输入真实姓名">&nbsp; <b><span
												id="realName" style="color: red"></span></b></td>
									</tr>


									<tr>
										<td width="80" align="center" height="40px">您的性别：</td>
										<td><input type="radio" name="sex" value="radio" checked />男
											<input type="radio" name="sex" value="radio" />女</td>
									</tr>


									<tr>
										<td width="80" align="center" height="60px">上传头像：</td>
										<td><input type="file"
											style="width: 400px; height: 38px; color: white;"
											name="headPic">&nbsp; <b><span id="headPic"
												style="color: red"></span></b></td>
									</tr>

									<tr>
										<td width="80" align="center" height="60px">您的手机：</td>
										<td><input name="mobile" type="text"
											style="width: 400px; height: 38px;"
											onpropertychange="mobile.innerHTML=''" placeholder="请输入您的手机号">&nbsp;
											<b><span id="mobile" style="color: red"></span></b></td>
									</tr>

									<tr>
										<td width="180" align="center" height="60px">单位地址：</td>
										<td><select id="cmbProvince" name="cmbProvince"
											style="height: 38px;"></select> <select id="cmbCity"
											name="cmbCity" style="height: 38px;"></select> <select
											id="cmbArea" name="selectAddress" style="height: 38px;"
											onpropertychange="selectAddress.innerHTML=''">&nbsp;
												<b><span id="selectAddress" style="color: red"></span></b>
										</select> <input name="address" onpropertychange="address.innerHTML=''"
											type="text" style="width: 300px; height: 38px;"
											placeholder="详细地址">&nbsp; <b><span id="address"
												style="color: red"></span></b> <script type="text/javascript"> 
 addressInit('cmbProvince', 'cmbCity', 'cmbArea');
</script></td>
									</tr>


									<tr>
										<td width="80" align="center" height="38px">您的爱好：</td>
										<td><input name="hobby" type="checkbox" value="购物" />购物 <input
											name="hobby" type="checkbox" value="影视" />影视 <input
											name="hobby" type="checkbox" value="餐饮" />餐饮</td>
									</tr>
									<tr>
										<td width="80" align="center" height="38px">协议内容：</td>
										<td><textarea rows="3" cols="30"></textarea></td>
									</tr>


									<tr>
										<td>&nbsp;</td>
										<td style="height: 50px;"><input type="button"
											style="height: 30px; width: 80px;" name="b_submit"
											onclick="register_submit()" value="提交" /></td>
									</tr>
								</table>
							</form>
						</td>
					</tr>
				</table> <!-- 三大模块图片 -->
				<table width="1000" border="0" cellspacing="0" cellpadding="0"
					align="center" bgcolor="#FFFFFF" class="padding-bottom">
					<tr>

						<td align="center"><img src="" class="" /></td>
						<td align="center"><img src="" class="" /></td>
						<td align="center"><img src="" class="" /></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

	<p align="center" class="padding-top">
		Copyright 2015-2020 LZW Fashion OnlineShop <br /> ZQU Guangdong China
		咨询热线：12345678901
	</p>
	<br />
	<!-- 版权信息 -->

</body>
</html>
