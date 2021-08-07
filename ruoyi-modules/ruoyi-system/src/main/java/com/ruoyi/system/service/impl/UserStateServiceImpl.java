package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserStateMapper;
import com.ruoyi.system.domain.UserState;
import com.ruoyi.system.service.IUserStateService;

/**
 * 最近用户状态Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@Service
public class UserStateServiceImpl implements IUserStateService 
{
    @Autowired
    private UserStateMapper userStateMapper;

    /**
     * 查询最近用户状态
     * 
     * @param id 最近用户状态ID
     * @return 最近用户状态
     */
    @Override
    public UserState selectUserStateById(Long id)
    {
        return userStateMapper.selectUserStateById(id);
    }

    @Override
    public UserState selectUserStateByUserId(Long id) {
        return userStateMapper.selectUserStateByUserId(id);
    }

    /**
     * 查询最近用户状态列表
     * 
     * @param userState 最近用户状态
     * @return 最近用户状态
     */
    @Override
    public List<UserState> selectUserStateList(UserState userState)
    {
        return userStateMapper.selectUserStateList(userState);
    }

    /**
     * 新增最近用户状态
     * 
     * @param userState 最近用户状态
     * @return 结果
     */
    @Override
    public int insertUserState(UserState userState)
    {
        return userStateMapper.insertUserState(userState);
    }

    /**
     * 修改最近用户状态
     * 
     * @param userState 最近用户状态
     * @return 结果
     */
    @Override
    public int updateUserState(UserState userState)
    {
        return userStateMapper.updateUserState(userState);
    }

    /**
     * 批量删除最近用户状态
     * 
     * @param ids 需要删除的最近用户状态ID
     * @return 结果
     */
    @Override
    public int deleteUserStateByIds(Long[] ids)
    {
        return userStateMapper.deleteUserStateByIds(ids);
    }

    /**
     * 删除最近用户状态信息
     * 
     * @param id 最近用户状态ID
     * @return 结果
     */
    @Override
    public int deleteUserStateById(Long id)
    {
        return userStateMapper.deleteUserStateById(id);
    }
}
