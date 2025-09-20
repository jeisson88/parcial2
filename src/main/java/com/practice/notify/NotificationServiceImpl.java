package com.practice.notify;

public class NotificationServiceImpl implements INotificationService {
    @Override
    public boolean send(String userId, String message) {
        if (message == null || message.isBlank()) return false;
        // Simulación de envío
        return true;
    }
}
