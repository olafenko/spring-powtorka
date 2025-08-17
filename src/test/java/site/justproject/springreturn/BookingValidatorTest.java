package site.justproject.springreturn;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookingValidatorTest {

    @Test
    void should_return_success_validation_when_user_gave_correct_request() {

        //given
        BookingValidator testValidator = new BookingValidator(new BookDateValidator(new DateService(Clock.systemUTC())));

        LocalDateTime bookDate = LocalDateTime.now().plusDays(1);
        BookingRequest testRequest = new BookingRequest("Sucharskiego", "Konarskiego", "Ropczyce",bookDate);

        //when
        String result = testValidator.validateBooking(testRequest);

        //then
        assertThat(result).isEqualTo("Success");

    }

    @Test
    void should_return_failed_validation_when_user_gave_incorrect_date() {

        //given
        BookingValidator testValidator = new BookingValidator(new BookDateValidator(new DateService(Clock.systemUTC())));

        LocalDateTime bookDate = LocalDateTime.now().minusDays(1);
        BookingRequest testRequest = new BookingRequest("Sucharskiego", "Konarskiego", "Ropczyce",bookDate);

        //when
        String result = testValidator.validateBooking(testRequest);

        //then
        assertThat(result).isEqualTo("Failed");

    }


}