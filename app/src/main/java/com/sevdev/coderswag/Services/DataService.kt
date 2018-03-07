package com.sevdev.coderswag.Services

import com.sevdev.coderswag.Model.Category
import com.sevdev.coderswag.Model.Product
import java.util.*

/**
 * Created by davidseverns on 3/7/18.
 */
object DataService {
    val catagories = listOf(Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats", "hatimage"),
            Category("Digital", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Devslope Graphic Beanie","$18","hat01"),
            Product("Devslope Hat Black","$18","hat02"),
            Product("Devslope Hat White","$18","hat03"),
            Product("Devslope Hat Snapback","$18","hat04")
    )
    val hoodies = listOf(
            Product("Devslope Hoodie Gray","$28","hoodie01"),
            Product("Devslope Hoodie Red","$28","hoodie02"),
            Product("Devslope Hoodie Gray","$28","hoodie03"),
            Product("Devslope Hoodie Black","$28","hoodie04")
    )

    val shirts = listOf(
            Product("Devslope shirt Gray","$20","shirt01"),
            Product("Devslope shirt Red","$20","shirt02"),
            Product("Devslope shirt Gray","$20","shirt03"),
            Product("Devslope shirt Black","$20","shirt04"),
            Product("Devslope shirt Black","$20","shirt05")

    )

}