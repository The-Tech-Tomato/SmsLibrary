package com.techtomato.SmsLibrary.Twilio.service.impl;

import com.techtomato.SmsLibrary.SmsLibraryConstants;
import com.techtomato.SmsLibrary.SmsService;
import com.techtomato.SmsLibrary.Twilio.service.TwilioService;
import com.techtomato.SmsLibrary.domain.Sms;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(SmsLibraryConstants.SMS_CLIENT_TWILIO)
public class SmsServiceImpl extends TwilioService {
    private static Logger LOG = LoggerFactory.getLogger(SmsServiceImpl.class);

    @Value("${SmsLibrary.TWILIO_ACCOUNT_SID}")
    private String TWILIO_ACCOUNT_SID;

    @Value("${SmsLibrary.TWILIO_AUTH_TOKEN}")
    private String TWILIO_AUTH_TOKEN;

    @Override
    public void sendSms(Sms sms) {
        String to = sms.getTo();
        String body = sms.getMessage();
        String from = sms.getFrom();
        LOG.info("Sending SMS from {} to {} with body \"{}\"", from, to, body);
        LOG.info("Initializing twilio: ");
        Twilio.init(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(to), new PhoneNumber(from), body).create();
    }
}
