<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="序号" prop="wordsid">
        <el-input
          v-model="queryParams.wordsid"
          placeholder="请输入序号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="中文" prop="chinese">
        <el-input
          v-model="queryParams.chinese"
          placeholder="请输入中文"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="英文" prop="english">
        <el-input
          v-model="queryParams.english"
          placeholder="请输入英文"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音标" prop="phonetic">
        <el-input
          v-model="queryParams.phonetic"
          placeholder="请输入音标"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="英英" prop="english2en">
        <el-input
          v-model="queryParams.english2en"
          placeholder="请输入英英"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="英汉" prop="english2ch">
        <el-input
          v-model="queryParams.english2ch"
          placeholder="请输入英汉"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="句子" prop="sentence">
        <el-input
          v-model="queryParams.sentence"
          placeholder="请输入句子"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图片" prop="picture">
        <el-input
          v-model="queryParams.picture"
          placeholder="请输入图片"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="音频" prop="audio">
        <el-input
          v-model="queryParams.audio"
          placeholder="请输入音频"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="视频" prop="video">
        <el-input
          v-model="queryParams.video"
          placeholder="请输入视频"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外部链接" prop="externalLink">
        <el-input
          v-model="queryParams.externalLink"
          placeholder="请输入外部链接"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="错误举例" prop="errorExample">
        <el-input
          v-model="queryParams.errorExample"
          placeholder="请输入错误举例"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参考" prop="reference">
        <el-input
          v-model="queryParams.reference"
          placeholder="请输入参考"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="关系" prop="relationship">
        <el-input
          v-model="queryParams.relationship"
          placeholder="请输入关系"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="补充1" prop="supplement1">
        <el-input
          v-model="queryParams.supplement1"
          placeholder="请输入补充1"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!--<el-form-item label="补充2" prop="supplement2">
        <el-input
          v-model="queryParams.supplement2"
          placeholder="请输入补充2"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="补充3" prop="supplement3">
        <el-input
          v-model="queryParams.supplement3"
          placeholder="请输入补充3"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="补充4" prop="supplement4">
        <el-input
          v-model="queryParams.supplement4"
          placeholder="请输入补充4"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="补充5" prop="supplement5">
        <el-input
          v-model="queryParams.supplement5"
          placeholder="请输入补充5"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>-->
      <el-form-item label="类型" prop="type">
        <el-select v-model="queryParams.type" placeholder="请选择类型" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="书名" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入书名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单元" prop="unit">
        <el-input
          v-model="queryParams.unit"
          placeholder="请输入单元"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课号" prop="courses">
        <el-input
          v-model="queryParams.courses"
          placeholder="请输入课号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="属性" prop="attributes">
        <el-input
          v-model="queryParams.attributes"
          placeholder="请输入属性"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:V1:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:V1:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:V1:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:V1:export']"
        >导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleView"
        >英文显</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleNView"
        >英文隐</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="V1List" @selection-change="handleSelectionChange">
<!--      <el-table-column type="selection" width="55" align="center" />-->
<!--      <el-table-column label="序号" align="center" prop="wordsid" />
      <el-table-column label="中文" align="center" prop="chinese" />-->
      <el-table-column v-if="wordview" label="英文" align="left" prop="english" />
      <el-table-column label="音标" align="left" prop="phonetic" />
<!--      <el-table-column label="英英" align="center" prop="english2en" />-->
      <el-table-column label="英汉" align="left" prop="english2ch" />
<!--      <el-table-column label="句子" align="center" prop="sentence" />
      <el-table-column label="图片" align="center" prop="picture" />
      <el-table-column label="音频" align="center" prop="audio" />
      <el-table-column label="视频" align="center" prop="video" />
      <el-table-column label="外部链接" align="center" prop="externalLink" />
      <el-table-column label="错误举例" align="center" prop="errorExample" />
      <el-table-column label="参考" align="center" prop="reference" />
      <el-table-column label="关系" align="center" prop="relationship" />-->
      <el-table-column label="词性" align="left" prop="supplement1" />
<!--      <el-table-column label="补充2" align="center" prop="supplement2" />
      <el-table-column label="补充3" align="center" prop="supplement3" />
      <el-table-column label="补充4" align="center" prop="supplement4" />
      <el-table-column label="补充5" align="center" prop="supplement5" />
      <el-table-column label="类型" align="center" prop="type" />-->
