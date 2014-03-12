package com.ihue.util;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * 提供前台对web服务器session的相关信息的访问
 * 
 */
public class Session {
	/**
	 * 在session中存入图灵测试验证码
	 * 
	 * @return 用户名
	 */
	public static void setCaptcha(String key, String captcha) {
		ActionContext.getContext().getSession().put("captcha" + key, captcha);
	}

	/**
	 * 取出与验证码
	 * 
	 * @return 验证码
	 */
	public static String popCaptcha(String key) {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String captcha = (String) session.get("captcha" + key);
		session.remove("captcha" + key);
		return captcha;
	}

	public static void setUser(Boolean login) {
		ActionContext.getContext().getSession().put("login", login);
	}

	public static Boolean getUser() {
		return (Boolean) ActionContext.getContext().getSession().get("login");
	}

	/*
	 * public static void setPaySeats(PaySeats seatinfo) {
	 * ActionContext.getContext().getSession().put("seatinfo", seatinfo); }
	 * 
	 * public static PaySeats getPaySeats() { PaySeats payseats = (PaySeats)
	 * ActionContext.getContext().getSession() .get("seatinfo");
	 * ActionContext.getContext().getSession().remove("seatinfo"); return
	 * payseats; }
	 */
}
