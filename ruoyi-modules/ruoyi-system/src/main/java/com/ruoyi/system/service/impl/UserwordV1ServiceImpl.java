package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserwordV1Mapper;
import com.ruoyi.system.domain.UserwordV1;
import com.ruoyi.system.service.IUserwordV1Service;

/**
 * 用户生词关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
@Service
public class UserwordV1ServiceImpl implements IUserwordV1Service 
{
    @Autowired
    private UserwordV1Mapper userwordV1Mapper;

    /**
     * 查询用户生词关系
     * 
     * @param userid 用户生词关系ID
     * @return 用户生词关系
     */
    @Override
    public UserwordV1 selectUserwordV1ById(Long userid)
    {
        return userwordV1Mapper.selectUserwordV1ById(userid);
    }

    /**
     * 查询用户生词关系列表
     * 
     * @param userwordV1 用户生词关系
     * @return 用户生词关系
     */
    @Override
    public List<UserwordV1> selectUserwordV1List(UserwordV1 userwordV1)
    {
        return userwordV1Mapper.selectUserwordV1List(userwordV1);
    }

    /**
     * 新增用户生词关系
     * 
     * @param userwordV1 用户生词关系
     * @return 结果
     */
    @Override
    public int insertUserwordV1(UserwordV1 userwordV1)
    {
        return userwordV1Mapper.insertUserwordV1(userwordV1);
    }

    /**
     * 修改用户生词关系
     * 
     * @param userwordV1 用户生词关系
     * @return 结果
     */
    @Override
    public int updateUserwordV1(UserwordV1 userwordV1)
    {
        return userwordV1Mapper.updateUserwordV1(userwordV1);
    }

    /**
     * 批量删除用户生词关系
     * 
     * @param userids 需要删除的用户生词关系ID
     * @return 结果
     */
    @Override
    public int deleteUserwordV1ByIds(Long[] userids)
    {
        return userwordV1Mapper.deleteUserwordV1ByIds(userids);
    }

    /**
     * 删除用户生词关系信息
     * 
     * @param userid 用户生词关系ID
     * @return 结果
     */
    @Override
    public int deleteUserwordV1ById(Long userid)
    {
        return userwordV1Mapper.deleteUserwordV1ById(userid);
    }
}
