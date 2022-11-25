package com.international.domain.model

data class Article(
    val result : List<Result>? = null

)
data class Result(val title: String? = null,
                  val description: String? = null,
                  val date: String? = null,
                  val typedBy: String? = null,
                  val url: String? = null)
