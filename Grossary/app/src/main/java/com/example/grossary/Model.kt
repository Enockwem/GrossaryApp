package com.example.grossary

data class Item(var itemName: String)

data class PqAmout(var itemPrice: Int, var quantityAvailable: Int,var Description: String)

// Data supplier for the Items Avaible
object Supplier{
    val item = listOf<Item>(
            Item("Tomatoes"),
            Item("Onions"),
            Item("Carrot"),
            Item("Nakati"),
            Item("Bugga"),
            Item("Irish"),
            Item("Yellow Bananas"),
            Item("Rice"),
            Item("Cucumber")
    )
}

// Data supplier for the second Data class #PqAmount
object Supplier2{
    val info = listOf<PqAmout>(
            PqAmout(100,30000,""),
            PqAmout(150,500000,""),
            PqAmout(200,3000,""),
            PqAmout(1500, 100,""),
            PqAmout(2000, 30,""),
            PqAmout(500, 450,""),
            PqAmout(3000, 150,""),
            PqAmout(4500,1500,""),
            PqAmout(500,400,"")
    )
}