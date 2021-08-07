package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserState;

/**
 * 最近用户状态Mapper接口
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
public interface UserStateMapper 
{
    /**
     * 查询最近用户状态
     * 
     * @param id 最近用户状态ID
     * @return 最近用户状态
     */
    public UserState selectUserStateById(Long id);

    public UserState selectUserStateByUserId(Long id);

    /**
     * 查询最近用户状态列表
     * 
     * @param userState 最近用户状态
     * @return 最近用户状态集合
     */
    public List<UserState> selectUserStateList(UserState userState);

    /**
     * 新增最近用户状态
     * 
     * @param userState 最近用户状态
     * @return 结果
     */
    public int insertUserState(UserState userState);

    /**
     * 修改最近用户状态
     * 
     * @param userState 最近用户状态
     * @return 结果
     */
    public int updateUserState(UserState userState);

    /**
     * 删除最近用户状态
     * 
     * @param id 最近用户状态ID
     * @return 结果
     */
    public int deleteUserStateById(Long id);

    /**
     * 批量删除最近用户状态
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserStateByIds(Long[] ids);
}
