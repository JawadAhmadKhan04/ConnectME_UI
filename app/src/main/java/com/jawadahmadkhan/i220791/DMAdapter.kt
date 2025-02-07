package com.jawadahmadkhan.i220791
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DMAdapter(private val dmList: List<DMItem>) : RecyclerView.Adapter<DMAdapter.DMViewHolder>() {

    class DMViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profileImage)
        val nameText: TextView = itemView.findViewById(R.id.nameText)
        val cameraIcon: ImageView = itemView.findViewById(R.id.cameraIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DMViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dm_list_item, parent, false)
        return DMViewHolder(view)
    }

    override fun onBindViewHolder(holder: DMViewHolder, position: Int) {
        val dmItem = dmList[position]
        holder.profileImage.setImageResource(dmItem.imageRes)
        holder.nameText.text = dmItem.name

        // Click event (open chat)
        holder.itemView.setOnClickListener {
            // Implement chat opening logic
        }
    }

    override fun getItemCount() = dmList.size
}
