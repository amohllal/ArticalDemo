package com.international.data.remote

import com.international.data.model.ArticleResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticleAPI {

    @GET("mostviewed/all-sections/7.json")
    suspend fun getArticle(@Query("api-key") apiKey: String = "lLvTo4AtMsdPG9NcWujZtqJCyHM235QA"): Response<ArticleResponse>

}