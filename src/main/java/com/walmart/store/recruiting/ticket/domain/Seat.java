/**
 * 
 */
package com.walmart.store.recruiting.ticket.domain;

/**
 * @author haftomtesfay
 *
 */

public interface Seat {
    
    SeatHold getSeatHold();

    void setSeatHold(SeatHoldImpl seatHoldImpl);
    
    int getSeatId();

    void setSeatId(int seatId);

    String getSeatNumber();

    void setSeatNumber(String seatNumber);

    int getLevelId();

    void setLevelId(int levelId);

	/**
	 * @param seatHold
	 */
	void setSeatHold(SeatHold seatHold);

    
}
