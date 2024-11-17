package org.mikhnyukartemm.kotlincourse.lesson21

class Container<T>(
    val i: T
) {

}

class PairBox<T, B>(
    val j: T,
    val e: B
) {

}

class LimitedContainer<T : Number>(
    val i: T?
)

interface Storage<T> {
    fun set(i: T)
    fun get(): T
}

interface Transformer<A, B> {
    fun tranform(i: A): B
}

fun <Q> swap(list: List<Q>, index1: Int, index2: Int): List<Q> {
    return list
}

fun <W> second(list: List<W>, list2: List<W>): List<W> {
    return list
}

fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    return toMap(keys, values)
}