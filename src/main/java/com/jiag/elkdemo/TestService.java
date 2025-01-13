package com.jiag.elkdemo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TestService {
    public String getDataTest(String id){
        switch (id) {
            case "1":
                String ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
                String ipv4 = "80.130.80.50";
                String timestamp = "13/Jan/2025:14:35:29 +0000";
                String verb = "GET";
                String request = "/api/v1/users";
                String httpversion = "1.1";
                int response = 200;

                String logMessage = String.format("%s:%s - - [%s] \"%s %s HTTP/%s\" %d",
                        ipv6, ipv4, timestamp, verb, request, httpversion, response);
                log.info(logMessage);
                return "Request test 1";
            case "2":
                String ipv6_v2 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
                String ipv4_v2 = "80.130.80.50";
                String timestamp_v2 = "13/Jan/2025:14:35:29 +0000";
                String verb_v2 = "GET";
                String request_v2 = "/api/v1/users";
                String httpversion_v2= "1.1";
                int response_v2 = 200;

                String logMessage_v2 = String.format("%s:%s - - [%s] \"%s %s HTTP/%s\" %d",
                        ipv6_v2, ipv4_v2, timestamp_v2, verb_v2, request_v2, httpversion_v2, response_v2);
                log.info(logMessage_v2);
                return "Request test 2";
            default:
                return "Unknown";
        }
    }
}
