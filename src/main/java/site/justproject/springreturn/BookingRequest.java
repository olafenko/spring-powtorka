package site.justproject.springreturn;

import java.time.LocalDateTime;

public record BookingRequest(String sourceAddress, String destAddress, String city, LocalDateTime date) {
}
