package com.android.disputer.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.disputer.R
import com.android.disputer.model.Dispute
import kotlinx.android.synthetic.main.layout_dispute_item.view.*

class FeedRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var disputes: List<Dispute> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DisputeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_dispute_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is DisputeViewHolder -> {
                holder.bind(disputes[position])
            }
        }
    }

    fun submitList(disputeList: List<Dispute>) {
        disputes = disputeList
    }

    override fun getItemCount(): Int {
        return disputes.size
    }

    class DisputeViewHolder constructor (
        itemView: View
            ): RecyclerView.ViewHolder(itemView) {

                val disputeText: TextView = itemView.dispute_text
                val disputeUsername: TextView = itemView.dispute_username
                val disputeName: TextView = itemView.dispute_name
                val disputeAvatar = itemView.dispute_avatar

                fun bind(dispute: Dispute) {

                    disputeText.text = dispute.text
                    disputeUsername.text = "@${dispute.username}"
                    disputeName.text = dispute.name
                    disputeAvatar.setImageResource(dispute.avatar.pic)

                }
            }

}