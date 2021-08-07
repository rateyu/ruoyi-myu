package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 最近用户状态对象 user_state
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public class UserState extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 单词id */
    @Excel(name = "单词id")
    private Long wordId;

    /** 单词级别 */
    @Excel(name = "单词级别")
    private Long wordLevel;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setWordId(Long wordId) 
    {
        this.wordId = wordId;
    }

    public Long getWordId() 
    {
        return wordId;
    }
    public void setWordLevel(Long wordLevel) 
    {
        this.wordLevel = wordLevel;
    }

    public Long getWordLevel() 
    {
        return wordLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("wordId", getWordId())
            .append("wordLevel", getWordLevel())
            .toString();
    }
}
