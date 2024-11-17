package org.mikhnyukartemm.kotlincourse.lesson22.extensions


fun String.removeSpaces(): String{
    return replace(" ", "")
}