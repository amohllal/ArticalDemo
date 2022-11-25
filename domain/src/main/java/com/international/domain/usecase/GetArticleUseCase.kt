package com.international.domain.usecase

import com.international.domain.repository.ArticleRepository
import javax.inject.Inject

class GetArticleUseCase @Inject constructor(private val articleRepository: ArticleRepository) {

    suspend operator fun invoke() = articleRepository.getArticle()
}