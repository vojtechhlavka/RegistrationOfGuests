package registrationofguests;

import java.util.List;

/**
 * Guest Manager
 * @author Petr
 */
public interface GuestManager {
    /**
     * Create new Guest in DTB
     * 
     * @param guest guest of hotel
     * @return Guest The created guest
     */
    void createGuest(Guest guest);
    
    /**
     * Delete Guest from DTB
     * 
     * @param guest guest of hotel
     * @return void
     */
    void deleteGuest(Guest guest);
    
    /**
     * Find Guest from hotel(dtb) by Id
     * 
     * @param id id of guest
     * @return Guest The guest with id
     */
    Guest findGuestById(int id);
    
    /**
     * Find and return all guests of hotel
     * 
     * @return List<Guest> List of all guests
     */
    List<Guest> findAllGuests();
    
    /**
     * Update guest in dtb
     * 
     * @param guest guest of hotel
     * @return Guest The updated guest
     */
    Guest updateGuest(Guest guest);    
}
