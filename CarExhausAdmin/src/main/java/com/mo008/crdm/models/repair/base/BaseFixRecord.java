/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.repair.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFixRecord<M extends BaseFixRecord<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setCarId(Integer carId) {
		set("car_id", carId);
	}

	public Integer getCarId() {
		return get("car_id");
	}

	public void setBreakdownInfo(String breakdownInfo) {
		set("breakdown_info", breakdownInfo);
	}

	public String getBreakdownInfo() {
		return get("breakdown_info");
	}

	public void setBreakdownTime(java.util.Date breakdownTime) {
		set("breakdown_time", breakdownTime);
	}

	public java.util.Date getBreakdownTime() {
		return get("breakdown_time");
	}

	public void setFixTime(java.util.Date fixTime) {
		set("fix_time", fixTime);
	}

	public java.util.Date getFixTime() {
		return get("fix_time");
	}

	public void setFixLocation(String fixLocation) {
		set("fix_location", fixLocation);
	}

	public String getFixLocation() {
		return get("fix_location");
	}

	public void setFixer(String fixer) {
		set("fixer", fixer);
	}

	public String getFixer() {
		return get("fixer");
	}

	public void setBreakdownReson(String breakdownReson) {
		set("breakdown_reson", breakdownReson);
	}

	public String getBreakdownReson() {
		return get("breakdown_reson");
	}

	public void setSolution(String solution) {
		set("solution", solution);
	}

	public String getSolution() {
		return get("solution");
	}

	public void setOkFlag(Boolean okFlag) {
		set("ok_flag", okFlag);
	}

	public Boolean getOkFlag() {
		return get("ok_flag");
	}

	public void setRemark(String remark) {
		set("remark", remark);
	}

	public String getRemark() {
		return get("remark");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
