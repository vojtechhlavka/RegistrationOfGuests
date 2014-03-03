package hotelmanager;

import java.util.List;

/**
 * Main manager of hotel
 * @author Petr Domkar & Vojtech Hlavka
 */
public interface HotelManager {

	/**
	 * Accommodates given guest into given room.
	 * @param Guest given guest
	 * @param Room give room
	 */
	public void accommodateGuestInRoom(int Guest, int Room);

	/**
	 * Removes given guest from given room.
	 * @param Guest given guest
	 * @param Room given room
	 */
	public void removeGuestFromRoom(int Guest, int Room);

	/**
	 * Shows number of room, floor, capacity and guests accomodated in given room.
	 * @param Room given room
	 */
	public void showInformationAboutRoom(int Room);
        
        /**
         * Finds and returns all free rooms in hotel.
         * @return list of free rooms
         */
	public List<Room> findAllFreeRooms();

}