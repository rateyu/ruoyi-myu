package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 用户单词对象 user_word
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public class UserWord extends BaseEntity
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

    /** 记忆级别 */
    @Excel(name = "记忆级别")
    private Long memLevel;

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
    public void setMemLevel(Long memLevel) 
    {
        this.memLevel = memLevel;
    }

    public Long getMemLevel() 
    {
        return memLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("wordId", getWordId())
            .append("memLevel", getMemLevel())
            .toString();
    }
}
