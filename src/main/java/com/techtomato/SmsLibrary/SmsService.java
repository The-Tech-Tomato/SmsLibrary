package com.techtomato.SmsLibrary;

import com.techtomato.SmsLibrary.domain.Sms;
import org.springframework.beans.factory.annotation.Value;

public abstract class SmsService {
    public abstract void sendSms(Sms sms);
}
