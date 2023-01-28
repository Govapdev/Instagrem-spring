package com.govapdev.instagrem.configsocket;

public enum WebSocketEventName {
    SUBSCRIBE(""),
    CONNECT("/auth/login"),
    DISCONNECT("/auth/logout-all"),
    MESSAGE("");

    private String destination;

    WebSocketEventName(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }
}
