package com.core.eventlistener;

import java.time.Clock;
import org.springframework.context.ApplicationEvent;

/**
 * @author ManhKM on 10/10/2022
 * @project spring-boot-EventListener-Async
 */
public class DoorBellEvent extends ApplicationEvent {

    // Tên của người bấm chuông
    private String guestName;

    public DoorBellEvent(Object source) {
        super(source);
    }

    public DoorBellEvent(Object source, Clock clock) {
        super(source, clock);
    }

    /**
     * Mọi class kế thừa ApplicationEvent sẽ phải gọi Constructor tới lớp cha
     * @param source - là đối tượng tham chiếu tới, nơi phát ra event này
     * @param guestName - tên của khách hàng
     */
    public DoorBellEvent(Object source, String guestName){
        super(source);
        this.guestName = guestName;
    }

    public String getGuestName(){
        return guestName;
    }


}
