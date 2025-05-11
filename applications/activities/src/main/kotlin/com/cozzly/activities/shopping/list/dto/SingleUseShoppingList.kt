package com.cozzly.activities.shopping.list.dto

import com.cozzly.activities.shopping.list.ShoppingList
import java.time.Instant

data class SingleUseShoppingList(val id : String, val title : String, val created : Instant) {
    constructor(shoppingList: ShoppingList) : this(shoppingList.getId(), shoppingList.getTitle(), shoppingList.getCreated())
}
