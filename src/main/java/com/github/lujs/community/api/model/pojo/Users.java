package com.github.lujs.community.api.model.pojo;

import com.github.lujs.commmon.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.Date;

/**
 * 
 * @author joysim
 * @since 2020-03-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("users")
public class Users extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableField("openId")
    private String openId;

    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;

    /**
     * 分享者ID
     */
    @TableField("shareId")
    private Integer shareId;

    /**
     * 公众号openId
     */
    @TableField("gzhId")
    private String gzhId;

    /**
     * 平台:微信｜QQ
     */
    private String platform;

    /**
     * 是否订阅公众号
     */
    private Boolean subscribe;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 头像
     */
    private String avtater;

    /**
     * 情感
     */
    private Integer feeling;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 性别(0|未知,1男性,2|女性)
     */
    private Integer gender;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 注册时间
     */
    @TableField("registerDate")
    private Date registerDate;

    /**
     * 是否学生认证
     */
    @TableField("isAuth")
    private Boolean isAuth;

    /**
     * 真实姓名
     */
    @TableField("realName")
    private String realName;

    /**
     * 认证图片地址
     */
    @TableField("authSrc")
    private String authSrc;

    /**
     * 头衔
     */
    private String title;

    /**
     * 是否绑定个人信息
     */
    @TableField("isBinding")
    private Boolean isBinding;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 就读学校
     */
    private String school;

    /**
     * 学历(0专科,1本科,2硕士,3博士)
     */
    private Integer education;

    /**
     * 入学年份
     */
    @TableField("enrollmentYear")
    private Integer enrollmentYear;

    /**
     * 用户类型(0普通用户1系统用户2虚拟用户)
     */
    @TableField("userType")
    private Integer userType;

    /**
     * 用户等级(0普通1优秀2高级3VIP)
     */
    private Integer grade;

    /**
     * 未读系统消息
     */
    @TableField("sysMsgCount")
    private Integer sysMsgCount;

    /**
     * 未读用户消息
     */
    @TableField("noticeCount")
    private Integer noticeCount;

    /**
     * 关注
     */
    @TableField("followNum")
    private Integer followNum;

    /**
     * 粉丝数
     */
    @TableField("fansNum")
    private Integer fansNum;

    /**
     * 获赞数
     */
    @TableField("thumbsNum")
    private Integer thumbsNum;

    /**
     * 玉帛钻
     */
    private Integer drill;

    /**
     * 玉帛贝
     */
    private Integer shell;


}
