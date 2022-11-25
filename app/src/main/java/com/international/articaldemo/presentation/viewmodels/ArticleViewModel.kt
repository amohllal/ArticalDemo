package com.international.articaldemo.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.international.domain.model.Article
import com.international.domain.usecase.GetArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

@HiltViewModel
open class ArticleViewModel @Inject constructor(
    private val getArticleUseCase: GetArticleUseCase
) : ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>()
    private val _error = MutableLiveData<Throwable?>()

    val loadingLiveData
        get() = _isLoading
    val error
        get() = _error

    private val _articleResult = MutableLiveData<Article>()
    val articleLiveData
        get() = _articleResult

    fun getArticle() {
        viewModelScope.launch {
            getArticleUseCase.invoke()
                .onStart {
                    _isLoading.value = true
                }
                .catch { error ->
                    _isLoading.value = false
                    _error.value = error
                }
                .collect {
                    _isLoading.value = false
                    _articleResult.value = it
                }
        }


    }


}