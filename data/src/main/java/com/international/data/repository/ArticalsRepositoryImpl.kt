package com.international.data.repository

import com.international.data.remote.ArticalsAPI
import com.international.domain.model.Articals
import com.international.domain.repository.ArticalRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArticalsRepositoryImpl @Inject constructor(
    remoteDataSource : ArticalsAPI
) : ArticalRepository {

    override suspend fun getArticals(): Flow<Articals> {
        TODO("Not yet implemented")
    }
}