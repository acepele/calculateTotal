package com.includehelp

import java.util.*

//Main Function , Entry point of Program
fun main(args: Array<String>) {

    //Input Stream
    val scanner = Scanner(System.`in`)
    val tip = .1750

    //Input Amount
    print("Enter cost of the item : ")
    val cost = scanner.nextDouble()

    //Input Interest Rate
    print("Enter Tax rate : ")
    val tax = scanner.nextDouble()



    //Calculate total cost of items
    val totalCost = (cost.toDouble() + tax.toDouble() + tip.toDouble())


    //Print total cost
    println("The total amount of your items, including tip is :$totalCost")
}