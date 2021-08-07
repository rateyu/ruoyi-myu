package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.system.domain.UserState;
import com.ruoyi.system.domain.Words;

/**
 * 词汇库Service接口
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public interface IWordsService 
{
    /**
     * 查询词汇库
     * 
     * @param id 词汇库ID
     * @return 词汇库
     */
    public Words selectWordsById(Long id);
    public Words selectWordsByIdNext(UserState userState);
    public Words selectWordsByIdLast(UserState userState);
    public Words selectWordsByIdCurrent(UserState userState);

    /**
     * 查询词汇库列表
     * 
     * @param words 词汇库
     * @return 词汇库集合
     */
    public List<Words> selectWordsList(Words words);

    /**
     * 新增词汇库
     * 
     * @param words 词汇库
     * @return 结果
     */
    public int insertWords(Words words);

    /**
     * 修改词汇库
     * 
     * @param words 词汇库
     * @return 结果
     */
    public int updateWords(Words words);

    /**
     * 批量删除词汇库
     * 
     * @param ids 需要删除的词汇库ID
     * @return 结果
     */
    public int deleteWordsByIds(Long[] ids);

    /**
     * 删除词汇库信息
     * 
     * @param id 词汇库ID
     * @return 结果
     */
    public int deleteWordsById(Long id);
}
