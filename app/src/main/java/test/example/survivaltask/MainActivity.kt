package test.example.survivaltask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import test.example.survivaltask.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Survivaltask)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(requireNotNull(binding.root))
        setup()
        addcallbacks()


    }
    fun  addcallbacks(){
    }
    fun setup()
    {
        parseFile()
      val adapter=Countrydapter(DataManager.country)
        binding.recyclerCountry.adapter=adapter
    }

    private fun parseFile(){
        val inputStream=assets.open("tokyo_2021.csv")
        val buffer= BufferedReader(InputStreamReader(inputStream))
        val parser=Cvsparser()
        buffer.forEachLine {
            val currentCountry=parser.parse(it)
            DataManager.addCountry(currentCountry)

        }
    }

    }

