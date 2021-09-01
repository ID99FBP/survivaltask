package test.example.survivaltask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.*

class Countrydapter(val list: List<Countries>): Adapter<CountryClassholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryClassholder {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
       return CountryClassholder(view)
    }

    override fun onBindViewHolder(holder: CountryClassholder, position: Int) {
      val currentCountries=list[position]
        holder.apply {
            textTeam.text=currentCountries.teamNoc
            rankNumber.text=currentCountries.rank.toString()
            goldMedal.text=currentCountries.goldMedal.toString()
            bronzeMedal.text=currentCountries.bronzeMedal.toString()
            silverText.text=currentCountries.silverMedal.toString()
            totalNumber.text=currentCountries.total.toString()

        }
    }

    override fun getItemCount()= list.size

}