package com.walmart.store.recruiting.ticket.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author haftomtesfay
 *
 */


public class DataAccess {

    private static DataAccess instance;

    private static void initData() {
        seatingArrangements.add(new SeatingArrangementImpl(1, "A", 100, 25, 50));
        seatingArrangements.add(new SeatingArrangementImpl(2, "B", 75, 20, 100));
        seatingArrangements.add(new SeatingArrangementImpl(3, "C", 50, 15, 100));
        seatingArrangements.add(new SeatingArrangementImpl(4, "D", 40, 15, 100));

        int seatId = 1;
        for (SeatingArrangement seatingArrangement : seatingArrangements) {
            int seatNumber = 1;
            for (int i = 0; i < seatingArrangement.getSeatsInRow() * seatingArrangement.getRows(); i++) {
                seats.add(new SeatImpl(seatId++, seatingArrangement.getLevelId(), seatingArrangement.getLevelName().substring(0, 1) + seatNumber++, null));
            }
        }
    }

    private DataAccess() {
    }

    public static DataAccess getInstance() {
        if (instance == null) {
            instance = new DataAccess();
            initData();
        }

        return instance;
    }

    private static List<SeatingArrangement> seatingArrangements = new ArrayList<>();
    private static List<Seat> seats = new ArrayList<>();
    private static List<SeatHold> seatHolds = new ArrayList<>();

    public List<SeatHold> getAllSeatHolds() {
        return seatHolds;
    }

    public List<Seat> getAllSeats() {
        return seats;
    }


}
