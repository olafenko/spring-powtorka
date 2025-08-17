package site.justproject.springreturn;

public class BookDateValidator {


    private final DateService dateService;

    public BookDateValidator(DateService dateService) {
        this.dateService = dateService;
    }

    public  String validateBookDate(BookingRequest request) {

        if(request.date().isBefore(dateService.now())){
            return "Failed";
        }

        return "Success";
    }



}

