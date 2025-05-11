package com.cozzly.activities.shopping.list

import com.cozzly.activities.shopping.list.dto.SingleUseShoppingList
import database.CustomRepository
import database.CustomRepositoryImpl
import java.time.Instant
import java.util.*

class ShoppingListServiceImpl(
    private val shoppingListRepository : CustomRepository<ShoppingList> = CustomRepositoryImpl()
) : ShoppingListService {

    override fun createSingleUseList(title: String): SingleUseShoppingList {
        val shoppingList = ShoppingList(UUID.randomUUID().toString(), title, Instant.now())

        return SingleUseShoppingList(shoppingListRepository.persist(shoppingList));
    }
}