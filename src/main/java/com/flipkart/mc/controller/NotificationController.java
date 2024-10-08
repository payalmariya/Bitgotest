package com.flipkart.mc.controller;

import com.flipkart.mc.CryptoInfo;
import com.flipkart.mc.NotificationType;
import com.flipkart.mc.model.Notification;
import com.flipkart.mc.service.NotificationService;

public class NotificationController {

    //INCASE DB , THIS ID WILL BE AUTOGENERATED
    int id = 1;

    public void sentNotification(){
        NotificationService notificationService = new NotificationService();
        CryptoInfo cryptoInfo = new CryptoInfo(1,2.0,2.0,3.0,4.0);
        Notification notification = new Notification(id++,"payalmariya02@gmail.com","anu@gmail.com",cryptoInfo, NotificationType.EMAIL);
        notificationService.sentNotification(notification);
    }
    public void deleteNotification(int id){
        NotificationService notificationService = new NotificationService();
        notificationService.deleteNotification(id);
    }

    public void listNotification(){
        NotificationService notificationService = new NotificationService();
        notificationService.listAllNotification();
    }


}
