import request from '@/utils/request'
import { praseStrEmpty } from "@/utils/ruoyi";
// 获取用户详细信息
export function getWords() {
  return request({
    url: '/system/words/lists',
    method: 'get'
  })
}

// 查询用户详细
export function getWord(wordId) {
  return request({
    url: '/system/words/' + praseStrEmpty(wordId),
    method: 'get'
  })
}

export function getWordNext(wordId) {
  return request({
    url: '/system/words/next',
    method: 'get'
  })
}

export function getWordLast(wordId) {
  return request({
    url: '/system/words/last',
    method: 'get'
  })
}

export function getWordCurrent(wordId) {
  return request({
    url: '/system/words/current',
    method: 'get'
  })
}

// 登录方法
export function insertUserWord(userId, wordId,memLevel) {
  return request({
    url: '/system/word',
    method: 'post',
    data: { userId, wordId, memLevel }
  })
}
