package com.example.handin3

class Article(
    val author: String,
    val title: String
) {
    override fun toString(): String {
        return "Author: $author Title: $title"
    }
}

fun main() {
    val article1 = Article("John", "The Porkening")
    val article2 = Article("George", "Something Spooky")
    val article3 = Article("Fitzgerald", "Title of Book")
    val article4 = Article("Marcelo", "El Gato")
    val article5 = Article("Alejandro", "The Lovestory of Mario and Sonic")

    var arrayList = ArrayList<Article>()

    arrayList.add(article1)
    arrayList.add(article2)
    arrayList.add(article3)
    arrayList.add(article4)
    arrayList.add(article5)

    for (i in arrayList) {
        println(i)
    }

}