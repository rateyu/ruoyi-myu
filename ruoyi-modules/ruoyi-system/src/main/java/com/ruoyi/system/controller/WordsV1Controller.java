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
import com.ruoyi.system.domain.WordsV1;
import com.ruoyi.system.service.IWordsV1Service;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 生词Controller
 * 
 * @author ruoyi
 * @date 2021-09-22
 */
@RestController
@RequestMapping("/wordsV1")
public class WordsV1Controller extends BaseController
{
    @Autowired
    private IWordsV1Service wordsV1Service;

    /**
     * 查询生词列表
     */
    @PreAuthorize(hasPermi = "system:V1:list")
    @GetMapping("/list")
    public TableDataInfo list(WordsV1 wordsV1)
    {
        startPage();
        List<WordsV1> list = wordsV1Service.selectWordsV1List(wordsV1);
        return getDataTable(list);
    }

    /**
     * 导出生词列表
     */
    @PreAuthorize(hasPermi = "system:V1:export")
    @Log(title = "生词", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WordsV1 wordsV1) throws IOException
    {
        List<WordsV1> list = wordsV1Service.selectWordsV1List(wordsV1);
        ExcelUtil<WordsV1> util = new ExcelUtil<WordsV1>(WordsV1.class);
        util.exportExcel(response, list, "生词数据");
    }

    /**
     * 获取生词详细信息
     */
    @PreAuthorize(hasPermi = "system:V1:query")
    @GetMapping(value = "/{wordsid}")
    public AjaxResult getInfo(@PathVariable("wordsid") Long wordsid)
    {
        return AjaxResult.success(wordsV1Service.selectWordsV1ById(wordsid));
    }

    /**
     * 新增生词
     */
    @PreAuthorize(hasPermi = "system:V1:add")
    @Log(title = "生词", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WordsV1 wordsV1)
    {
        return toAjax(wordsV1Service.insertWordsV1(wordsV1));
    }

    /**
     * 修改生词
     */
    @PreAuthorize(hasPermi = "system:V1:edit")
    @Log(title = "生词", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WordsV1 wordsV1)
    {
        return toAjax(wordsV1Service.updateWordsV1(wordsV1));
    }

    /**
     * 删除生词
     */
    @PreAuthorize(hasPermi = "system:V1:remove")
    @Log(title = "生词", businessType = BusinessType.DELETE)
	@DeleteMapping("/{wordsids}")
    public AjaxResult remove(@PathVariable Long[] wordsids)
    {
        return toAjax(wordsV1Service.deleteWordsV1ByIds(wordsids));
    }
}
