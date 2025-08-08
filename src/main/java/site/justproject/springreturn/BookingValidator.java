package site.justproject.springreturn;

import java.time.LocalDateTime;

public class BookingValidator {


    public String validateBooking(BookingRequest request){

        return validateBookDate(request);

    }

    private static String validateBookDate(BookingRequest request) {
        if(request.date().isBefore(LocalDateTime.now())){
            return "Failed";
        }

        return "Success";
    }

}
