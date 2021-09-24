package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 生词对象 WORDS_V1
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
public class WordsV1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    @Excel(name = "序号")
    private Long wordsid;

    /** 中文 */
    @Excel(name = "中文")
    private String chinese;

    /** 英文 */
    @Excel(name = "英文")
    private String english;

    /** 音标 */
    @Excel(name = "音标")
    private String phonetic;

    /** 英英 */
    @Excel(name = "英英")
    private String english2en;

    /** 英汉 */
    @Excel(name = "英汉")
    private String english2ch;

    /** 句子 */
    @Excel(name = "句子")
    private String sentence;

    /** 图片 */
    @Excel(name = "图片")
    private String picture;

    /** 音频 */
    @Excel(name = "音频")
    private String audio;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 外部链接 */
    @Excel(name = "外部链接")
    private String externalLink;

    /** 错误举例 */
    @Excel(name = "错误举例")
    private String errorExample;

    /** 参考 */
    @Excel(name = "参考")
    private String reference;

    /** 关系 */
    @Excel(name = "关系")
    private String relationship;

    /** 补充1 */
    @Excel(name = "补充1")
    private String supplement1;

    /** 补充2 */
    @Excel(name = "补充2")
    private String supplement2;

    /** 补充3 */
    @Excel(name = "补充3")
    private String supplement3;

    /** 补充4 */
    @Excel(name = "补充4")
    private String supplement4;

    /** 补充5 */
    @Excel(name = "补充5")
    private String supplement5;

    /** 类型 */
    @Excel(name = "类型")
    private Long type;

    /** 书名 */
    @Excel(name = "书名")
    private String title;

    /** 单元 */
    @Excel(name = "单元")
    private String unit;

    /** 课号 */
    @Excel(name = "课号")
    private String courses;

    /** 属性_用户_系统 */
    @Excel(name = "属性_用户_系统")
    private String attributes;

    public void setWordsid(Long wordsid) 
    {
        this.wordsid = wordsid;
    }

    public Long getWordsid() 
    {
        return wordsid;
    }
    public void setChinese(String chinese) 
    {
        this.chinese = chinese;
    }

    public String getChinese() 
    {
        return chinese;
    }
    public void setEnglish(String english) 
    {
        this.english = english;
    }

    public String getEnglish() 
    {
        return english;
    }
    public void setPhonetic(String phonetic) 
    {
        this.phonetic = phonetic;
    }

    public String getPhonetic() 
    {
        return phonetic;
    }
    public void setEnglish2en(String english2en) 
    {
        this.english2en = english2en;
    }

    public String getEnglish2en() 
    {
        return english2en;
    }
    public void setEnglish2ch(String english2ch) 
    {
        this.english2ch = english2ch;
    }

    public String getEnglish2ch() 
    {
        return english2ch;
    }
    public void setSentence(String sentence) 
    {
        this.sentence = sentence;
    }

    public String getSentence() 
    {
        return sentence;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setAudio(String audio) 
    {
        this.audio = audio;
    }

    public String getAudio() 
    {
        return audio;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setExternalLink(String externalLink) 
    {
        this.externalLink = externalLink;
    }

    public String getExternalLink() 
    {
        return externalLink;
    }
    public void setErrorExample(String errorExample) 
    {
        this.errorExample = errorExample;
    }

    public String getErrorExample() 
    {
        return errorExample;
    }
    public void setReference(String reference) 
    {
        this.reference = reference;
    }

    public String getReference() 
    {
        return reference;
    }
    public void setRelationship(String relationship) 
    {
        this.relationship = relationship;
    }

    public String getRelationship() 
    {
        return relationship;
    }
    public void setSupplement1(String supplement1) 
    {
        this.supplement1 = supplement1;
    }

    public String getSupplement1() 
    {
        return supplement1;
    }
    public void setSupplement2(String supplement2) 
    {
        this.supplement2 = supplement2;
    }

    public String getSupplement2() 
    {
        return supplement2;
    }
    public void setSupplement3(String supplement3) 
    {
        this.supplement3 = supplement3;
    }

    public String getSupplement3() 
    {
        return supplement3;
    }
    public void setSupplement4(String supplement4) 
    {
        this.supplement4 = supplement4;
    }

    public String getSupplement4() 
    {
        return supplement4;
    }
    public void setSupplement5(String supplement5) 
    {
        this.supplement5 = supplement5;
    }

    public String getSupplement5() 
    {
        return supplement5;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setCourses(String courses) 
    {
        this.courses = courses;
    }

    public String getCourses() 
    {
        return courses;
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
            .append("wordsid", getWordsid())
            .append("chinese", getChinese())
            .append("english", getEnglish())
            .append("phonetic", getPhonetic())
            .append("english2en", getEnglish2en())
            .append("english2ch", getEnglish2ch())
            .append("sentence", getSentence())
            .append("picture", getPicture())
            .append("audio", getAudio())
            .append("video", getVideo())
            .append("externalLink", getExternalLink())
            .append("errorExample", getErrorExample())
            .append("reference", getReference())
            .append("relationship", getRelationship())
            .append("supplement1", getSupplement1())
            .append("supplement2", getSupplement2())
            .append("supplement3", getSupplement3())
            .append("supplement4", getSupplement4())
            .append("supplement5", getSupplement5())
            .append("type", getType())
            .append("title", getTitle())
            .append("unit", getUnit())
            .append("courses", getCourses())
            .append("attributes", getAttributes())
            .toString();
    }
}
