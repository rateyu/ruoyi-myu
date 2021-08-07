package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.UserState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WordsMapper;
import com.ruoyi.system.domain.Words;
import com.ruoyi.system.service.IWordsService;

/**
 * 词汇库Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@Service
public class WordsServiceImpl implements IWordsService 
{
    @Autowired
    private WordsMapper wordsMapper;

    /**
     * 查询词汇库
     * 
     * @param id 词汇库ID
     * @return 词汇库
     */
    @Override
    public Words selectWordsById(Long id)
    {
        return wordsMapper.selectWordsById(id);
    }

    @Override
    public Words selectWordsByIdNext(UserState userState)
    {
        return wordsMapper.selectWordsByIdNext(userState);
    }

    @Override
    public Words selectWordsByIdLast(UserState userState)
    {
        return wordsMapper.selectWordsByIdLast(userState);
    }

    @Override
    public Words selectWordsByIdCurrent(UserState userState)
    {
        return wordsMapper.selectWordsByIdCurrent(userState);
    }

    /**
     * 查询词汇库列表
     * 
     * @param words 词汇库
     * @return 词汇库
     */
    @Override
    public List<Words> selectWordsList(Words words)
    {
        return wordsMapper.selectWordsList(words);
    }

    /**
     * 新增词汇库
     * 
     * @param words 词汇库
     * @return 结果
     */
    @Override
    public int insertWords(Words words)
    {
        return wordsMapper.insertWords(words);
    }

    /**
     * 修改词汇库
     * 
     * @param words 词汇库
     * @return 结果
     */
    @Override
    public int updateWords(Words words)
    {
        return wordsMapper.updateWords(words);
    }

    /**
     * 批量删除词汇库
     * 
     * @param ids 需要删除的词汇库ID
     * @return 结果
     */
    @Override
    public int deleteWordsByIds(Long[] ids)
    {
        return wordsMapper.deleteWordsByIds(ids);
    }

    /**
     * 删除词汇库信息
     * 
     * @param id 词汇库ID
     * @return 结果
     */
    @Override
    public int deleteWordsById(Long id)
    {
        return wordsMapper.deleteWordsById(id);
    }
}
