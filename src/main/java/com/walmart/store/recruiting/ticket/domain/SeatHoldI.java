/**
 * 
 */
package com.walmart.store.recruiting.ticket.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author haftomtesfay
 *
 */

public interface SeatHoldI {
    
    Optional<LocalDateTime> getHeldOn();

    Optional<LocalDateTime> getResearvedOn();

    int getSeatHoldId();

    void setSeatHoldId(int seatHoldId);
    
    String getCustomerEmail();
    
    void addSeats(List<Seat> seats);

    public void researve();
    
    String getResearvationCode();
}

