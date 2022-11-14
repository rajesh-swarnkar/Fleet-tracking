package com.acme.fleetTracking.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.acme.fleetTracking.constants.AppConstants;

@Service
public class GeoLocationProducerService
{
    private static final Logger logger =
            LoggerFactory.getLogger(GeoLocationProducerService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void sendMessage(String message)
    {
        logger.info(String.format("Message sent -> %s", message));
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}