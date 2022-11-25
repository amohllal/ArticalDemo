package com.international.data.mapper

import com.international.data.model.ArticleResponse
import com.international.domain.model.Article
import com.international.domain.model.Result


fun ArticleResponse.mapToDomain() = Article(result = this.results?.map {
    Result(title = it?.title, description = it?.jsonMemberAbstract, date = it?.publishedDate, typedBy = it?.source, url = it?.url)
})



