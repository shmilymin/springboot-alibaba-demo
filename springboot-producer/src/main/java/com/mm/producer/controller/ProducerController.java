package com.mm.producer.controller;

import com.mm.common.entity.UserEntity;
import com.mm.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
        return R.ok("hehe").put("user", user);

    }
}
