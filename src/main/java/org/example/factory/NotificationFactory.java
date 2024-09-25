package org.example.factory;


import org.example.enums.NotificationType;
import org.example.notifier.EmailNotifier;
import org.example.notifier.Notifier;

public class NotificationFactory {


    public static Notifier getNotifier(NotificationType notificationType){

        switch (notificationType){
            case EMAIL : return new EmailNotifier();
        }
        throw new RuntimeException("invalid notifier");


    }
}

