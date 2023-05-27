package com.maheshbabu.springshell.client;

import com.maheshbabu.springshell.commands.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClient {
    @GetExchange("/")
    JokeResponse randomJoke();
}
