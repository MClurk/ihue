package com.ihue.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

	public Boolean LoginCheck(String username, String password) {
		Session session = this.getSession();
		String hql = "from UserPojo as user where user.username = ? and user.password = ?";
		List<?> result = this.getHibernateTemplate().find(hql, username,
				password);
		this.releaseSession(session);
		return result != null && result.size() > 0 ? true : false;
	}
}
