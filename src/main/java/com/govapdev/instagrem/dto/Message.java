package com.govapdev.instagrem.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String message;
    private String receiverName;
    private String date;
    private Status status;
}
