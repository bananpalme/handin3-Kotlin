package com.example.handin3

class RedditPost (
    private val author: String,
    private var title: String
) {
    private val date: String = "17-02-2025"
    private var votes: Int = 1

    fun getAuthor(): String = author
    fun getTitle(): String = title
    fun getDatePosted(): String = date
    fun getVotes(): Int = votes

    fun upvote() {
        votes++
    }

    fun downvote() {
        votes--
    }

    override fun toString(): String {
        return "RedditPost(author: $author, title: $title, votes: $votes)"
    }

}

fun main() {
    val posts = arrayListOf(
        RedditPost("John", "title"),
        RedditPost("John", "title"),
        RedditPost("John", "title"),
        RedditPost("John", "title"),
        RedditPost("John", "title")
    )

    posts[0].upvote()
    posts[1].upvote()
    posts[1].upvote()
    posts[2].downvote()
    posts[3].downvote()
    posts[3].downvote()

    posts.sortByDescending { it.getVotes() }

    for (post in posts) {
        println(post)
    }

}

