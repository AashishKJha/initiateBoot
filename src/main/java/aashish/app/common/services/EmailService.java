package aashish.app.common.services;

public interface EmailService extends service {
    void sendSimpleMessage(String from, String to, String subject, String text);
}
