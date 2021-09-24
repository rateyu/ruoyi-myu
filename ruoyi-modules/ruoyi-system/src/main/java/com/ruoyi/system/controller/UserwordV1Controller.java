package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.PreAuthorize;
import com.ruoyi.system.domain.UserwordV1;
import com.ruoyi.system.service.IUserwordV1Service;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 用户生词关系Controller
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
@RestController
@RequestMapping("/wordV1")
public class UserwordV1Controller extends BaseController
{
    @Autowired
    private IUserwordV1Service userwordV1Service;

    /**
     * 查询用户生词关系列表
     */
    @PreAuthorize(hasPermi = "system:V1:list")
    @GetMapping("/list")
    public TableDataInfo list(UserwordV1 userwordV1)
    {
        startPage();
        List<UserwordV1> list = userwordV1Service.selectUserwordV1List(userwordV1);
        return getDataTable(list);
    }

    /**
     * 导出用户生词关系列表
     */
    @PreAuthorize(hasPermi = "system:V1:export")
    @Log(title = "用户生词关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserwordV1 userwordV1) throws IOException
    {
        List<UserwordV1> list = userwordV1Service.selectUserwordV1List(userwordV1);
        ExcelUtil<UserwordV1> util = new ExcelUtil<UserwordV1>(UserwordV1.class);
        util.exportExcel(response, list, "用户生词关系数据");
    }

    /**
     * 获取用户生词关系详细信息
     */
    @PreAuthorize(hasPermi = "system:V1:query")
    @GetMapping(value = "/{userid}")
    public AjaxResult getInfo(@PathVariable("userid") Long userid)
    {
        return AjaxResult.success(userwordV1Service.selectUserwordV1ById(userid));
    }

    /**
     * 新增用户生词关系
     */
    @PreAuthorize(hasPermi = "system:V1:add")
    @Log(title = "用户生词关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserwordV1 userwordV1)
    {
        return toAjax(userwordV1Service.insertUserwordV1(userwordV1));
    }

    /**
     * 修改用户生词关系
     */
    @PreAuthorize(hasPermi = "system:V1:edit")
    @Log(title = "用户生词关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserwordV1 userwordV1)
    {
        return toAjax(userwordV1Service.updateUserwordV1(userwordV1));
    }

    /**
     * 删除用户生词关系
     */
    @PreAuthorize(hasPermi = "system:V1:remove")
    @Log(title = "用户生词关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userids}")
    public AjaxResult remove(@PathVariable Long[] userids)
    {
        return toAjax(userwordV1Service.deleteUserwordV1ByIds(userids));
    }
}
