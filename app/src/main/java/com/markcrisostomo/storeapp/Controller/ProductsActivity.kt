package com.markcrisostomo.storeapp.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.markcrisostomo.storeapp.Adapters.ProductsAdapter
import com.markcrisostomo.storeapp.R
import com.markcrisostomo.storeapp.Services.DataService
import com.markcrisostomo.storeapp.Utils.EXTRA_CATEGORY
import com.markcrisostomo.storeapp.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { product ->
            val singleProuctIntent = Intent(this, SingleProductActivity::class.java)
            singleProuctIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(singleProuctIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}
