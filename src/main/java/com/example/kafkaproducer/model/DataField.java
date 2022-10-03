package com.example.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataField {
    private String sr_order_id;
    private String retailer_name;
    private String sr_estimated_delivered_date;
    private String email;
    private String edd_met;
    private String shipment_status;
    private String retailer_order_id;
    private String number_of_sr_items;
    private String order_date;
    private String courier_estimated_delivery_date;
    private String event_message;
    private String tracking_number;
    private String retailer_code;
    private String return_shipment;
    private String courier_name;
    private String member_id;



    @Override
    public String toString() {
        return "DataField{" +
                "sr_order_id='" + sr_order_id + '\'' +
                ", retailer_name='" + retailer_name + '\'' +
                ", sr_estimated_delivered_date='" + sr_estimated_delivered_date + '\'' +
                ", email='" + email + '\'' +
                ", edd_met='" + edd_met + '\'' +
                ", shipment_status='" + shipment_status + '\'' +
                ", retailer_order_id='" + retailer_order_id + '\'' +
                ", number_of_sr_items='" + number_of_sr_items + '\'' +
                ", order_date='" + order_date + '\'' +
                ", courier_estimated_delivery_date='" + courier_estimated_delivery_date + '\'' +
                ", event_message='" + event_message + '\'' +
                ", tracking_number='" + tracking_number + '\'' +
                ", retailer_code='" + retailer_code + '\'' +
                ", return_shipment='" + return_shipment + '\'' +
                ", courier_name='" + courier_name + '\'' +
                ", member_id='" + member_id + '\'' +
                '}';
    }
}
