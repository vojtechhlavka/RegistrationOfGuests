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
	public void createNewGuest(int Guest);

	/**
	 * Updates information about given guest.
	 * @param Guest given guest
	 */
	public void updateGuest(int Guest);

	/**
	 * Deletes given guest.
	 * @param Guest given guest
	 */
	public void deleteGuest(int Guest);
        
        /**
         * Finds and returns all guests.
         * @return list of all guests.
         */
	public List<Guest> findAllGuests();

	/**
	 * Returns guets with given ID
	 * @param id given ID
         * @return guest with given ID
	 */
	public Guest getGuestById(int id);
}