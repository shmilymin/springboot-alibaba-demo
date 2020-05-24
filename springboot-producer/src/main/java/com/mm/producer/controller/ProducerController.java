package com.mm.producer.controller;

import com.mm.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/get/{id}")
    public R get(@PathVariable("id") Long id) {
        log.debug("get id:{}", id);
        return R.ok("haha").put("id", id);

    }
}
