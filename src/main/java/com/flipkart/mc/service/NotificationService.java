package com.flipkart.mc.service;

import com.flipkart.mc.NotificationFactory;
import com.flipkart.mc.NotificationStatus;
import com.flipkart.mc.Notifier;
import com.flipkart.mc.model.Notification;

import java.util.*;

public class NotificationService {

    List<Notification> notificationList = new ArrayList<>();
    Map<NotificationStatus,List<Notification>> notificationStatusListMap = new HashMap();
    Map<Integer,Notification> notificationIdListMap = new HashMap();

    public Notification sentNotification(Notification notification){
        if(!isValidEmailAddress(notification.getFromAddress())){
            throw new RuntimeException("Invalid from email address");
        }
        if(!isValidEmailAddress(notification.getToAddress())){
            throw new RuntimeException("Invalid to email address");
        }
        Notifier notifier = NotificationFactory.getNotifier(notification.getNotificationType());
        Notification notificationSend = notifier.sentNotification(notification);
        notificationList.add(notificationSend);
        return notification;
    }

    private boolean isValidEmailAddress(String fromAddress) {
        return  true;
    }

    public Notification deleteNotification(int id){
        Notification notification = notificationIdListMap.get(id);
        notificationIdListMap.remove(id);
        notificationList.removeIf(notificationList -> notificationList.getId() == id);
        return notification;
    }

    public List<Notification> listAllNotification(){
        return notificationList;
    }

    public List<Notification> listAllNotificationbyStatus(NotificationStatus notificationStatus){
        return notificationStatusListMap.get(notificationStatus);
    }

}
