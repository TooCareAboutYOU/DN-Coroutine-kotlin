package com.project.coroutines.mapper

/**
 * @author zhangshuai
 * @date 2022/5/4 ζζδΈ
 * @email zhangshuai@dushu365.com
 * @description
 */
interface Mapper<I, O> {
    fun map(input: I): O
}