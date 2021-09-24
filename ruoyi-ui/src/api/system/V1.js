import request from '@/utils/request'

// 查询生词列表
export function listV1(query) {
  return request({
    url: '/system/wordsV1/list',
    method: 'get',
    params: query
  })
}

// 查询生词详细
export function getV1(wordsid) {
  return request({
    url: '/system/wordsV1/' + wordsid,
    method: 'get'
  })
}

// 新增生词
export function addV1(data) {
  return request({
    url: '/system/wordsV1',
    method: 'post',
    data: data
  })
}

// 修改生词
export function updateV1(data) {
  return request({
    url: '/system/wordsV1',
    method: 'put',
    data: data
  })
}

// 删除生词
export function delV1(wordsid) {
  return request({
    url: '/system/wordsV1/' + wordsid,
    method: 'delete'
  })
}
