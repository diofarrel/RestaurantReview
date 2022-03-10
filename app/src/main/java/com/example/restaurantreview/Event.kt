package com.example.restaurantreview

/*
    EVENT WRAPPER
    membuat sebuah single event
 */

// T adalah tipe generic yang bisa digunakan supaya kelas ini dapat membungkus berbagai macam data.
open class Event<out T> (private val content: T) {

    @Suppress("MemberVisibilityCanBePrivate")
    var hasBeenHandled = false
        private set

    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content
}