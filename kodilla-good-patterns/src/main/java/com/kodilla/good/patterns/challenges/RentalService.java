package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(String user, LocalDateTime from, LocalDateTime to);
}
