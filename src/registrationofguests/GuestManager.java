package hotelmanager;

import java.util.List;

/**
 * Manager of entity Guest
 * @author Petr Domkar & Vojtech Hlavka
 */
public interface GuestManager {

	/**
	 * Creates new guest.
	 * @param Guest given guest
	 */
	void createNewGuest(int Guest);

	/**
	 * Updates information about given guest.
	 * @param Guest given guest
	 */
	void updateGuest(int Guest);

	/**
	 * Deletes given guest.
	 * @param Guest given guest
	 */
	void deleteGuest(int Guest);
        
        /**
         * Finds and returns all guests.
         * @return list of all guests.
         */
	List<Guest> findAllGuests();

	/**
	 * Returns guets with given ID
	 * @param id given ID
         * @return guest with given ID
	 */
	Guest getGuestById(int id);

}