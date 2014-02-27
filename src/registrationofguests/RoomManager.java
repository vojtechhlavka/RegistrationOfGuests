package registrationofguests;

import java.util.List;

/**
 * Manager for Room
 * @author Petr
 */
public interface RoomManager {
    /**
     * Create new Room in DTB
     * 
     * @param room room in hotel
     * @return Room The created room
     */
    void createRoom(Room room);
    
    /**
     * Remove Room from hotel
     * 
     * @param room room in hotel
     * @return void
     */
    void removeRoom(Room room);
    
    /**
     * Find and return room by id
     * 
     * @param id id of Room
     * @return Room The room with id
     */
    Room findRoomById(int id);
    
    /**
     * Find all Room in hotel
     * 
     * @return List<Room> List of rooms from hotel
     */
    List<Room> findAllRoom();
    
    /**
     * Update room in hotel(dtb)
     * 
     * @param room room in hotel
     * @return Room The updated room
     */
    Room updateRoom(Room room);
    
    /**
     * Find and return all free room(room where is people < capacity
     * 
     * @return List<Room> List of all free room
     */
    List<Room> getFreeRooms();
}
