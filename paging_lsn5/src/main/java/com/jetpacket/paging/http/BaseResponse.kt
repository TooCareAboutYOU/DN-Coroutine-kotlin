package com.jetpacket.paging.http

/**
 * @author zhangshuai
 * @date 2022/5/3 ζζδΊ
 * @email zhangshuai@dushu365.com
 * @description
 */
class BaseResponse<T> {
    var data: T? = null
    var errorCode: Int = 0
    var errorMsg: String = ""
}
