package com.example.handin3

class RedditFrontPage {
    private val posts= mutableListOf<RedditPost>()

    fun addPost(post: RedditPost) {
        posts.add(post)
    }

    fun deletePost(index: Int) {
        posts.removeAt(index)
    }

    fun displayPosts() {
        for (post in posts) {
            println(post)
        }
    }
}

fun main() {
    val frontPage = RedditFrontPage()

    val post1 = RedditPost("John Pork", "something boring")
    val post2 = RedditPost("Fred", "from scoobdy dooby")
    val post3 = RedditPost("Shrek", "Shrek AMA")

    frontPage.addPost(post1)
    frontPage.addPost(post2)
    frontPage.addPost(post3)

    frontPage.displayPosts()

    frontPage.deletePost(1)

    println("\n")

    frontPage.displayPosts()


}