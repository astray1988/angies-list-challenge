class LRUCache[K, +V](val recentCacheSize: Int) {
  def get(key: K): Option[V] = ???
  def put(key: K, value: V): Unit = ???
  // O(1) for values in cache
  // O(log n) for get of any key
  // O(log n) for put of any key
}