package com.cozzly.activities.shopping.list

import com.cozzly.activities.shopping.list.dto.SingleUseShoppingList

interface ShoppingListService {
    fun createSingleUseList(title : String) : SingleUseShoppingList
}