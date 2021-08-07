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
import com.ruoyi.system.domain.UserState;
import com.ruoyi.system.service.IUserStateService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 最近用户状态Controller
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@RestController
@RequestMapping("/state")
public class UserStateController extends BaseController
{
    @Autowired
    private IUserStateService userStateService;

    /**
     * 查询最近用户状态列表
     */
    @PreAuthorize(hasPermi = "system:state:list")
    @GetMapping("/list")
    public TableDataInfo list(UserState userState)
    {
        startPage();
        List<UserState> list = userStateService.selectUserStateList(userState);
        return getDataTable(list);
    }

    /**
     * 导出最近用户状态列表
     */
    @PreAuthorize(hasPermi = "system:state:export")
    @Log(title = "最近用户状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserState userState) throws IOException
    {
        List<UserState> list = userStateService.selectUserStateList(userState);
        ExcelUtil<UserState> util = new ExcelUtil<UserState>(UserState.class);
        util.exportExcel(response, list, "最近用户状态数据");
    }

    /**
     * 获取最近用户状态详细信息
     */
    @PreAuthorize(hasPermi = "system:state:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(userStateService.selectUserStateById(id));
    }

    /**
     * 新增最近用户状态
     */
    @PreAuthorize(hasPermi = "system:state:add")
    @Log(title = "最近用户状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserState userState)
    {
        return toAjax(userStateService.insertUserState(userState));
    }

    /**
     * 修改最近用户状态
     */
    @PreAuthorize(hasPermi = "system:state:edit")
    @Log(title = "最近用户状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserState userState)
    {
        return toAjax(userStateService.updateUserState(userState));
    }

    /**
     * 删除最近用户状态
     */
    @PreAuthorize(hasPermi = "system:state:remove")
    @Log(title = "最近用户状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userStateService.deleteUserStateByIds(ids));
    }
}
