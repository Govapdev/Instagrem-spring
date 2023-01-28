package com.govapdev.instagrem.configsocket;

import com.govapdev.instagrem.service.serviceImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class WebSocketEventListener {
    private final UserService userService;
    private final SimpMessagingTemplate template;

    @Autowired
    public WebSocketEventListener(UserService userService, SimpMessagingTemplate template) {
        this.userService = userService;
        this.template = template;
    }
}
