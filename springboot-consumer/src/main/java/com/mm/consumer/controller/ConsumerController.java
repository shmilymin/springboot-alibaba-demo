package com.mm.consumer.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.mm.common.utils.R;
import com.mm.consumer.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
