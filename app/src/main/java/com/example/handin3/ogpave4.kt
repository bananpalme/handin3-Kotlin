package com.example.handin3

fun main() {
    val words = listOf(
        "apple", "banana", "apple", "orange", "banana", "apple", "orange",
        "banana", "apple", "banana", "apple", "orange", "banana", "banana",
        "apple", "orange", "apple", "orange", "banana"
    )

    val wordCount = mutableMapOf<String, Int>()

    for (word in words) {
        wordCount[word] = wordCount.getOrDefault(word, 0) + 1
    }

    println("Word Frequency:")
    for ((word, count) in wordCount) {
        println("$word: $count")
    }


}

