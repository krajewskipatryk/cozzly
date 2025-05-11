package com.cozzly.activities.shopping.list

import database.Entity
import java.time.Instant

class ShoppingList(private var id : String, private val title: String, private val created: Instant) : Entity {
    private lateinit var body: String
    private var oca : Long = 0L

    fun setBody(value : String) {
        body = value
    }

    fun getTitle() : String {
        return title;
    }

    fun getBody() : String {
        return body;
    }

    fun getCreated() : Instant {
        return created;
    }

    override fun getId(): String {
        return id
    }

    override fun getOca(): Long {
        return oca
    }
}
