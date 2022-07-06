package com.axess.smartbankapi.ses;

import lombok.Data;

@Data
public class Email {

  String from;

  String to;

  String subject;

  String body;

  public Email(String from, String to, String subject, String body) {
    this.from = from;
    this.to = to;
    this.subject = subject;
    this.body = body;
  }

  
}