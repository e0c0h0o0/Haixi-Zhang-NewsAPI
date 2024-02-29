package sakura.newsapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Arrays

object Global {

    const val API_KEY = "84eb1fc005c74f858f2d5c84a25bdcec"
    val CATEGORYS = Arrays.asList("business", "entertainment", "general", "health", "science", "sports", "technology")
    val retrofit = Retrofit.Builder().baseUrl("https://newsapi.org").addConverterFactory(GsonConverterFactory.create()).build()
    val newsApiService = retrofit.create(NewsApiService::class.java)

}