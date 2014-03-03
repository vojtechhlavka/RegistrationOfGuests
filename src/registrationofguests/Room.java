package registrationofguests;

/**
 * Entita Room
 * @author Petr
 *
 * Poznámka: Funguje to!!
 */
public class Room {
    private int id; //Final?
    private int capacity;
    private String quality;
    private int floor;
    private int number;

    public Room() {
    }
    public Room(int capacity, String quality, int floor, int number) {
        this.capacity = capacity;
        this.quality = quality;
        this.floor = floor;
        this.number = number;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getQuality() {
        return quality;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    public boolean isEmpty() {
        return true; //dodelat
    }
    public boolean isFull() {
        return true; //dodelat
    }
    
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += 137 + id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Room)) {
            return false;
        }
        
        Room other = (Room) object;
        if (other == null || (this.getId() != other.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Room [ id=" + id + ", capacity=" + capacity + ", quality=" + quality + ", floor=" + floor + ", number=" + number + "  ]";
    }
}