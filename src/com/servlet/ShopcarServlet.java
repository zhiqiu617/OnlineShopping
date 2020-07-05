package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopcarServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String servletpath = request.getServletPath();
		/*
		 * if("/buy".equals(servletpath)) buy(request,response);
		 */
		/*
		 * else if("/showshopcar".equals(servletpath))
		 * showshopcar(request,response); else if("/remove".equals(servletpath))
		 * remove(request,response); else
		 * if("/clearshopcar".equals(servletpath)) clear(request,response);
		 */
		if ("/submitshopcar".equals(servletpath))
			submitDispatcher(request, response);
		else if ("/createorderform".equals(servletpath))
			createorderform(request, response);
	}

	/** @功能：购买商品 */
	/*
	 * protected void buy(HttpServletRequest request, HttpServletResponse
	 * response)throws ServletException, IOException { String message="";
	 * 
	 * Integer
	 * buygoodsid=StringHandler.strToint(request.getParameter("buygoodsId"));
	 * if(buygoodsid==null){ message="<li>商品ID值错误！</li>";
	 * message+="<a href='window.history.go(-1)'>返回</a>"; } else{ //try { //Date
	 * now=new Date(); //获取当前时间 //TempDao tempDao=new TempDao(); //String
	 * shopcarid=seeshopcarcookie(request,response); //查询客户端Cookie中是否保存了一个购物车ID值
	 * 
	 * if(shopcarid==null||shopcarid.equals("")||!tempDao.isexist(shopcarid)){
	 * //没有保存 shopcarid=addshopcarcookie(request,response,now);
	 * //生成一个购物车ID保存到客户端Cookie中，并返回该ID值 tempDao.saveShopcarCreateTime(shopcarid,
	 * StringHandler.timeTostr(now)); //记录该购物车ID和创建时间到数据表中 }
	 * 
	 * int i=-1; // ShopcarDao shopcarDao=new ShopcarDao(); //Object[]
	 * params={shopcarid,buygoodsid}; if(shopcarDao.isBuy(params)) //如果已经购买了该商品
	 * i=shopcarDao.addBuyNum(params); //更新商品购买数量 else{ //没有购买该商品 params=new
	 * Object[]{shopcarid,buygoodsid,1}; i=shopcarDao.addBuyGoods(params);
	 * //添加该商品到购物车(tb_shopcar数据表)中 } shopcarDao.closed();
	 * 
	 * if(i<=0) message="<li>添加商品到购物车失败！</li><br>"; else
	 * message="<li>添加商品到购物车成功！</li><br>";
	 * message+="<a href='javascript:window.history.go(-1)'>返回</a>";
	 * message+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	 * message+="<a href='showshopcar'>查看购物车<a/>"; } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 * 
	 * request.setAttribute("message",message); RequestDispatcher
	 * rd=request.getRequestDispatcher("/message.jsp");
	 * rd.forward(request,response); }
	 */
	private String seeshopcarcookie(HttpServletRequest request, HttpServletResponse response) {
		String webname = request.getContextPath();
		webname = webname.substring(1);

		Cookie[] coks = request.getCookies();
		String shopcarid = "";

		int i = 0;
		for (; i < coks.length; i++) {
			Cookie icok = coks[i];
			if (icok.getName().equals(webname + ".usershopcar")) {
				shopcarid = icok.getValue();
				break;
			}
		}
		return shopcarid;
	}

	/*
	 * private String addshopcarcookie(HttpServletRequest
	 * request,HttpServletResponse response,Date date){ String
	 * webname=request.getContextPath(); webname=webname.substring(1); String
	 * shopcarid="car"+StringHandler.getSerial(date); Cookie shopcar=new
	 * Cookie(webname+".usershopcar",shopcarid); shopcar.setPath("/"); int
	 * maxage=60*60*24*3; //设置cookie的有效期为3天 shopcar.setMaxAge(maxage);
	 * response.addCookie(shopcar); return shopcarid; }
	 */
	/*
	 * protected void showshopcar(HttpServletRequest request,
	 * HttpServletResponse response)throws ServletException, IOException {
	 * String shopcarid=seeshopcarcookie(request,response);
	 * if(shopcarid!=null&&!shopcarid.equals("")){ //ShopcarBean shopcar=new
	 * ShopcarDao().getShopcar(shopcarid);
	 * request.setAttribute("shopcar",shopcar); } RequestDispatcher
	 * rd=request.getRequestDispatcher("/showShopcar.jsp");
	 * rd.forward(request,response); }
	 */
	/*
	 * protected void remove(HttpServletRequest request, HttpServletResponse
	 * response)throws ServletException, IOException { Integer
	 * goodsId=StringHandler.strToint(request.getParameter("goodsId")); String
	 * shopcarid=seeshopcarcookie(request,response);
	 * 
	 * if(shopcarid!=null&&!shopcarid.equals("")&&goodsId!=null){ ShopcarDao
	 * shopcarDao=new ShopcarDao(); int
	 * i=shopcarDao.deleteGoods(shopcarid,goodsId); if(i<=0)
	 * request.setAttribute("message","●删除商品失败！"); else
	 * request.setAttribute("message","●删除商品成功！"); shopcarDao.closed(); }
	 * showshopcar(request,response); }
	 */
	/*
	 * protected void clear(HttpServletRequest request, HttpServletResponse
	 * response)throws ServletException, IOException { String
	 * shopcarid=seeshopcarcookie(request,response);
	 * if(shopcarid!=null&&!shopcarid.equals("")){ ShopcarDao shopcarDao=new
	 * ShopcarDao(); int i=shopcarDao.clearShopcar(shopcarid); if(i<=0)
	 * request.setAttribute("message","●清空购物车失败！"); else
	 * request.setAttribute("message","●清空购物车成功！"); shopcarDao.closed(); }
	 * RequestDispatcher rd=request.getRequestDispatcher("/showShopcar.jsp");
	 * rd.forward(request,response); }
	 */

	protected void submitDispatcher(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String whichsubmit = request.getParameter("whichsubmit");
		if (whichsubmit == null)
			payforMoney(request, response);
		else
			updatebuyNum(request, response);
	}

	private void payforMoney(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (shopcar_validateBuyNum(request, response)) {
			String buygoodsids = StringHandler.ArrayToString(request.getParameterValues("buygoodsids"));
			String buygoodsnum = StringHandler.ArrayToString(request.getParameterValues("buygoodsnum"));

			request.setAttribute("buygoodsids", buygoodsids);
			request.setAttribute("buygoodsnum", buygoodsnum);
			RequestDispatcher rd = request.getRequestDispatcher("/fillOrderform.jsp");
			rd.forward(request, response);
		}
		// else
		// showshopcar(request,response);
	}

	protected void updatebuyNum(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		shopcar_validateBuyNum(request, response);
		// showshopcar(request,response);
	}

	private boolean shopcar_validateBuyNum(HttpServletRequest request, HttpServletResponse response) {
		boolean mark = true;
		String[] goodsStoreNums = request.getParameterValues("buygoodsstorenum");
		String[] buyNums = request.getParameterValues("buygoodsnum");
		String[] goodsIds = request.getParameterValues("buygoodsids");
		String shopcarid = seeshopcarcookie(request, response);

		if (goodsIds != null && goodsIds.length != 0 && shopcarid != null) {

			// Map messages=new HashMap();
			Object[] params = new Object[3];
			// ShopcarDao shopcarDao=new ShopcarDao();
			for (int i = 0; i < goodsIds.length; i++) {
				int int_buyNum = Integer.parseInt(buyNums[i]);
				int int_goodsStoreNums = Integer.parseInt(goodsStoreNums[i]);

				if (int_buyNum > int_goodsStoreNums) {
					mark = false;
					// messages.put(i,"⊥库存不足！");
				}
				// else if(int_buyNum<=0)
				// shopcarDao.deleteGoods(shopcarid,
				// Integer.parseInt(goodsIds[i]));
				else {
					params[0] = int_buyNum;
					params[1] = shopcarid;
					params[2] = goodsIds[i];
					// shopcarDao.updateBuyNum(params);
					// messages.put(i,"√修改成功！");
				}
			}
			// request.setAttribute("messages",messages);
			// shopcarDao.closed();
		} else
			mark = false;
		return mark;
	}

	/*
	 * private boolean createorderform_validateBuyNum(HttpServletRequest
	 * request){ boolean mark=true; String
	 * ids=request.getParameter("buygoodsids"); //String
	 * nums=request.getParameter("buygoodsnum"); String[]
	 * goodsIds=ids.split(","); //String[] buyNums=nums.split(",");
	 * 
	 * @SuppressWarnings("rawtypes") HashMap messages=new HashMap(); //GoodsDao
	 * goodsDao=new GoodsDao(); for(int i=0;i<goodsIds.length;i++){ //int
	 * int_buyNum=Integer.parseInt(buyNums[i]); //int
	 * int_goodsStoreNums=goodsDao.getGoodsStoreNum(Integer.parseInt(goodsIds[i]
	 * )); //if(int_buyNum>int_goodsStoreNums){ // mark=false; //
	 * messages.put(i,"⊥库存不足！"); //} }
	 * request.setAttribute("messages",messages); return mark; }
	 */
	private void createorderform(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html,utf-8"); 
		request.setCharacterEncoding("utf-8");
		System.err.println("1234");
		// String buygoodsids=request.getParameter("buygoodsids");
		// if(buygoodsids!=null&&!buygoodsids.equals("")){
		// if(!createorderform_validateBuyNum(request)){
		// showshopcar(request,response);
		// }
		// else{
		// String forward="";
		// String buygoodsnum=request.getParameter("buygoodsnum");
		//int loginerid = ((UserBean) request.getSession().getAttribute("loginer")).getId();
		String getter = request.getParameter("getter");
		String address = request.getParameter("address");
		String postalcode = request.getParameter("postalcode");
		String telephone1 = request.getParameter("telephone1");
		String telephone2 = request.getParameter("telephone2");
		String linkphone = telephone1 + "," + telephone2;
		String shipment = request.getParameter("shipment");
		String shipmenttime = request.getParameter("shipmenttime");
		if (shipmenttime == null)
			shipmenttime = "-1";
		String payment = request.getParameter("payment");
		String networkpayment = request.getParameter("networkpayment");
		if (networkpayment == null)
			networkpayment = "-1";
		//float goodsprices = Float.parseFloat(request.getParameter("goodsprices"));
		String time = StringHandler.timeTostr(new Date());
		String status = "1";

		/** 计算订单总价格：根据选择的＂送货方式＂加入运费 */
		float totalprices = 0;
		/*if (shipment.equals("1"))
			//totalprices = 20 + goodsprices;
		else if (shipment.equals("2"))
			//totalprices = 30 + goodsprices;
		else if (shipment.equals("3"))
			//totalprices = 40 + goodsprices;

		request.setAttribute("goodsprices", goodsprices);
		request.setAttribute("totalprices", totalprices);*/

		// Object[]
		// params={loginerid,getter,address,postalcode,linkphone,shipment,shipmenttime,payment,networkpayment,totalprices,time,status,buygoodsids,buygoodsnum};
		String forward = "";
		forward = "/showOrderform.jsp";
		// OrderformDao orderformDao=new OrderformDao();
		// int i=orderformDao.addOrderform(params);
		/*
		 * if(i<=0){ forward="/message.jsp"; String message="<li>生成订单失败！</li>";
		 * message+="<a href='javascript:window.history.go(-1)'>返回</a>";
		 * request.setAttribute("message",message); } else{
		 * forward="/showOrderform.jsp"; int
		 * orderformnumber=orderformDao.getOrderformNumber(loginerid, time);
		 * List
		 * buygoodslist=orderformDao.getBuyGoodsToOrderform(orderformnumber);
		 */

		OrderformBean orderform = new OrderformBean();

		//orderform.setOrderformWhoid(loginerid);
		orderform.setOrderformGetter(getter);
		orderform.setOrderformAddress(address);
		orderform.setOrderformPostalcode(postalcode);
		orderform.setOrderformLinkphone(linkphone);
		orderform.setOrderformShipment(shipment);
		orderform.setOrderformShipmenttime(shipmenttime);
		orderform.setOrderformPayment(payment);
		orderform.setOrderformNetworkpayment(networkpayment);
		orderform.setOrderformTotalprices(totalprices);
		orderform.setOrderformTime(time);
		orderform.setOrderformStatus(status);
		// orderform.setOrderformBuyGoods(buygoodslist);
		//request.setAttribute("orderform", orderform);
		request.getSession().setAttribute("orderform", orderform);

		/* 修改商品库存量 */
		// String[] goodsids=buygoodsids.split(",");
		// String[] goodsnum=buygoodsnum.split(",");
		// GoodsDao goodsDao=new GoodsDao();
		/*
		 * for(int k=0;k<goodsids.length;k++)
		 * goodsDao.updateStoreNum(Integer.parseInt(goodsnum[k]),Integer.
		 * parseInt(goodsids[k])); goodsDao.closed();
		 */

		/* 清空购物车 */
		// deleteshopcarcookie(request,response); //删除存储购物车ID的cookie
		// String shopcarid=seeshopcarcookie(request,response);
		/*
		 * TempDao tempDao=new TempDao(); tempDao.deleteShopcar(shopcarid);
		 */ // 删除tb_temp表中保存的购物车创建信息
		// }
		// orderformDao.closed();

		 RequestDispatcher rd = request.getRequestDispatcher(forward);
		 rd.forward(request,response);
		// }

		// else{
		// System.out.println("没有购买商品，不能生成订单！");
		// RequestDispatcher rd=request.getRequestDispatcher("/message.jsp");
		// rd.forward(request,response);
		// }

	}

	private void deleteshopcarcookie(HttpServletRequest request, HttpServletResponse response) {
		String webname = request.getContextPath();
		webname = webname.substring(1);
		Cookie shopcar = new Cookie(webname + ".usershopcar", null);
		shopcar.setPath("/");
		int maxage = 0;
		shopcar.setMaxAge(maxage);
		response.addCookie(shopcar);
	}
}