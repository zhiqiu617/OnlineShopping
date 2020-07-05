<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="bean.goodsBean" %>
<html>
<head>
<title>支付订单</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/detail.css">
<link rel="stylesheet" type="text/css" href="css/payment.css">
</head>
<body>


 <!-- 顶部区域start -->
      <header class="top_bg">
        <div class="top_document">
          <div class="floatl">
            <img src="photo/index/store.png" width="18" height="18">收藏|HI，欢迎来订购！
          
          </div>
          <div class="floatr">
                        客户服务<img src="photo/index/menu.png" width="18" height="18">&nbsp;
                        网站导航<img src="photo/index/site.png" width="18" height="18">&nbsp;
            <span class="droparrow">
            <span class="shopcart"></span>我的购物车
            <img alt="arrow" src="photo/index/shoppingcar.png" width="18" height="18"></span>
          </div>
        </div>
      </header>
      <!-- 顶部区域end -->
        <!-- logo和banner start -->
      <div class="logo">
        <img src="photo/index/banner1.jpg" width="100%" height="180">
      </div>
      <!-- logo和banner end -->
      
	<div
		style="background: url(); width: 720; height: 583; position: absolute; left: 250px; top: 50px;">
		<form action="" method="post">
			<table border="1" bordercolor="lightgrey" bgcolor="#F9F9F9"
				width="600" height="200" rules="none" cellpadding="0"
				cellspacing="0" style="margin-top: 230">
				<tr>
				<%
              			ArrayList buylist = (ArrayList) session.getAttribute("buylist");
             			 double total = 0;
             			  for(int i=0;i<buylist.size();i++){
                              goodsBean single = (goodsBean)buylist.get(i);
                              double price = single.getGoodsPrice();
                              int buynum = single.getGoodsNum();
                              double pay = ((int)((price*buynum+0.05f)*10))/10f;
                              total += pay;
             			  }
                  %>
					<td style="padding-left: 100">订单号：<font color="red">${param.orderid}</font>，您需要支付：<font color="red">￥<%=Math.round(total*100)/100.0 %></font><br><br>
						您选择的是货到付款支付方式，按照您指定的时间，我们将按时送货到门，请准备好Money！^_^ <br>

					</td>
				</tr>
				<tr>
					<td><input type="button" class="input3" value="返回商城首页" 
					onclick="window.location.href('shoppingIndex.jsp')" ></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>
