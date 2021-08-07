<template>
  <div>
    <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
      <el-form-item label="单行文本" prop="field101">
        <el-input v-model="formData.field101" placeholder="请输入单行文本" clearable :style="{width: '100%'}">
        </el-input>
      </el-form-item>
      <el-form-item label="按钮" prop="field102">
        <el-button type="primary" icon="el-icon-search" size="medium"> 主要按钮 </el-button>
      </el-form-item>
      <el-form-item label="按钮" prop="field103">
        <el-button type="primary" icon="el-icon-search" size="medium"> 主要按钮 </el-button>
      </el-form-item>
      <el-form-item label="按钮" prop="field104">
        <el-button type="primary" icon="el-icon-search" size="medium"> 主要按钮 </el-button>
      </el-form-item>
      <el-form-item label="按钮" prop="field105">
        <el-button type="primary" icon="el-icon-search" size="medium"> 主要按钮 </el-button>
      </el-form-item>
      <el-form-item size="large">
        <el-button type="primary" @click="submitForm">提交</el-button>
        <el-button @click="resetForm">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
  export default {
    components: {},
    props: [],
    data() {
      return {
        formData: {
          field101: undefined,
          field102: undefined,
          field103: undefined,
          field104: undefined,
          field105: undefined,
        },
        rules: {
          field101: [{
            required: true,
            message: '请输入单行文本',
            trigger: 'blur'
          }],
        },
      }
    },
    computed: {},
    watch: {},
    created() {},
    mounted() {},
    methods: {
      submitForm() {
        this.$refs['elForm'].validate(valid => {
          if (!valid) return
          // TODO 提交表单
        })
      },
      resetForm() {
        this.$refs['elForm'].resetFields()
      },
    }
  }

</script>
<style>
</style>
