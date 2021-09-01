package test.example.survivaltask

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryClassholder(viewItem:View):RecyclerView.ViewHolder(viewItem){
    val textTeam=viewItem.findViewById<TextView>(R.id.team_text)
    val rank1Number=viewItem.findViewById<TextView>(R.id.rank1)
    val rankNumber=viewItem.findViewById<TextView>(R.id.rank2)
    val imageGold=viewItem.findViewById<ImageView>(R.id.gold_pic)
    val goldMedal=viewItem.findViewById<TextView>(R.id.gold_text)
    val goldImage=viewItem.findViewById<ImageView>(R.id.bronze_image)
    val bronzeMedal=viewItem.findViewById<TextView>(R.id.bronze_text)
    val silverImage=viewItem.findViewById<ImageView>(R.id.silver_image)
    val silverText=viewItem.findViewById<TextView>(R.id.silver_text)
    val totaltext=viewItem.findViewById<TextView>(R.id.total_number)
    val totalNumber=viewItem.findViewById<TextView>(R.id.total_text)


}