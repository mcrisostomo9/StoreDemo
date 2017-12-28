package com.markcrisostomo.storeapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.markcrisostomo.storeapp.Adapters.CategoryAdapter
import com.markcrisostomo.storeapp.Model.Category
import com.markcrisostomo.storeapp.R
import com.markcrisostomo.storeapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories
                )
        categoryListView.adapter = adapter


    }
}
