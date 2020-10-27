package com.clever.chen.address.entity;

import java.io.Serializable;
import java.util.Date;

public class Address implements Serializable {
    /**
     * 主键
     */
    private Integer addrId;

    /**
     *
     */
    private Integer userId;

    /**
     * 地址区域
     */
    private String addrArea;

    /**
     * 详细地址
     */
    private String addrDetail;

    /**
     *
     */
    private Date createTime;

    /**
     * 1表示不是默认地址，0表示是默认地址
     */
    private Integer def;

    /**
     * 0表示未删除，1表示删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", userId=" + userId +
                ", addrArea='" + addrArea + '\'' +
                ", addrDetail='" + addrDetail + '\'' +
                ", createTime=" + createTime +
                ", def=" + def +
                ", status=" + status +
                '}';
    }
}

