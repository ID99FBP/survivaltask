package test.example.survivaltask

object DataManager {
    private val countrylist= mutableListOf<Countries>()
    private var countryIndex=0
    fun addCountries(countries: Countries){
        countrylist.add(countries)
    }
    fun currentcuntry():Countries= countrylist[countryIndex]
    fun nextcountry():Countries{
        countryIndex++
        return countrylist[countryIndex]
    }

    fun previouscountrty():Countries{

        countryIndex--
        if(countryIndex==-1)
        {
            countryIndex= countrylist.size-1
        }
        return countrylist[countryIndex]
    }
}