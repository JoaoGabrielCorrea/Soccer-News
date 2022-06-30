package com.example.soccernews.data.local;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import com.example.soccernews.domain.News;


@Dao
public interface NewsDao {

    List<News> loadFavoritenews(boolean favorite);
}
