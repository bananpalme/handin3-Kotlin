package com.example.handin3

class Product(val name: String, var quantity: Int)

class Inventory {
    private val products = mutableListOf<Product>()

    fun addProduct(name: String, quantity: Int) {
        products.add(Product(name, quantity))
    }

    fun removeProduct(name: String) {
        products.removeAll { it.name == name }
    }

    fun displayInventory() {
        for (product in products) {
            println("Product: ${product.name}, Quantity: ${product.quantity}")
        }

    }
}

fun main() {
    val inventory = Inventory()

    inventory.addProduct("Laptop", 10)
    inventory.addProduct("Smartphone", 15)
    inventory.addProduct("Headphones", 25)

    inventory.displayInventory()

    inventory.removeProduct("Smartphone")

    inventory.displayInventory()
}

