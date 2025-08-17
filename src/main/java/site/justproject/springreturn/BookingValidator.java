package site.justproject.springreturn;

public class BookingValidator {


    private final BookDateValidator bookDateValidator;


    public BookingValidator(BookDateValidator bookDateValidator) {
        this.bookDateValidator = bookDateValidator;
    }

    public String validateBooking(BookingRequest request){

        String dateValidateResult = bookDateValidator.validateBookDate(request);


        return dateValidateResult;

    }


}
