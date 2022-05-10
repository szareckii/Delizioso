package com.zareckii.delizioso.common

interface EventHandler<E> {
    fun obtainEvent(event: E)
}