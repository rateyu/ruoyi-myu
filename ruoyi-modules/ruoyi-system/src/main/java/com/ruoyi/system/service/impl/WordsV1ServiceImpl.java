package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WordsV1Mapper;
import com.ruoyi.system.domain.WordsV1;
import com.ruoyi.system.service.IWordsV1Service;

/**
 * 生词Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
@Service
public class WordsV1ServiceImpl implements IWordsV1Service 
{
    @Autowired
    private WordsV1Mapper wordsV1Mapper;

    /**
     * 查询生词
     * 
     * @param wordsid 生词ID
     * @return 生词
     */
    @Override
    public WordsV1 selectWordsV1ById(Long wordsid)
    {
        return wordsV1Mapper.selectWordsV1ById(wordsid);
    }

    /**
     * 查询生词列表
     * 
     * @param wordsV1 生词
     * @return 生词
     */
    @Override
    public List<WordsV1> selectWordsV1List(WordsV1 wordsV1)
    {
        return wordsV1Mapper.selectWordsV1List(wordsV1);
    }

    /**
     * 新增生词
     * 
     * @param wordsV1 生词
     * @return 结果
     */
    @Override
    public int insertWordsV1(WordsV1 wordsV1)
    {
        return wordsV1Mapper.insertWordsV1(wordsV1);
    }

    /**
     * 修改生词
     * 
     * @param wordsV1 生词
     * @return 结果
     */
    @Override
    public int updateWordsV1(WordsV1 wordsV1)
    {
        return wordsV1Mapper.updateWordsV1(wordsV1);
    }

    /**
     * 批量删除生词
     * 
     * @param wordsids 需要删除的生词ID
     * @return 结果
     */
    @Override
    public int deleteWordsV1ByIds(Long[] wordsids)
    {
        return wordsV1Mapper.deleteWordsV1ByIds(wordsids);
    }

    /**
     * 删除生词信息
     * 
     * @param wordsid 生词ID
     * @return 结果
     */
    @Override
    public int deleteWordsV1ById(Long wordsid)
    {
        return wordsV1Mapper.deleteWordsV1ById(wordsid);
    }
}
