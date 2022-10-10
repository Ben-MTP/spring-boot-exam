package com.core.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 10/10/2022
 * @project spring-boot-EventListener-Async
 */
@Component
public class MyHouse {

  @Autowired
  ApplicationEventPublisher applicationEventPublisher;

  /**
   * Hành động bấm chuông cửa
   * Phát ra một sự kiện DoorBellEvent
   * source(nguồn phát ra) chính là class này
   * @param guestName
   */
  public void rangDoorbellBy(String guestName){
    applicationEventPublisher.publishEvent(new DoorBellEvent(this, guestName));
  }
}
