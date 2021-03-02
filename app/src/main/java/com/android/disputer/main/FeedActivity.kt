package com.android.disputer.main

import android.graphics.PixelFormat
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.disputer.R
import com.android.disputer.TopSpacing
import com.android.disputer.adapters.FeedRecyclerAdapter
import com.android.disputer.model.DisputeGenerate
import kotlinx.android.synthetic.main.activity_feed.*


class FeedActivity : AppCompatActivity() {

    private lateinit var disputeAdapter: FeedRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val window: Window = window
        //eliminates color banding
        //eliminates color banding
        window.setFormat(PixelFormat.RGBA_8888)


        initRecyclerView()
        addDisputes()

    }

    private fun addDisputes() {
        val data = DisputeGenerate.createDataSet()

        disputeAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        dispute_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@FeedActivity)
            val topSpacing = TopSpacing(1)
            addItemDecoration(topSpacing)
            disputeAdapter = FeedRecyclerAdapter()
            adapter = disputeAdapter
        }
    }
}