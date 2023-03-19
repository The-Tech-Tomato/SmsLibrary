package com.techtomato.SmsLibrary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SmsLibraryFactory {
    private static final Logger LOG = LoggerFactory.getLogger(SmsLibraryFactory.class);

    private final Map<String, SmsService> SmsServiceMap; // Spring automatically get the bean name as key


    @Autowired
    public SmsLibraryFactory(Map<String,SmsService> SmsServiceMap) {
        this.SmsServiceMap = SmsServiceMap;
    }

    /**
     * factory method to return the right Feature Flag Service Impl
     *
     * @param smsClientName
     *
     * @return
     */
    public SmsService getSmsService(String smsClientName)
    {
        switch (smsClientName){
            case SmsLibraryConstants.SMS_CLIENT_TWILIO:
                return SmsServiceMap.get(SmsLibraryConstants.SMS_CLIENT_TWILIO);
        }
        LOG.warn("Returning Twilio Service as the default");
        return SmsServiceMap.get(SmsLibraryConstants.SMS_CLIENT_TWILIO);
    }

}
