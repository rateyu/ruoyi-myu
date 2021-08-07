package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.utils.SecurityUtils;
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
import com.ruoyi.system.domain.UserWord;
import com.ruoyi.system.service.IUserWordService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 用户单词Controller
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@RestController
@RequestMapping("/word")
public class UserWordController extends BaseController
{
    @Autowired
    private IUserWordService userWordService;

    /**
     * 查询用户单词列表
     */
    @PreAuthorize(hasPermi = "system:word:list")
    @GetMapping("/list")
    public TableDataInfo list(UserWord userWord)
    {
        startPage();
        List<UserWord> list = userWordService.selectUserWordList(userWord);
        return getDataTable(list);
    }

    /**
     * 导出用户单词列表
     */
    @PreAuthorize(hasPermi = "system:word:export")
    @Log(title = "用户单词", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserWord userWord) throws IOException
    {
        List<UserWord> list = userWordService.selectUserWordList(userWord);
        ExcelUtil<UserWord> util = new ExcelUtil<UserWord>(UserWord.class);
        util.exportExcel(response, list, "用户单词数据");
    }

    /**
     * 获取用户单词详细信息
     */
    @PreAuthorize(hasPermi = "system:word:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(userWordService.selectUserWordById(id));
    }

    /**
     * 新增用户单词
     */
    @PreAuthorize(hasPermi = "system:words:query")
//    @PreAuthorize(hasPermi = "system:word:add")
    @Log(title = "用户单词", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserWord userWord)
    {
        Long userId = SecurityUtils.getUserId();
        userWord.setUserId(userId);
        return toAjax(userWordService.insertUserWord(userWord));
    }

    /**
     * 修改用户单词
     */
    @PreAuthorize(hasPermi = "system:word:edit")
    @Log(title = "用户单词", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserWord userWord)
    {
        return toAjax(userWordService.updateUserWord(userWord));
    }

    /**
     * 删除用户单词
     */
    @PreAuthorize(hasPermi = "system:word:remove")
    @Log(title = "用户单词", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userWordService.deleteUserWordByIds(ids));
    }
}
