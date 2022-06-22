package com.example.emos.api.config.tencent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SmsUtil {
    @Value("${tencent.sms.sdkAppId}")
    private  String sdkAppId;
    @Value("${tencent.sms.signName}")
    private String signName;
}
