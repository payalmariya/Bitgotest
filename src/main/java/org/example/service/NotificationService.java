package org.example.service;


import org.example.enums.NotificationStatus;
import org.example.factory.NotificationFactory;
import org.example.model.Notification;
import org.example.notifier.Notifier;

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
        notificationIdListMap.put(notificationSend.getId(),notificationSend);

        List<Notification> notificationList = notificationStatusListMap.getOrDefault(notificationSend.getNotificationStatus(),new ArrayList<Notification>());
        notificationList.add(notificationSend);
        notificationStatusListMap.put(notificationSend.getNotificationStatus(),notificationList);
        return notification;
    }

    private boolean isValidEmailAddress(String fromAddress) {
        return  true;
    }

    public Notification deleteNotification(int id){
        //we can also create this id vs notification map on demand as well from notificationList
        Notification notification = notificationIdListMap.get(id);
        notificationIdListMap.remove(id);
        notificationList.removeIf(notificationList -> notificationList.getId() == id);
        return notification;
    }

    public List<Notification> listAllNotification(){
        return notificationList;
    }

    public List<Notification> listAllNotificationbyStatus(NotificationStatus notificationStatus){
        //we can also create this status vs notification list map on demand as well from notificationList
        return notificationStatusListMap.get(notificationStatus);
    }

}
