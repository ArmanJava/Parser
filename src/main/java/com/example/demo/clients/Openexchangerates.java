package com.example.demo.clients;

import com.example.demo.models.OpenexchangeratesAnswer;
import feign.Param;
import feign.RequestLine;


public interface Openexchangerates {

    @RequestLine("GET /api/historical/{file}?app_id={app_id}")
    OpenexchangeratesAnswer get(@Param("file") String file, @Param("app_id") String app_id);

}
