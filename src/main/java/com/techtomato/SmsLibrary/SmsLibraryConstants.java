package com.techtomato.SmsLibrary;

import org.springframework.stereotype.Component;

@Component
public interface SmsLibraryConstants {
    public static String SMS_CLIENT_TWILIO = "twilio";
    public static String SMS_CLIENT_INFOBIP = "infobip";
}
