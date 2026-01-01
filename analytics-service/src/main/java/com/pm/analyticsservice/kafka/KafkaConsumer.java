package com.pm.analyticsservice.kafka;

import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import patient.events.PatientEvent;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "patient", groupId = "analytics-service")
    public void consumerEvent(byte[] event){
        try {
            PatientEvent patientEvent = PatientEvent.parseFrom(event);


            log.info("Received event: {}", patientEvent);
        } catch (InvalidProtocolBufferException e) {
            log.error("Error deserializing event{}",e.getMessage());
        }
    }
}
