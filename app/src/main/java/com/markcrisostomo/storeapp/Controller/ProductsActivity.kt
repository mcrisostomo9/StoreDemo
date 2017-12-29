package com.markcrisostomo.storeapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.markcrisostomo.storeapp.R
import com.markcrisostomo.storeapp.Utils.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}
