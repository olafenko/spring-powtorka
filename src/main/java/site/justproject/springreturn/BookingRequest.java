package site.justproject.springreturn;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record BookingRequest(String sourceAddress, String destAddress, String city, LocalDateTime date) {
}
