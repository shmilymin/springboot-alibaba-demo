package com.mm.consumer.service;

import com.mm.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "producer")
public interface ProducerService {

    @GetMapping("/producer/get/{id}")
    R get(@PathVariable("id") Long id);

}
