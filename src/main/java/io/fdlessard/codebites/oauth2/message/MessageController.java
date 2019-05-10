package io.fdlessard.codebites.oauth2.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

    @GetMapping(value = "/message")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Message getMessage() {

        log.info("MessageController.getMessage()");
        return new Message("Hello world - from SpringBootOAuth2MessageApplication");
    }
}