<!--      <el-table-column label="书名" align="center" prop="title" />-->
<!--      <el-table-column label="单元" align="center" prop="unit" />-->
<!--      <el-table-column label="课号" align="center" prop="courses" />-->
<!--      <el-table-column label="属性_用户_系统" align="center" prop="attributes" />-->
      <el-table-column label="操作" align="left" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:V1:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:V1:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改生词对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="序号" prop="wordsid">
          <el-input v-model="form.wordsid" placeholder="请输入序号" />
        </el-form-item>
        <el-form-item label="中文" prop="chinese">
          <el-input v-model="form.chinese" placeholder="请输入中文" />
        </el-form-item>
        <el-form-item label="英文" prop="english">
          <el-input v-model="form.english" placeholder="请输入英文" />
        </el-form-item>
        <el-form-item label="音标" prop="phonetic">
          <el-input v-model="form.phonetic" placeholder="请输入音标" />
        </el-form-item>
        <el-form-item label="英英" prop="english2en">
          <el-input v-model="form.english2en" placeholder="请输入英英" />
        </el-form-item>
        <el-form-item label="英汉" prop="english2ch">
          <el-input v-model="form.english2ch" placeholder="请输入英汉" />
        </el-form-item>
        <el-form-item label="句子" prop="sentence">
          <el-input v-model="form.sentence" placeholder="请输入句子" />
        </el-form-item>
        <el-form-item label="图片" prop="picture">
          <el-input v-model="form.picture" placeholder="请输入图片" />
        </el-form-item>
        <el-form-item label="音频" prop="audio">
          <el-input v-model="form.audio" placeholder="请输入音频" />
        </el-form-item>
        <el-form-item label="视频" prop="video">
          <el-input v-model="form.video" placeholder="请输入视频" />
        </el-form-item>
        <el-form-item label="外部链接" prop="externalLink">
          <el-input v-model="form.externalLink" placeholder="请输入外部链接" />
        </el-form-item>
        <el-form-item label="错误举例" prop="errorExample">
          <el-input v-model="form.errorExample" placeholder="请输入错误举例" />
        </el-form-item>
        <el-form-item label="参考" prop="reference">
          <el-input v-model="form.reference" placeholder="请输入参考" />
        </el-form-item>
        <el-form-item label="关系" prop="relationship">
          <el-input v-model="form.relationship" placeholder="请输入关系" />
        </el-form-item>
        <el-form-item label="补充1" prop="supplement1">
          <el-input v-model="form.supplement1" placeholder="请输入补充1" />
        </el-form-item>
        <el-form-item label="补充2" prop="supplement2">
          <el-input v-model="form.supplement2" placeholder="请输入补充2" />
        </el-form-item>
        <el-form-item label="补充3" prop="supplement3">
          <el-input v-model="form.supplement3" placeholder="请输入补充3" />
        </el-form-item>
        <el-form-item label="补充4" prop="supplement4">
          <el-input v-model="form.supplement4" placeholder="请输入补充4" />
        </el-form-item>
        <el-form-item label="补充5" prop="supplement5">
          <el-input v-model="form.supplement5" placeholder="请输入补充5" />
        </el-form-item>
        <el-form-item label="类型" prop="type">
          <el-select v-model="form.type" placeholder="请选择类型">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="书名" prop="title">
          <el-input v-model="form.title" placeholder="请输入书名" />
        </el-form-item>
        <el-form-item label="单元" prop="unit">
          <el-input v-model="form.unit" placeholder="请输入单元" />
        </el-form-item>
        <el-form-item label="课号" prop="courses">
          <el-input v-model="form.courses" placeholder="请输入课号" />
        </el-form-item>
        <el-form-item label="属性_用户_系统" prop="attributes">
          <el-input v-model="form.attributes" placeholder="请输入属性_用户_系统" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listV1, getV1, delV1, addV1, updateV1 } from "@/api/system/V1";

export default {
  name: "V1",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,

      wordview: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 生词表格数据
      V1List: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        wordsid: null,
        chinese: null,
        english: null,
        phonetic: null,
        english2en: null,
        english2ch: null,
        sentence: null,
        picture: null,
        audio: null,
        video: null,
        externalLink: null,
        errorExample: null,
        reference: null,
        relationship: null,
        supplement1: null,
        supplement2: null,
        supplement3: null,
        supplement4: null,
        supplement5: null,
        type: null,
        title: null,
        unit: null,
        courses: null,
        attributes: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询生词列表 */
    getList() {
      this.loading = true;
      listV1(this.queryParams).then(response => {
        this.V1List = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        wordsid: null,
        chinese: null,
        english: null,
        phonetic: null,
        english2en: null,
        english2ch: null,
        sentence: null,
        picture: null,
        audio: null,
        video: null,
        externalLink: null,
        errorExample: null,
        reference: null,
        relationship: null,
        supplement1: null,
        supplement2: null,
        supplement3: null,
        supplement4: null,
        supplement5: null,
        type: null,
        title: null,
        unit: null,
        courses: null,
        attributes: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.wordsid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加生词";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const wordsid = row.wordsid || this.ids
      getV1(wordsid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改生词";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.wordsid != null) {
            updateV1(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addV1(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const wordsids = row.wordsid || this.ids;
      this.$confirm('是否确认删除生词编号为"' + wordsids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delV1(wordsids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/V1/export', {
        ...this.queryParams
      }, `system_V1.xlsx`)
    },

    handleView() {
      console.log(this.wordview)
      this.wordview = true;
      this.getList();
    },

    handleNView() {
      console.log(this.wordview)
      this.wordview = false;
      this.getList();
    }
  }
};
</script>
