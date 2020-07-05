package bean;

public class userBean {
	private String userName = "";       //用户名称
	private String email = "";          //邮箱
	private String userPwd = "";        //密码
	private String userRePwd = "";      //再次输入的密码
	private String selectAddress = "";  //可选择地址

	private String address = "";        //地址
	private String mobile = "";         //手机号
	private String headPic = "";        //头像图片
	private String sex = "";            //性别
	private String realName = "";       //真实姓名

	public String getSelectAddress() {
		return selectAddress;
	}

	public void setSelectAddress(String selectAddress) {
		this.selectAddress = selectAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHeadPic() {
		return headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}

	public String getUserRePwd() {
		return userRePwd;
	}

	public void setUserRePwd(String userRePwd) {
		this.userRePwd = userRePwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
