package br.sc.senai.chat.chat.controller.model;

import lombok.*;

@Data
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
