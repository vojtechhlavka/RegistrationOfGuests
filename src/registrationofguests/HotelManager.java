package registrationofguests;

import java.util.List;

/**
 * Hotel Manager
 * @author Petr
 */
public interface HotelManager {
    /**
     * Take Guest and Room, and add Guest to room
     * 
     * @param guest guest of hotel
     * @param room room of hotel
     * @return void
     */
    void addGuestToRoom(Guest guest, Room room);
    
    /**
     * Take Guest and Room, and remove the guest from his room
     * 
     * @param guest guest of hotel
     * @param room room of hotel
     * @return void
     */
    void removeGuestFromRoom(Guest guest, Room room);
    
    /**
     * Take the room and find all guests from this room
     * 
     * @param room room of hotel
     * @return List<Guest> List of guests from room
     */
    List<Guest> getGuestsOfRoom(Room room);
    
    /**
     * Take Guest and find room where guest is accommodated
     * 
     * @param guest guest of hotel
     * @return Room room where is guest accommodated
     */
    Room findRoomWithGuest(Guest guest);
}
