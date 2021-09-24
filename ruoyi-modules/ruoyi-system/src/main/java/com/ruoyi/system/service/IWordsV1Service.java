package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.WordsV1;

/**
 * 生词Service接口
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
public interface IWordsV1Service 
{
    /**
     * 查询生词
     * 
     * @param wordsid 生词ID
     * @return 生词
     */
    public WordsV1 selectWordsV1ById(Long wordsid);

    /**
     * 查询生词列表
     * 
     * @param wordsV1 生词
     * @return 生词集合
     */
    public List<WordsV1> selectWordsV1List(WordsV1 wordsV1);

    /**
     * 新增生词
     * 
     * @param wordsV1 生词
     * @return 结果
     */
    public int insertWordsV1(WordsV1 wordsV1);

    /**
     * 修改生词
     * 
     * @param wordsV1 生词
     * @return 结果
     */
    public int updateWordsV1(WordsV1 wordsV1);

    /**
     * 批量删除生词
     * 
     * @param wordsids 需要删除的生词ID
     * @return 结果
     */
    public int deleteWordsV1ByIds(Long[] wordsids);

    /**
     * 删除生词信息
     * 
     * @param wordsid 生词ID
     * @return 结果
     */
    public int deleteWordsV1ById(Long wordsid);
}
