package com.demash.lrucache

class LRU<K, V>(capacity: Int, loadfactor: Float) : LinkedHashMap<K, V>(capacity + 1, loadfactor, true) {
    private var cacheSize = 10

    init {
        this.cacheSize = capacity
    }

    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
        return this.size > cacheSize
    }
}