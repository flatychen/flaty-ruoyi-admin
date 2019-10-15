package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.admin.core.join.JoinField;
import cn.aylives.ruoyi.common.annotation.Excel;

import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * Reversions对象 reversions
 *
 * @author flaty
 * @date 2019-10-15
 */
@Data
@Table( name = "aomygod.reversions" )
public class Reversions extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @Column( name = "id" )
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Excel( name = "id", prompt = "id" )

    private Integer id;
    /**
     * 小区id
     */
    @Column( name = "agency_id" )
    @Excel( name = "小区id", prompt = "小区id" )

    private Integer agencyId;
    /**
     * 回复语类型
     */
    @Column( name = "reply_type" )
    @Excel( name = "回复语类型", prompt = "回复语类型" )

    private String replyType;
    /**
     * 分类
     */
    @Column( name = "classify" )
    @Excel( name = "分类", prompt = "分类" )

    private String classify;
    /**
     * 关键字
     */
    @Column( name = "keyword" )
    @Excel( name = "关键字", prompt = "关键字" )

    private String keyword;
    /**
     * 回复语
     */
    @Column( name = "reply_content" )
    @Excel( name = "回复语", prompt = "回复语" )

    private String replyContent;
    /**
     * 启用状态
     */
    @Column( name = "status" )
    @Excel( name = "启用状态", prompt = "启用状态" )

    private String status;
    /**
     * 创建时间
     */
    @Column( name = "created_time" )
    @Excel( name = "创建时间", prompt = "创建时间" )

    private Date createdTime;
    /**
     * 更新时间
     */
    @Column( name = "updated_time" )
    @Excel( name = "更新时间", prompt = "更新时间" )

    private Date updatedTime;


    @Transient
    @JoinField(sourceField = "agencyId")
    private Agency agency;


}
