package com.international.domain.usecase

import com.international.domain.repository.ArticalRepository
import javax.inject.Inject

class GetArticalsUseCase @Inject constructor(private val articalRepository: ArticalRepository) {

    suspend operator fun invoke() = articalRepository.getArticals()
}