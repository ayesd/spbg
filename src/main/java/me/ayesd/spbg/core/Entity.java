package me.ayesd.spbg.core;

import java.io.Serializable;

public class Entity implements Serializable {
	private static final long serialVersionUID = 5893530859780799352L;
	
	/**
	 * 主键
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
