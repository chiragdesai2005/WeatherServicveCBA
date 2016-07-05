package com.weather.model;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultData {

	@SerializedName("cnt")
	@Expose
	private Integer cnt;
	@SerializedName("list")
	@Expose
	private java.util.List<com.weather.model.List> list = new ArrayList<com.weather.model.List>();

	/**
	 * 
	 * @return The cnt
	 */
	public Integer getCnt() {
		return cnt;
	}

	/**
	 * 
	 * @param cnt
	 *            The cnt
	 */
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	/**
	 * 
	 * @return The list
	 */
	public java.util.List<com.weather.model.List> getList() {
		return list;
	}

	/**
	 * 
	 * @param list
	 *            The list
	 */
	public void setList(java.util.List<com.weather.model.List> list) {
		this.list = list;
	}

}
