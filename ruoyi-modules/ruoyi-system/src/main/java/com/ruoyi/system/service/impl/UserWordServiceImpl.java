package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserWordMapper;
import com.ruoyi.system.domain.UserWord;
import com.ruoyi.system.service.IUserWordService;

/**
 * 用户单词Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@Service
public class UserWordServiceImpl implements IUserWordService 
{
    @Autowired
    private UserWordMapper userWordMapper;

    /**
     * 查询用户单词
     * 
     * @param id 用户单词ID
     * @return 用户单词
     */
    @Override
    public UserWord selectUserWordById(Long id)
    {
        return userWordMapper.selectUserWordById(id);
    }

    /**
     * 查询用户单词列表
     * 
     * @param userWord 用户单词
     * @return 用户单词
     */
    @Override
    public List<UserWord> selectUserWordList(UserWord userWord)
    {
        return userWordMapper.selectUserWordList(userWord);
    }

    /**
     * 新增用户单词
     * 
     * @param userWord 用户单词
     * @return 结果
     */
    @Override
    public int insertUserWord(UserWord userWord)
    {
        return userWordMapper.insertUserWord(userWord);
    }

    /**
     * 修改用户单词
     * 
     * @param userWord 用户单词
     * @return 结果
     */
    @Override
    public int updateUserWord(UserWord userWord)
    {
        return userWordMapper.updateUserWord(userWord);
    }

    /**
     * 批量删除用户单词
     * 
     * @param ids 需要删除的用户单词ID
     * @return 结果
     */
    @Override
    public int deleteUserWordByIds(Long[] ids)
    {
        return userWordMapper.deleteUserWordByIds(ids);
    }

    /**
     * 删除用户单词信息
     * 
     * @param id 用户单词ID
     * @return 结果
     */
    @Override
    public int deleteUserWordById(Long id)
    {
        return userWordMapper.deleteUserWordById(id);
    }
}
