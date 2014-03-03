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
	public void createNewRoom(int Room);

	/**
	 * Updates information about given room.
	 * @param Room given room.
	 */
	public void updateRoom(int Room);

	/**
	 * Deletes given room.
	 * @param Room given room
	 */
	public void deleteRoom(int Room);
        
        /**
         * Finds and returns all rooms.
         * @return list of all rooms
         */
	public List<Room> findAllRooms();

	/**
	 * Returns room with given ID
	 * @param id given ID
         * @return room with given ID
	 */
	public Room getRoomById(int id);
}