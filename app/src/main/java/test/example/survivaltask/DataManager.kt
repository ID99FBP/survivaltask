package test.example.survivaltask

object DataManager {
    private val countrylist= mutableListOf<Countries>()

    fun addCountry(countries: Countries){
        countrylist.add(countries)
    }
    val country:List<Countries>
    get()= countrylist



}