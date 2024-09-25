package org.example.controller;

import org.example.enums.NotificationType;
import org.example.model.CryptoInfo;
import org.example.model.Notification;
import org.example.service.NotificationService;

import java.util.List;


public class NotificationController {



    public Notification sentNotification(Notification notification){
        NotificationService notificationService = new NotificationService();
        return notificationService.sentNotification(notification);
    }
    public void deleteNotification(int id){
        NotificationService notificationService = new NotificationService();
        notificationService.deleteNotification(id);
    }

    public List<Notification> listNotification(){
        NotificationService notificationService = new NotificationService();
        return notificationService.listAllNotification();
    }


}
