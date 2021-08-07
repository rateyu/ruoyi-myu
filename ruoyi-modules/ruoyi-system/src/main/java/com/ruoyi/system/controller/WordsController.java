package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.utils.SecurityUtils;
import com.ruoyi.system.domain.UserState;
import com.ruoyi.system.service.IUserStateService;
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
import com.ruoyi.system.domain.Words;
import com.ruoyi.system.service.IWordsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 词汇库Controller
 * 
 * @author ruoyi
 * @date 2021-07-25
 */
@RestController
@RequestMapping("/words")
public class WordsController extends BaseController
{
    @Autowired
    private IWordsService wordsService;
    @Autowired
    private IUserStateService userStateService;
    /**
     * 查询词汇库列表
     */
    @PreAuthorize(hasPermi = "system:words:list")
    @GetMapping("/list")
    public TableDataInfo list(Words words)
    {
        startPage();
        List<Words> list = wordsService.selectWordsList(words);
        return getDataTable(list);
    }

    /**
     * 导出词汇库列表
     */
    @PreAuthorize(hasPermi = "system:words:export")
    @Log(title = "词汇库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Words words) throws IOException
    {
        List<Words> list = wordsService.selectWordsList(words);
        ExcelUtil<Words> util = new ExcelUtil<Words>(Words.class);
        util.exportExcel(response, list, "词汇库数据");
    }

    /**
     * 获取词汇库详细信息
     */
    @PreAuthorize(hasPermi = "system:words:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wordsService.selectWordsById(id));
    }


    @PreAuthorize(hasPermi = "system:words:query")
    @GetMapping(value = "/next")
    public AjaxResult getNextInfo()
    {
        Long userId = SecurityUtils.getUserId();
        UserState userState = userStateService.selectUserStateByUserId(userId);
        if (userState==null) {
            userState = new UserState();
            userState.setUserId(userId);
            userState.setWordId(0L);
            userStateService.insertUserState(userState);
        }

        Words words = wordsService.selectWordsByIdNext(userState);
        if (words!=null&&words.getId()!=null) {
            userState.setWordId(words.getId());
            userStateService.updateUserState(userState);
        } else {
            userState.setWordId(0L);
            userStateService.updateUserState(userState);
            words = wordsService.selectWordsByIdNext(userState);
        }

        return AjaxResult.success(words);
    }

    @PreAuthorize(hasPermi = "system:words:query")
    @GetMapping(value = "/last")
    public AjaxResult getLastInfo()
    {
        Long userId = SecurityUtils.getUserId();
        UserState userState = userStateService.selectUserStateByUserId(userId);
        if (userState==null) {
            userState = new UserState();
            userState.setUserId(userId);
            userState.setWordId(0L);
            userStateService.insertUserState(userState);
        }

        Words words = wordsService.selectWordsByIdLast(userState);
        if (words!=null&&words.getId()!=null) {
            userState.setWordId(words.getId());
            userStateService.updateUserState(userState);
        } else {
            userState.setWordId(0L);
            userStateService.updateUserState(userState);
            words = wordsService.selectWordsByIdLast(userState);
        }

        return AjaxResult.success(words);
    }

    @PreAuthorize(hasPermi = "system:words:query")
    @GetMapping(value = "/current")
    public AjaxResult getCurInfo()
    {
        Long userId = SecurityUtils.getUserId();
        UserState userState = userStateService.selectUserStateByUserId(userId);
        if (userState==null) {
            userState = new UserState();
            userState.setUserId(userId);
            userState.setWordId(0L);
            userStateService.insertUserState(userState);
        }

        Words words = wordsService.selectWordsByIdCurrent(userState);
        if (words!=null&&words.getId()!=null) {
            userState.setWordId(words.getId());
            userStateService.updateUserState(userState);
        } else {
            userState.setWordId(0L);
            userStateService.updateUserState(userState);
            words = wordsService.selectWordsByIdCurrent(userState);
        }
        return AjaxResult.success(words);
    }

    /**
     * 新增词汇库
     */
    @PreAuthorize(hasPermi = "system:words:add")
    @Log(title = "词汇库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Words words)
    {
        return toAjax(wordsService.insertWords(words));
    }

    /**
     * 修改词汇库
     */
    @PreAuthorize(hasPermi = "system:words:edit")
    @Log(title = "词汇库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Words words)
    {
        return toAjax(wordsService.updateWords(words));
    }

    /**
     * 删除词汇库
     */
    @PreAuthorize(hasPermi = "system:words:remove")
    @Log(title = "词汇库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wordsService.deleteWordsByIds(ids));
    }
}
