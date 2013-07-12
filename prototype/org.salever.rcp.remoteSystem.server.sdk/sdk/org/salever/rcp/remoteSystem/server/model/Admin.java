package org.salever.rcp.remoteSystem.server.model;

// Generated Jun 1, 2012 9:06:40 PM by Hibernate Tools 3.4.0.CR1

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	public static final byte ADMIN_TYPE = 1;
	public static final byte OPPERATOR_TYPE = 2;

	private Integer id;
	private String username;
	private String password;
	private String realname;
	private String mobile;
	private String email;
	private byte type;

	// private Set deviceWarningMessages = new HashSet(0);

	public Admin() {
	}

	public Admin(String username, String password, String realname,
			String mobile, String email, byte type) {
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.mobile = mobile;
		this.email = email;
		this.type = type;
	}

	// public Admin(String username, String password, String realname,
	// String mobile, String email, byte type, Set deviceWarningMessages ) {
	// this.username = username;
	// this.password = password;
	// this.realname = realname;
	// this.mobile = mobile;
	// this.email = email;
	// this.type = type;
	// this.deviceWarningMessages = deviceWarningMessages;
	// }

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	// public Set getDeviceWarningMessages() {
	// return this.deviceWarningMessages;
	// }
	//
	// public void setDeviceWarningMessages(Set deviceWarningMessages) {
	// this.deviceWarningMessages = deviceWarningMessages;
	// }

}
