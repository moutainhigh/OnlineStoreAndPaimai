package org.jinyuanjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ViewAuctionDajiaOrderCurrent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.rules_id
     *
     * @mbg.generated
     */
    private Integer rulesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.tenant_id
     *
     * @mbg.generated
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.user_create_id
     *
     * @mbg.generated
     */
    private Integer userCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.user_modify_id
     *
     * @mbg.generated
     */
    private Integer userModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.op_create_id
     *
     * @mbg.generated
     */
    private Integer opCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.op_modify_id
     *
     * @mbg.generated
     */
    private Integer opModifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.order_status
     *
     * @mbg.generated
     */
    private Short orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.begin_time
     *
     * @mbg.generated
     */
    private LocalDateTime beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.expire_flag
     *
     * @mbg.generated
     */
    private Boolean expireFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.goods_product_id
     *
     * @mbg.generated
     */
    private Integer goodsProductId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.goods_sn
     *
     * @mbg.generated
     */
    private String goodsSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.offer_flag
     *
     * @mbg.generated
     */
    private Boolean offerFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_auction_dajia_order_current.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.id
     *
     * @return the value of view_auction_dajia_order_current.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.id
     *
     * @param id the value for view_auction_dajia_order_current.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.user_id
     *
     * @return the value of view_auction_dajia_order_current.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.user_id
     *
     * @param userId the value for view_auction_dajia_order_current.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.order_id
     *
     * @return the value of view_auction_dajia_order_current.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.order_id
     *
     * @param orderId the value for view_auction_dajia_order_current.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.rules_id
     *
     * @return the value of view_auction_dajia_order_current.rules_id
     *
     * @mbg.generated
     */
    public Integer getRulesId() {
        return rulesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.rules_id
     *
     * @param rulesId the value for view_auction_dajia_order_current.rules_id
     *
     * @mbg.generated
     */
    public void setRulesId(Integer rulesId) {
        this.rulesId = rulesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.add_time
     *
     * @return the value of view_auction_dajia_order_current.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.add_time
     *
     * @param addTime the value for view_auction_dajia_order_current.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.update_time
     *
     * @return the value of view_auction_dajia_order_current.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.update_time
     *
     * @param updateTime the value for view_auction_dajia_order_current.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.deleted
     *
     * @return the value of view_auction_dajia_order_current.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.deleted
     *
     * @param deleted the value for view_auction_dajia_order_current.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.tenant_id
     *
     * @return the value of view_auction_dajia_order_current.tenant_id
     *
     * @mbg.generated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.tenant_id
     *
     * @param tenantId the value for view_auction_dajia_order_current.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.user_create_id
     *
     * @return the value of view_auction_dajia_order_current.user_create_id
     *
     * @mbg.generated
     */
    public Integer getUserCreateId() {
        return userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.user_create_id
     *
     * @param userCreateId the value for view_auction_dajia_order_current.user_create_id
     *
     * @mbg.generated
     */
    public void setUserCreateId(Integer userCreateId) {
        this.userCreateId = userCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.user_modify_id
     *
     * @return the value of view_auction_dajia_order_current.user_modify_id
     *
     * @mbg.generated
     */
    public Integer getUserModifyId() {
        return userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.user_modify_id
     *
     * @param userModifyId the value for view_auction_dajia_order_current.user_modify_id
     *
     * @mbg.generated
     */
    public void setUserModifyId(Integer userModifyId) {
        this.userModifyId = userModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.op_create_id
     *
     * @return the value of view_auction_dajia_order_current.op_create_id
     *
     * @mbg.generated
     */
    public Integer getOpCreateId() {
        return opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.op_create_id
     *
     * @param opCreateId the value for view_auction_dajia_order_current.op_create_id
     *
     * @mbg.generated
     */
    public void setOpCreateId(Integer opCreateId) {
        this.opCreateId = opCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.op_modify_id
     *
     * @return the value of view_auction_dajia_order_current.op_modify_id
     *
     * @mbg.generated
     */
    public Integer getOpModifyId() {
        return opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.op_modify_id
     *
     * @param opModifyId the value for view_auction_dajia_order_current.op_modify_id
     *
     * @mbg.generated
     */
    public void setOpModifyId(Integer opModifyId) {
        this.opModifyId = opModifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.order_sn
     *
     * @return the value of view_auction_dajia_order_current.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.order_sn
     *
     * @param orderSn the value for view_auction_dajia_order_current.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.order_status
     *
     * @return the value of view_auction_dajia_order_current.order_status
     *
     * @mbg.generated
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.order_status
     *
     * @param orderStatus the value for view_auction_dajia_order_current.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.begin_time
     *
     * @return the value of view_auction_dajia_order_current.begin_time
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.begin_time
     *
     * @param beginTime the value for view_auction_dajia_order_current.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.end_time
     *
     * @return the value of view_auction_dajia_order_current.end_time
     *
     * @mbg.generated
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.end_time
     *
     * @param endTime the value for view_auction_dajia_order_current.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.expire_flag
     *
     * @return the value of view_auction_dajia_order_current.expire_flag
     *
     * @mbg.generated
     */
    public Boolean getExpireFlag() {
        return expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.expire_flag
     *
     * @param expireFlag the value for view_auction_dajia_order_current.expire_flag
     *
     * @mbg.generated
     */
    public void setExpireFlag(Boolean expireFlag) {
        this.expireFlag = expireFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.goods_product_id
     *
     * @return the value of view_auction_dajia_order_current.goods_product_id
     *
     * @mbg.generated
     */
    public Integer getGoodsProductId() {
        return goodsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.goods_product_id
     *
     * @param goodsProductId the value for view_auction_dajia_order_current.goods_product_id
     *
     * @mbg.generated
     */
    public void setGoodsProductId(Integer goodsProductId) {
        this.goodsProductId = goodsProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.goods_id
     *
     * @return the value of view_auction_dajia_order_current.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.goods_id
     *
     * @param goodsId the value for view_auction_dajia_order_current.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.goods_sn
     *
     * @return the value of view_auction_dajia_order_current.goods_sn
     *
     * @mbg.generated
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.goods_sn
     *
     * @param goodsSn the value for view_auction_dajia_order_current.goods_sn
     *
     * @mbg.generated
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.goods_name
     *
     * @return the value of view_auction_dajia_order_current.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.goods_name
     *
     * @param goodsName the value for view_auction_dajia_order_current.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.offer_flag
     *
     * @return the value of view_auction_dajia_order_current.offer_flag
     *
     * @mbg.generated
     */
    public Boolean getOfferFlag() {
        return offerFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.offer_flag
     *
     * @param offerFlag the value for view_auction_dajia_order_current.offer_flag
     *
     * @mbg.generated
     */
    public void setOfferFlag(Boolean offerFlag) {
        this.offerFlag = offerFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.enabled
     *
     * @return the value of view_auction_dajia_order_current.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.enabled
     *
     * @param enabled the value for view_auction_dajia_order_current.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_auction_dajia_order_current.user_name
     *
     * @return the value of view_auction_dajia_order_current.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_auction_dajia_order_current.user_name
     *
     * @param userName the value for view_auction_dajia_order_current.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", rulesId=").append(rulesId);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", userCreateId=").append(userCreateId);
        sb.append(", userModifyId=").append(userModifyId);
        sb.append(", opCreateId=").append(opCreateId);
        sb.append(", opModifyId=").append(opModifyId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", expireFlag=").append(expireFlag);
        sb.append(", goodsProductId=").append(goodsProductId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", offerFlag=").append(offerFlag);
        sb.append(", enabled=").append(enabled);
        sb.append(", userName=").append(userName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ViewAuctionDajiaOrderCurrent other = (ViewAuctionDajiaOrderCurrent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getRulesId() == null ? other.getRulesId() == null : this.getRulesId().equals(other.getRulesId()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getUserCreateId() == null ? other.getUserCreateId() == null : this.getUserCreateId().equals(other.getUserCreateId()))
            && (this.getUserModifyId() == null ? other.getUserModifyId() == null : this.getUserModifyId().equals(other.getUserModifyId()))
            && (this.getOpCreateId() == null ? other.getOpCreateId() == null : this.getOpCreateId().equals(other.getOpCreateId()))
            && (this.getOpModifyId() == null ? other.getOpModifyId() == null : this.getOpModifyId().equals(other.getOpModifyId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getExpireFlag() == null ? other.getExpireFlag() == null : this.getExpireFlag().equals(other.getExpireFlag()))
            && (this.getGoodsProductId() == null ? other.getGoodsProductId() == null : this.getGoodsProductId().equals(other.getGoodsProductId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsSn() == null ? other.getGoodsSn() == null : this.getGoodsSn().equals(other.getGoodsSn()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getOfferFlag() == null ? other.getOfferFlag() == null : this.getOfferFlag().equals(other.getOfferFlag()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getRulesId() == null) ? 0 : getRulesId().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getUserCreateId() == null) ? 0 : getUserCreateId().hashCode());
        result = prime * result + ((getUserModifyId() == null) ? 0 : getUserModifyId().hashCode());
        result = prime * result + ((getOpCreateId() == null) ? 0 : getOpCreateId().hashCode());
        result = prime * result + ((getOpModifyId() == null) ? 0 : getOpModifyId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getExpireFlag() == null) ? 0 : getExpireFlag().hashCode());
        result = prime * result + ((getGoodsProductId() == null) ? 0 : getGoodsProductId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsSn() == null) ? 0 : getGoodsSn().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getOfferFlag() == null) ? 0 : getOfferFlag().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        orderId("order_id", "orderId", "INTEGER", false),
        rulesId("rules_id", "rulesId", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false),
        tenantId("tenant_id", "tenantId", "INTEGER", false),
        userCreateId("user_create_id", "userCreateId", "INTEGER", false),
        userModifyId("user_modify_id", "userModifyId", "INTEGER", false),
        opCreateId("op_create_id", "opCreateId", "INTEGER", false),
        opModifyId("op_modify_id", "opModifyId", "INTEGER", false),
        orderSn("order_sn", "orderSn", "VARCHAR", false),
        orderStatus("order_status", "orderStatus", "SMALLINT", false),
        beginTime("begin_time", "beginTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        expireFlag("expire_flag", "expireFlag", "BIT", false),
        goodsProductId("goods_product_id", "goodsProductId", "INTEGER", false),
        goodsId("goods_id", "goodsId", "INTEGER", false),
        goodsSn("goods_sn", "goodsSn", "VARCHAR", false),
        goodsName("goods_name", "goodsName", "VARCHAR", false),
        offerFlag("offer_flag", "offerFlag", "BIT", false),
        enabled("enabled", "enabled", "BIT", false),
        userName("user_name", "userName", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table view_auction_dajia_order_current
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}