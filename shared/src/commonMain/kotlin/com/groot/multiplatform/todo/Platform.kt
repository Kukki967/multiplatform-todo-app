package com.groot.multiplatform.todo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform