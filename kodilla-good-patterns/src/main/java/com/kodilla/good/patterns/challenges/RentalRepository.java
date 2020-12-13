package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface RentalRepository {
    void createRental(String user, LocalDateTime from, LocalDateTime to);
}
