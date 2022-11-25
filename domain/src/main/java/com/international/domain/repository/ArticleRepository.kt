package com.international.domain.repository

import com.international.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface ArticleRepository {
    suspend fun getArticle(): Flow<Article>

}