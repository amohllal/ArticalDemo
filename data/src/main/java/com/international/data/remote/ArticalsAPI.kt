package com.international.data.remote

import com.international.data.model.ArticalResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticalsAPI {

    @GET("mostviewed/all-sections/7.json")
    suspend fun getArticals(@Query("api-key") apiKey: String = "lLvTo4AtMsdPG9NcWujZtqJCyHM235QA"): Response<ArticalResponse>

}