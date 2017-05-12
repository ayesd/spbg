package me.ayesd.spbg.core;

import java.util.Date;

public class AuditEntity extends Entity {
	private static final long serialVersionUID = 8788119995402129202L;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建用户Id
	 */
	private String createUser;
	/**
	 * 最后更新时间
	 */
	private Date lastUpdateTime;
	/**
	 * 最后更新用户Id
	 */
	private String lastUpdateUser;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
}
