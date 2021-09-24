package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 用户生词关系对象 USERWORD_V1
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
public class UserwordV1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户序号 */
    @Excel(name = "用户序号")
    private Long userid;

    /** 单词序号 */
    @Excel(name = "单词序号")
    private Long wordid;

    /** 单词类型 */
    @Excel(name = "单词类型")
    private Long type;

    /** 用户注释 */
    @Excel(name = "用户注释")
    private String userNotes;

    /** 关系图谱 */
    @Excel(name = "关系图谱")
    private String relationalMap;

    /** 级别 */
    @Excel(name = "级别")
    private Long level;

    /** 状态_成功失败 */
    @Excel(name = "状态_成功失败")
    private String state;

    /** 属性_用户_系统 */
    @Excel(name = "属性_用户_系统")
    private String attributes;

    public void setUserid(Long userid) 
    {
        this.userid = userid;
    }

    public Long getUserid() 
    {
        return userid;
    }
    public void setWordid(Long wordid) 
    {
        this.wordid = wordid;
    }

    public Long getWordid() 
    {
        return wordid;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setUserNotes(String userNotes) 
    {
        this.userNotes = userNotes;
    }

    public String getUserNotes() 
    {
        return userNotes;
    }
    public void setRelationalMap(String relationalMap) 
    {
        this.relationalMap = relationalMap;
    }

    public String getRelationalMap() 
    {
        return relationalMap;
    }
    public void setLevel(Long level) 
    {
        this.level = level;
    }

    public Long getLevel() 
    {
        return level;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setAttributes(String attributes) 
    {
        this.attributes = attributes;
    }

    public String getAttributes() 
    {
        return attributes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userid", getUserid())
            .append("wordid", getWordid())
            .append("type", getType())
            .append("userNotes", getUserNotes())
            .append("relationalMap", getRelationalMap())
            .append("level", getLevel())
            .append("state", getState())
            .append("attributes", getAttributes())
            .toString();
    }
}
