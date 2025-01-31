public class selectRoom {

    private boolean isAvailable;
    private String roomType;
    private double price;

    public selectRoom(boolean isAvailable, String roomType, double price){
        this.isAvailable=isAvailable;
        this.roomType=roomType;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
