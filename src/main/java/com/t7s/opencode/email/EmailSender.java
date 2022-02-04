package com.t7s.opencode.email;

public interface EmailSender {
    void send(String recipient, String email, String subject);
}
