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

public class SeatHoldImpl implements SeatHoldI {

    public SeatHoldImpl(String customerEmail) {
        this.customerEmail = customerEmail;
        this.heldOn = Optional.of(LocalDateTime.now());
    }

    private int seatHoldId;
    private Optional<LocalDateTime> heldOn;
    private Optional<LocalDateTime> researvedOn;
    private String researvationCode;
    private String customerEmail;

    @Override
    public String getResearvationCode() {
        return researvationCode;
    }

    @Override
    public void researve() {
        this.researvedOn = Optional.of(LocalDateTime.now());
        this.researvationCode = "" + this.researvedOn.get().getYear() + this.researvedOn.get().getMonth() + this.researvedOn.get().getDayOfMonth()
                + this.researvedOn.get().getHour() + this.researvedOn.get().getMinute() + this.researvedOn.get().getSecond() + 
                this.researvedOn.get().getNano();
    }

    @Override
    public int getSeatHoldId() {
        return seatHoldId;
    }

    @Override
    public Optional<LocalDateTime> getHeldOn() {
        return heldOn;
    }

    @Override
    public Optional<LocalDateTime> getResearvedOn() {
        return researvedOn;
    }

    @Override
    public String getCustomerEmail() {
        return customerEmail;
    }

    @Override
    public void addSeats(List<Seat> seats) {
        seats.stream().forEach(s -> s.setSeatHold(this));
    }

    @Override
    public void setSeatHoldId(int seatHoldId) {
        this.seatHoldId = seatHoldId;
    }
}
