<script setup lang="ts">

import { ref } from 'vue'

import axios from 'axios'
import { useRouter } from 'vue-router';

const title = ref("");
const content = ref("");

const router = useRouter();

const write = function () {
  axios.post("/api/posts", {
    title: title.value,
    content: content.value
  })
      .then(() => {
        router.replace({name: "home"});
      });
};
</script>

<template>
  <div>
    <el-input v-model="title" placeholder="제목을 입력해 주세요..." />
  </div>

  <div class="mt-2">
    <el-input v-model="content" placeholder="내용을 입력해 주세요....." type="textarea" rows="15"/>
  </div>


  <div class="mt-2">
    <div class="d-flex justify-content-end">
      <el-button type="primary" @click="write()">글 작성 완료</el-button>
    </div>
  </div>


</template>

<style scoped>

</style>
