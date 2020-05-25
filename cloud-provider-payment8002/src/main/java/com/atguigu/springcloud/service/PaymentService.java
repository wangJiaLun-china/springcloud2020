package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author wangJiaLun
 * @date 2020-05-24
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
