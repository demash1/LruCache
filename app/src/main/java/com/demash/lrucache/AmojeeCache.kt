package com.demash.lrucache

interface AmojeeCache {
    fun put(key: String, bitmap: AMJBitmap)
    fun get(key: String): AMJBitmap
}

