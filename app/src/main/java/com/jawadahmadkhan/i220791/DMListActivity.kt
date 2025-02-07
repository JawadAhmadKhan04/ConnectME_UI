package com.jawadahmadkhan.i220791
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DMListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_dms)

        val dmRecyclerView = findViewById<RecyclerView>(R.id.dmRecyclerView)
        dmRecyclerView.layoutManager = LinearLayoutManager(this)

        val dmList = listOf(
            DMItem("Henry Benjamin", R.drawable.dm_image),
            DMItem("Emily James", R.drawable.dm_image),
            DMItem("Lily Thomas", R.drawable.dm_image),
            DMItem("Christopher", R.drawable.dm_image),
            DMItem("Amy Wesley", R.drawable.dm_image),
            DMItem("Laura Ryan", R.drawable.dm_image),
            DMItem("Henry Benjamin", R.drawable.dm_image),
            DMItem("Emily James", R.drawable.dm_image),
            DMItem("Lily Thomas", R.drawable.dm_image),
            DMItem("Christopher", R.drawable.dm_image),
            DMItem("Amy Wesley", R.drawable.dm_image),
            DMItem("Laura Ryan", R.drawable.dm_image),
            DMItem("Henry Benjamin", R.drawable.dm_image),
            DMItem("Emily James", R.drawable.dm_image),
            DMItem("Lily Thomas", R.drawable.dm_image),
            DMItem("Christopher", R.drawable.dm_image),
            DMItem("Amy Wesley", R.drawable.dm_image),
            DMItem("Laura Ryan", R.drawable.dm_image)
        )

        dmRecyclerView.adapter = DMAdapter(dmList)
    }
}
