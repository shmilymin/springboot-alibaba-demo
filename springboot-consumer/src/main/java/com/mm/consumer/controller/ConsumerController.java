package com.mm.consumer.controller;

import com.mm.common.entity.UserEntity;
import com.mm.common.utils.R;
import com.mm.consumer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/get/{id}")
    public R get(@PathVariable("id") Long id) {
        log.debug("get id:{}", id);
        return producerService.get(id);
    }

    @PostMapping("/post")
    public R post(@RequestBody UserEntity user) {
        log.debug("post user:{}", user);
        return producerService.post(user);
    }

}
