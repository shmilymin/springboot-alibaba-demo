package com.mm.producer.controller;

import com.mm.common.entity.UserEntity;
import com.mm.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Slf4j
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/get/{id}")
    public R get(@PathVariable("id") Long id) {
        log.debug("get id:{}", id);
        return R.ok("haha").put("id", id);

    }

    @PostMapping("/post")
    public R post(@RequestBody UserEntity user) {
        log.debug("post user:{}", user);
        if (user.getTime() == null) {
            user.setTime(LocalTime.now());
        }
        if (user.getDate() == null) {
            user.setDate(LocalDate.now());
        }
        if (user.getDataTime() == null) {
            user.setDataTime(LocalDateTime.now());
        }
        return R.ok("hehe").put("user", user);

    }
}
