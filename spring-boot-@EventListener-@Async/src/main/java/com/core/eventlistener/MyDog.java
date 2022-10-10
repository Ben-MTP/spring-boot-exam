package com.core.eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 10/10/2022
 * @project spring-boot-EventListener-Async
 */
@Component
public class MyDog {

  /**
   * Annotation: @EventListener gắn trên method với tham số đầu vào chính là sự kiện lắng nghe
   * @param doorBellEvent
   * @throws InterruptedException
   */
  @Async
  @EventListener
  public void doorBellEventListener(DoorBellEvent doorBellEvent) throws InterruptedException {
    // Giả sư con dog đang ngủ, 1 giây sau mới dậy
    Thread.sleep(1000);

    // Sự kiện DoorBellEvent được lắng nghe và xử lý tại đây
    System.out.println(Thread.currentThread().getName() + ": Chó ngủ dậy!!!");
    System.out.println(String.format("%s: Go go!! Có người tên là %s gõ cửa", Thread.currentThread().getName(), doorBellEvent.getGuestName()));
  }
}
