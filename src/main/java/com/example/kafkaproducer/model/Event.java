package com.example.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    private String eventName;
        private String email;
    private String createdAt;
    private String eventUpdatedAt;
    private String eventType;
    private DataField dataFields;

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", email='" + email + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", eventUpdatedAt='" + eventUpdatedAt + '\'' +
                ", eventType='" + eventType + '\'' +
                ", dataFields=" + dataFields +
                '}';
    }
}
