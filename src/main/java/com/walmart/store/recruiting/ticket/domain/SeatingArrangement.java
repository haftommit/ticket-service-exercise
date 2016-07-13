/**
 * 
 */
package com.walmart.store.recruiting.ticket.domain;

/**
 * @author haftomtesfay
 *
 */

public interface SeatingArrangement {

    int getLevelId();

    String getLevelName();

    double getPrice();

    int getRows();

    int getSeatsInRow();

    void setLevelId(int levelId);

    void setLevelName(String levelName);

    void setPrice(double price);

    void setRows(int rows);

    void setSeatsInRow(int seatsInRow);
    
}
