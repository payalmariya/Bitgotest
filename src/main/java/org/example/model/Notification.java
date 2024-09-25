package org.example.model;



import org.example.enums.NotificationStatus;
import org.example.enums.NotificationType;

import java.util.Date;

public class Notification {

    private Integer id;
    private NotificationStatus notificationStatus;
    private String fromAddress;
    private String toAddress;
    private CryptoInfo cryptoInfo;
    private Date sendTime;
    private NotificationType notificationType;
    private Date receivedTime;

    public Notification(int id,String fromAddress, String toAddress, CryptoInfo cryptoInfo, NotificationType notificationType) {
        this.id = id;
        this.notificationStatus = NotificationStatus.OUTSTANDING;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.cryptoInfo = cryptoInfo;
        this.notificationType = notificationType;
        this.receivedTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public CryptoInfo getCryptoInfo() {
        return cryptoInfo;
    }

    public void setCryptoInfo(CryptoInfo cryptoInfo) {
        this.cryptoInfo = cryptoInfo;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }
}
