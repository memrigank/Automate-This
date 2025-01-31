import java.time.LocalDate;

public class makeBooking {

    private selectRoom room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isConfirmed;

    public makeBooking(selectRoom room, LocalDate checkInDate, LocalDate checkOutDate, boolean isConfirmed){
        this.room=room;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
        this.isConfirmed=isConfirmed;
    }

    public void confirmBooking(selectRoom room){
        this.isConfirmed=true;
        room.setAvailable(false);
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
