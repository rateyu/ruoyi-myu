package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserwordV1;

/**
 * 用户生词关系Service接口
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
public interface IUserwordV1Service 
{
    /**
     * 查询用户生词关系
     * 
     * @param userid 用户生词关系ID
     * @return 用户生词关系
     */
    public UserwordV1 selectUserwordV1ById(Long userid);

    /**
     * 查询用户生词关系列表
     * 
     * @param userwordV1 用户生词关系
     * @return 用户生词关系集合
     */
    public List<UserwordV1> selectUserwordV1List(UserwordV1 userwordV1);

    /**
     * 新增用户生词关系
     * 
     * @param userwordV1 用户生词关系
     * @return 结果
     */
    public int insertUserwordV1(UserwordV1 userwordV1);

    /**
     * 修改用户生词关系
     * 
     * @param userwordV1 用户生词关系
     * @return 结果
     */
    public int updateUserwordV1(UserwordV1 userwordV1);

    /**
     * 批量删除用户生词关系
     * 
     * @param userids 需要删除的用户生词关系ID
     * @return 结果
     */
    public int deleteUserwordV1ByIds(Long[] userids);

    /**
     * 删除用户生词关系信息
     * 
     * @param userid 用户生词关系ID
     * @return 结果
     */
    public int deleteUserwordV1ById(Long userid);
}
