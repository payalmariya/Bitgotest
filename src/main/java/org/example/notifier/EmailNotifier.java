package org.example.notifier;

import org.example.enums.NotificationStatus;
import org.example.model.Notification;

import java.util.Date;

public class EmailNotifier implements  Notifier{


    @Override
    public Notification sentNotification(Notification notification) {
        try{
            System.out.println("sending email notification");
            //SENT NOTIFICATION
            System.out.println("Email notification sent");
            notification.setNotificationStatus(NotificationStatus.SENT);
            notification.setSendTime(new Date());
        }catch(Exception e){
            notification.setNotificationStatus(NotificationStatus.FAILED);
        }
        return notification;
    }



}

