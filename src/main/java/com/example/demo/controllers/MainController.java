package com.example.demo.controllers;

import com.example.demo.clients.Giphy;
import com.example.demo.clients.Openexchangerates;
import com.example.demo.models.GiphyAnswer;
import com.example.demo.models.OpenexchangeratesAnswer;
import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.time.Clock;
import java.time.LocalDate;


@RestController
public class MainController {

    @GetMapping("/")
    public RedirectView index() {
        String app_id = "c04112e4e56044678de406ea8ddc0e3e";
        String api_key = "ZorUI81mQG84g8QLD8fq8w7PoDXn1W1d";
        Openexchangerates openexchangerates = Feign.builder().decoder(new GsonDecoder()).target(Openexchangerates.class, "https://openexchangerates.org");
        Giphy giphy = Feign.builder().decoder(new GsonDecoder()).target(Giphy.class, "https://api.giphy.com");

        String file1 = LocalDate.now(Clock.systemUTC()).minusDays(1) + ".json";
        String file2 = LocalDate.now(Clock.systemUTC()) + ".json";
        OpenexchangeratesAnswer answer1 = openexchangerates.get(file1, app_id);
        OpenexchangeratesAnswer answer2 = openexchangerates.get(file2, app_id);
        double d = answer2.getRates().getRUB() - answer1.getRates().getRUB();

        String tag = d > 0 ? "rich" : "broke";
        GiphyAnswer answer = giphy.get(api_key, tag);
        return new RedirectView(answer.getData().getImages().getOriginal().getUrl());
    }

}
