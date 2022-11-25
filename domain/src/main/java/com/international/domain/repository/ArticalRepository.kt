package com.international.domain.repository

import com.international.domain.model.Articals
import kotlinx.coroutines.flow.Flow

interface ArticalRepository {
    suspend fun getArticals(): Flow<Articals>

}