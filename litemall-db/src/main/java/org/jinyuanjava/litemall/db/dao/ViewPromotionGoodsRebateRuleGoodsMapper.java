package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewPromotionGoodsRebateRuleGoods;
import org.jinyuanjava.litemall.db.domain.ViewPromotionGoodsRebateRuleGoodsExample;

public interface ViewPromotionGoodsRebateRuleGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    long countByExample(ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    int deleteByExample(ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    int insert(ViewPromotionGoodsRebateRuleGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    int insertSelective(ViewPromotionGoodsRebateRuleGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewPromotionGoodsRebateRuleGoods selectOneByExample(ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewPromotionGoodsRebateRuleGoods selectOneByExampleSelective(@Param("example") ViewPromotionGoodsRebateRuleGoodsExample example, @Param("selective") ViewPromotionGoodsRebateRuleGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewPromotionGoodsRebateRuleGoods> selectByExampleSelective(@Param("example") ViewPromotionGoodsRebateRuleGoodsExample example, @Param("selective") ViewPromotionGoodsRebateRuleGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    List<ViewPromotionGoodsRebateRuleGoods> selectByExample(ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewPromotionGoodsRebateRuleGoods record, @Param("example") ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewPromotionGoodsRebateRuleGoods record, @Param("example") ViewPromotionGoodsRebateRuleGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_promotion_goods_rebate_rule_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewPromotionGoodsRebateRuleGoodsExample example);
}