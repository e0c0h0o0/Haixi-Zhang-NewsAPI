package sakura.newsapi

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsApiService {

    @GET("/v2/top-headlines?country=us")
    fun getNews(
        @Query("category") category: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = Global.API_KEY,
        @Query("pageSize") pageSize: Int = 30
    ): Call<NewsApiResponse>

}