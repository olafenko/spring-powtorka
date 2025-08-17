package site.justproject.springreturn;

import java.time.Clock;
import java.time.LocalDateTime;

public class DateService {

    private final Clock clock;

    public DateService(Clock clock) {
        this.clock = clock;
    }

    public LocalDateTime now(){
        return LocalDateTime.now(clock);
    }



}
