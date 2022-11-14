package com.acme.fleetTracking.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.acme.fleetTracking.constants.AppConstants;
import com.acme.fleetTracking.service.NotifyService;
@Service
public class GeoLocationConsumerService
{
    private final Logger logger =
            LoggerFactory.getLogger(GeoLocationConsumerService.class);
    
    @Autowired
    private NotifyService notifyService;
    
    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(String message)
    {
        logger.info(String.format("Message recieved -&gt; %s", message));
        if(notifyService.checkDeviation(message))
        	logger.info(message+" truck has been deviated!");
        else
        	logger.info(message+" truck is on time!");
        //on msg recive check for deviation
        
    }
}