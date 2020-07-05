<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtm11/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtm1">
<!-- 购物列表_商品展示区 -->
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>购物列表-商品展示</title>
<style type="text/css">
* {
	padding: O;
	margin: 0
}

li, ul {
	list-style: none
}

body {
	font-size: 12px;
	font-family: microsoft yahei;
	margin: 0;
	color: #000
}

.middle {
	float: left;
	width: 690px
}

.pic_list {
	float: left
}

pic_list dl {
	float: left;
	width: 152px;
	margin: 010px10px
}

.price {
	font-size: 15px;
	font-weight: 700;
	color: red;
	float: left
}

.price2 {
	font-size: 12px;
	font-weight: 700;
	color: red;
	text-align: center
}

.font12 {
	font-size: 12px;
	color: #ccc;
	float: right
}

.pic_list dl img {
	padding: 5px;
	border: 1px solid #ccc;
	margin-bottom: 10px
}

.pic_list dl dd {
	float: left
}

.pic_title {
	background: #ff9c01;
	line-height: 40px;
	font-size: 16px;
	text-indent: 20px;
	text-align: left;
	width: 680px;
	float: left;
	color: #fff;
	margin: 010px 10px
}

pic_list2 li {
	float: left
}

pic_list2 {
	margin: 06px012px
}

pic_list2 li {
	width: 160px;
	float: leftimargin:5px 4px
}
</style>
</head>

<body>
	<!-- 中间区start -->
	<div class="middle">
		<h1 class="pic_title">最新上架</h1>
		<div class="pic_list">
			<script type="text/javascript">
              var images = ["girl1.jpg","boy1.jpg","child1.jpg","活着.jpg","篮球.jpg","零食1.jpg",
                  "蔬果1.jpg","huli2.png","jiadian2.png"];
              var prices = ["298.5","199.0","269.0","49.9","100.8","28.0","68.0","130.9","299.9"];
              var buyers = [180,320,900,480,789,890,543,788,678];
              var contents = ["雾霾蓝双面羊绒大衣女中长款2018新款阿尔巴卡羊驼绒羊毛呢子外套",
                              "WOOG2005白色连帽夹克男2018春秋季韩版潮流修身休闲短款带帽外套",
                              "童泰连帽加厚棉套装婴儿衣服宝宝棉衣秋冬加厚棉袄",
                              "活着（新版）余华作品 畅销中国近现代小说 张艺谋电影改编 现代/当代社会文学读物丛书 畅销书籍",
                              "李宁 7号6号5号篮球女青少年儿童篮球小学生室外成人耐磨正品蓝球",
                              "【良品铺子综合果仁750g装】每日坚果30包混合干果孕妇零食大礼包 ",
                              "王小二 四川攀枝花凯特大芒果应季新鲜水果包邮整箱10斤当季青芒",
                              "欧莱雅积雪草微精华露女紧致抗皱淡纹修护保湿爽肤水秋冬季补水",
                              "DBC-A06D1春饼机春卷皮家用电饼铛千层皮烙饼神器"];
              for(var i=0;i<images.length;i++){
                  var goodsInfo = "<dl><div><img src='photo/" + images[i]
                      + "'/></div?<dt><span class='price'>￥" + price[i]
                      + "元</span><span class='font12'>" + buyers[i] + "人购买</span></dt><dd>"
                      + contents[i] + "</dd></dl>";
                  document.write(goodsInfo);
              }                
          </script>
		</div>
		<!-- 品牌活动 -->
		<h1 class="pic_titile">品牌活动</h1>
		<ul class="pic_list2">
			<script type="text/javascript">
          var images = ["boy2.jpg","boy3.jpg","girl2.jpg","girl3.jpg"];
          var contents = ["SELECTED思莱德冬季含羊毛羊绒中长款男毛呢大衣外套S|417427519",
                          "森马长袖衬衫男2018秋季新款男士翻领纯棉格子衬衣ins超火寸衫",
                          "NH奈社日系撞色格子棉衬衣秋冬前短后长休闲磨毛抗皱厚衬衫外套女",
                          "早秋卫衣2018新款女长袖韩版宽松学生ins超火的上衣外套潮秋冬季"];
          for(var i in images){
              var goodsInfo = "<li><img src='photo/" + images[i] + "'/><p>"
                  + contents[i] + "</p></li>";
              document.write(goodsInfo);
          }
      </script>
			<!-- 中间区end -->
	</div>


</body>
</html>
