/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.sys.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRole<M extends BaseRole<M>> extends Model<M> implements IBean {

    public Integer getId() {
        return get("id");
    }

    public void setId(Integer id) {
        set("id", id);
    }

    public String getCode() {
        return get("code");
    }

    public void setCode(String code) {
        set("code", code);
    }

    public String getName() {
        return get("name");
    }

    public void setName(String name) {
        set("name", name);
    }

    public String getDescription() {
        return get("description");
    }

    public void setDescription(String description) {
        set("description", description);
    }

    public String getUserIds() {
        return get("user_ids");
    }

    public void setUserIds(String userIds) {
        set("user_ids", userIds);
    }

    public Integer getStatus() {
        return get("status");
    }

    public void setStatus(Integer status) {
        set("status", status);
    }

    public Long getCreateUser() {
        return get("create_user");
    }

    public void setCreateUser(Long createUser) {
        set("create_user", createUser);
    }

    public java.util.Date getCreateTime() {
        return get("create_time");
    }

    public void setCreateTime(java.util.Date createTime) {
        set("create_time", createTime);
    }

    public Integer getServicerId() {
        return get("servicer_id");
    }

    public void setServicerId(Integer servicerId) {
        set("servicer_id", servicerId);
    }

}