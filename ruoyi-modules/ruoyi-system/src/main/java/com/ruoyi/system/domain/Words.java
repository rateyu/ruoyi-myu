package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 词汇库对象 words
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public class Words extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 单词 */
    @Excel(name = "单词")
    private String word;

    /** 标签类别 */
    @Excel(name = "标签类别")
    private String wordLabel;

    /** 顺序 */
    @Excel(name = "顺序")
    private Long wordOrder;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWord(String word) 
    {
        this.word = word;
    }

    public String getWord() 
    {
        return word;
    }
    public void setWordLabel(String wordLabel) 
    {
        this.wordLabel = wordLabel;
    }

    public String getWordLabel() 
    {
        return wordLabel;
    }
    public void setWordOrder(Long wordOrder) 
    {
        this.wordOrder = wordOrder;
    }

    public Long getWordOrder() 
    {
        return wordOrder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("word", getWord())
            .append("wordLabel", getWordLabel())
            .append("wordOrder", getWordOrder())
            .toString();
    }
}
