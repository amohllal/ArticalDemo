package com.international.data.repository

import com.international.data.mapper.mapToDomain
import com.international.data.remote.ArticleAPI
import com.international.domain.model.Article
import com.international.domain.repository.ArticleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ArticleRepositoryImpl @Inject constructor(
    private val remoteDataSource : ArticleAPI
) : ArticleRepository {

    override suspend fun getArticle(): Flow<Article> {
        return flow {
               val response =  remoteDataSource.getArticle()
            if (response.isSuccessful){
                response.body().let {
                    emit(it?.mapToDomain()!!)
                }
            }
        }
    }
}