package com.markcrisostomo.storeapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.markcrisostomo.storeapp.Model.Product
import com.markcrisostomo.storeapp.R
import com.markcrisostomo.storeapp.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_single_product.*

class SingleProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_product)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        singleItem_image.setImageResource(resourceId)
        singleProduct_name.text = product.title
        singleProduct__price.text = product.price
    }
}
