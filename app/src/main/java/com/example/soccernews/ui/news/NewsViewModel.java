package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News( "Desfalque Importante" ,  "Simply dummy text of the printing and typesetting industry. " ));
        news.add(new News( "Mulher no Futebol" ,  "Simply dummy text of the printing and typesetting industry. " ));
        news.add(new News( "O futebol e a Superação Feminina" ,  "Simply dummy text of the printing and typesetting industry. " ));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}