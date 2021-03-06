package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.LitemallGoodsStore;
import org.jinyuanjava.litemall.db.domain.LitemallGoodsStoreExample;

public interface LitemallGoodsStoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    long countByExample(LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int insert(LitemallGoodsStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGoodsStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsStore selectOneByExample(LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsStore selectOneByExampleSelective(@Param("example") LitemallGoodsStoreExample example, @Param("selective") LitemallGoodsStore.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallGoodsStore> selectByExampleSelective(@Param("example") LitemallGoodsStoreExample example, @Param("selective") LitemallGoodsStore.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    List<LitemallGoodsStore> selectByExample(LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsStore selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGoodsStore.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    LitemallGoodsStore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallGoodsStore selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGoodsStore record, @Param("example") LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGoodsStore record, @Param("example") LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGoodsStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGoodsStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallGoodsStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_store
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}