package test.example.survivaltask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import test.example.survivaltask.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        addcallbacks()


    }
    fun  addcallbacks(){
        binding.apply {
            imageView.setOnClickListener{
                bindMatch(DataManager.nextcountry())}
            imageView2.setOnClickListener{
                bindMatch(DataManager.previouscountrty())
            }
        }
    }
    fun setup()
    {
        parseFile()
    }

    private fun parseFile(){
        val inputStream=assets.open("tokyo_2021.csv")
        val buffer= BufferedReader(InputStreamReader(inputStream))
        val parser=Cvsparser()
        buffer.forEachLine {
            Log.v("MAIN_ACTIVITY",it)
            val currentCountries=parser.parse(it)
            DataManager.addCountries(currentCountries)

        }
        bindMatch(DataManager.currentcuntry())
    }

    private fun bindMatch(countries: Countries){
        binding.apply {
            textView.text=countries.rank.toString()
            textView2.text=countries.team_noc
            textView3.text=countries.gold_medal.toString()
            textView4.text=countries.Bronze_Medal.toString()
            textView5.text=countries.silver_medal.toString()
            textView6.text=countries.total.toString()
        }
    }
}