package com.demash.lrucache

class InsertGetBitmap : AmojeeCache {
    private val hashMap: LRU<String, AMJBitmap> = LRU(10, 1.1f)
    override fun put(key: String, bitmap: AMJBitmap) {
        hashMap[key] = bitmap
    }

    override fun get(key: String): AMJBitmap {
        return hashMap[key]!!
    }

    fun print() {
        hashMap.keys.forEach {
            System.out.println(it)
        }
    }
}