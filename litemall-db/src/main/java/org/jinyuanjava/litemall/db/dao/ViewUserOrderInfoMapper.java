package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewUserOrderInfo;
import org.jinyuanjava.litemall.db.domain.ViewUserOrderInfoExample;

public interface ViewUserOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    long countByExample(ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    int deleteByExample(ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    int insert(ViewUserOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    int insertSelective(ViewUserOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewUserOrderInfo selectOneByExample(ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewUserOrderInfo selectOneByExampleSelective(@Param("example") ViewUserOrderInfoExample example, @Param("selective") ViewUserOrderInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewUserOrderInfo> selectByExampleSelective(@Param("example") ViewUserOrderInfoExample example, @Param("selective") ViewUserOrderInfo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    List<ViewUserOrderInfo> selectByExample(ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewUserOrderInfo record, @Param("example") ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewUserOrderInfo record, @Param("example") ViewUserOrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_user_order_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewUserOrderInfoExample example);
}