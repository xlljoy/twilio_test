package com.example.demo;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilaInitializer {

    private final TwilioConfiguration twilioConfiguration;
    private final static Logger LOGGER = LoggerFactory.getLogger(TwilaInitializer.class);

    @Autowired
    public TwilaInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken());
        LOGGER.info("Twilio initialized ... with accound sid {}", twilioConfiguration.getAccountSid());
    }
}
