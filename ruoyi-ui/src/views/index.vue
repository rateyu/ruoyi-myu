<template>
  <div>
    <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
      <div v-show="play">
        <el-input v-model="formData.field101" placeholder="请输入单行文本" clearable :style="{width: '100%'}">
        </el-input>
      </div>
        <el-button type="primary" size="mini" @click="startChangeA()"> last </el-button>
        <el-button type="primary" size="mini" @click="startChangeB()"> get it </el-button>
        <el-button type="primary" size="mini" @click="startChangeC()"> next </el-button>
        <el-button type="primary" size="mini" @click="startChangeD()"> test </el-button>
<!--      <el-form-item size="large">
        <el-button type="primary" @click="submitForm">提交</el-button>
        <el-button @click="resetForm">重置</el-button>
      </el-form-item>-->
    </el-form>

    <el-row
      :gutter="20"
      v-for="(item, index) in list"
      :key=" + index"
    >
      <div >  {{item.wordsid}} {{ item.english }} {{ item.english2ch }}</div>
    </el-row>

  </div>
</template>
<script>

  import { getWords,getWord,getWordNext,getWordLast,insertUserWord,getWordCurrent,getWordsV1 } from "@/api/test/hello";
  // import mock from './test/mock.js'
  // import axios from 'axios'

  export default {
    components: {},
    props: [],
    data() {
      return {
        myNum:1,
        play:true,
        wordId:0,
        wordLabel:0,
        formData: {
          field101: 'start go'
        },
        rules: {
          field101: [{
            required: true,
            message: '请输入单行文本',
            trigger: 'blur'
          }],
        },
        list: [],
      }
    },
    computed: {},
    watch: {},
    created() {

    },
    mounted() {
      // this.formData.field101 = 'start 2'
      getWordCurrent().then(response => {
        // this.formData.field101 = 'start 1'
        // console.log(response.data.id)
        // console.log(response.data.wordLabel)
        this.formData.field101 = response.data.word
        this.wordId = response.data.id
        // this.postOptions = response.posts;
        // this.roleOptions = response.roles;
        // this.open = true;
        // this.title = "添加用户";
        // this.form.password = this.initPassword;
      });
    },
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

      startChangeA() {
        // this.formData.field101 = 'start Aa'
        getWordLast().then(response => {
          console.log(response.data.id)
          console.log(response.data.wordLabel)
          this.formData.field101 = response.data.word
          this.wordId = response.data.id
        });

      },

      startChangeB() {
        // this.formData.field101 = 'start B'
        console.log(this.wordId)
        // this.play = !this.play

        insertUserWord(0,this.wordId,2).then(response => {
          // this.formData.field101 = response.data.word
          // this.wordId = response.data.id
          // startChangeA()
          console.log(this.wordId)
        });
      },

      startChangeC() {
        // this.formData.field101 = 'start C'

        // getWord(this.myNum).then(response => {
        getWordNext().then(response => {
          // this.formData.field101 = 'start 1'
          console.log(response.data.id)
          console.log(response.data.wordLabel)
          this.formData.field101 = response.data.word
          this.wordId = response.data.id
          // this.postOptions = response.posts;
          // this.roleOptions = response.roles;
          // this.open = true;
          // this.title = "添加用户";
          // this.form.password = this.initPassword;
        });
      },

      startChangeD() {
/*        axios.post("/list").then(response => {
          if (response.data) {
            console.log(response.data)
            alert(response.data.name + ',' + response.data.age+','+response.data.list)
          }
        })*/

        getWordsV1().then(response => {
          console.log(response.rows)
          this.list = response.rows
        });
      },
    }
  }

</script>
<style>
</style>
