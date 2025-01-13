package com.jiag.elkdemo;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TestController {

    TestService testService;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id) {
        return testService.getDataTest(id);
    }


}
