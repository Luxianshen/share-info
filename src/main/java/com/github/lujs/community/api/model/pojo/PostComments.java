package com.github.lujs.community.api.model.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.lujs.commmon.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 
 * @author joysim
 * @since 2020-03-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("post_comments")
public class PostComments extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableField("fromId")
    private Integer fromId;

    @TableField("toId")
    private Integer toId;

    @TableField("postId")
    private Integer postId;

    @TableField("commentId")
    private Integer commentId;

    @TableField("replyId")
    private Integer replyId;

    /**
     * 0:评论帖子,1:回复评论,2:回复评论的回复
     */
    @TableField("commenType")
    private Integer commenType;

    private String content;

    private String imgs;

    @TableField("thumbsCount")
    private Integer thumbsCount;

    @TableField("replyCount")
    private Integer replyCount;

    @TableField("senDate")
    private Date senDate;

    @TableField("isRead")
    private Boolean isRead;

    @TableField("isHot")
    private Boolean isHot;


}
