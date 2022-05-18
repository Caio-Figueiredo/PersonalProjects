package entities;

public class Room {

    private int roomNbr;
    public String clientName;
    private String clientEmail;

    public Room(String clientName, String clientEmail){
        this.clientName = clientName;
        this.clientEmail = clientEmail;
    }

    public Room(int roomNbr, String clientName, String clientEmail){
        this.roomNbr = roomNbr;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
    }

    public int getRoomNbr() {
        return roomNbr;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String toString(){
        return roomNbr +
                ": " +
                clientName +
                ", " +
                clientEmail;
    }
}
