package com.example.demo.clients;

import com.example.demo.models.GiphyAnswer;
import feign.Param;
import feign.RequestLine;


public interface Giphy {

    @RequestLine("GET /v1/gifs/random?api_key={api_key}&tag={tag}&rating=g")
    GiphyAnswer get(@Param("api_key") String api_key, @Param("tag") String tag);

}
