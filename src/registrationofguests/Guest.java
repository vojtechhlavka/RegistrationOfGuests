package registrationofguests;

import java.util.Date;

/**
 * Entita Guest
 * @author Petr
 */
public class Guest {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private Date born;

    public Guest() {
    }
    public Guest(String name, String surname, Gender gender, Date born) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.born = born;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBorn() {
        return born;
    }
    public void setBorn(Date born) {
        this.born = born;
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += 137 + id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Guest)) {
            return false;
        }
        
        Guest other = (Guest) object;
        if (other == null || (this.getId() != other.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Guest [ id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", born=" + born + "  ]";
    }
}

enum Gender {
    MAN, WOMAN;
}
