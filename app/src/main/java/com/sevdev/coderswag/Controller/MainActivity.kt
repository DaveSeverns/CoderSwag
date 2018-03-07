package com.sevdev.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import com.sevdev.coderswag.Adapters.CategoryAdapter
import com.sevdev.coderswag.Adapters.CategoryRecycleAdapter
import com.sevdev.coderswag.Model.Category
import com.sevdev.coderswag.R
import com.sevdev.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,DataService.catagories)
        categoryRecycleList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryRecycleList.layoutManager = layoutManager

    }
}
