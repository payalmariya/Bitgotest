package com.flipkart.mc;

public class NotificationFactory {


    public static Notifier getNotifier(NotificationType notificationType){

        switch (notificationType){
            case EMAIL : return new EmailNotifier();
        }
        throw new RuntimeException("invalid notifier");


    }
}
