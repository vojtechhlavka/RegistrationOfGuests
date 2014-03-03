package hotelmanager;

import java.util.List;

/**
 * Manager of entity Room
 * @author Petr Domkar & Vojtech Hlavka
 */
public interface RoomManager {

	/**
	 * Creates new Room.
	 * @param Room given room
	 */
	void createNewRoom(int Room);

	/**
	 * Updates information about given room.
	 * @param Room given room.
	 */
	void updateRoom(int Room);

	/**
	 * Deletes given room.
	 * @param Room given room
	 */
	void deleteRoom(int Room);
        
        /**
         * Finds and returns all rooms.
         * @return list of all rooms
         */
	List<Room> findAllRooms();

	/**
	 * Returns room with given ID
	 * @param id given ID
         * @return room with given ID
	 */
	Room getRoomById(int id);

}