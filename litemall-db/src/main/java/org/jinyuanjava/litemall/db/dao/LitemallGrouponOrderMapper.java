package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallGrouponOrder;
import org.jinyuanjava.litemall.db.domain.LitemallGrouponOrderExample;

public interface LitemallGrouponOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    long countByExample(LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int insert(LitemallGrouponOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGrouponOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponOrder selectOneByExample(LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponOrder selectOneByExampleSelective(@Param("example") LitemallGrouponOrderExample example, @Param("selective") LitemallGrouponOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallGrouponOrder> selectByExampleSelective(@Param("example") LitemallGrouponOrderExample example, @Param("selective") LitemallGrouponOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    List<LitemallGrouponOrder> selectByExample(LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGrouponOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    LitemallGrouponOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGrouponOrder selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGrouponOrder record, @Param("example") LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGrouponOrder record, @Param("example") LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGrouponOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGrouponOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallGrouponOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_groupon_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}