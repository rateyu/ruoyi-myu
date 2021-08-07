package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserWord;

/**
 * 用户单词Service接口
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public interface IUserWordService 
{
    /**
     * 查询用户单词
     * 
     * @param id 用户单词ID
     * @return 用户单词
     */
    public UserWord selectUserWordById(Long id);

    /**
     * 查询用户单词列表
     * 
     * @param userWord 用户单词
     * @return 用户单词集合
     */
    public List<UserWord> selectUserWordList(UserWord userWord);

    /**
     * 新增用户单词
     * 
     * @param userWord 用户单词
     * @return 结果
     */
    public int insertUserWord(UserWord userWord);

    /**
     * 修改用户单词
     * 
     * @param userWord 用户单词
     * @return 结果
     */
    public int updateUserWord(UserWord userWord);

    /**
     * 批量删除用户单词
     * 
     * @param ids 需要删除的用户单词ID
     * @return 结果
     */
    public int deleteUserWordByIds(Long[] ids);

    /**
     * 删除用户单词信息
     * 
     * @param id 用户单词ID
     * @return 结果
     */
    public int deleteUserWordById(Long id);
}
