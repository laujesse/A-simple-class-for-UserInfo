
/**
 * Write a description of class UserInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInfo
{
    private String name;
    private int staff_id;
    private String date_of_birth;
    
    public UserInfo()
    {
        name = "Jesse";
        staff_id = 170717;
        date_of_birth = "7/28/1999";
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public int get_staff_id()
    {
        return this.staff_id;
    }
    public void set_staff_id(int new_staff_id)
    {
        this.staff_id = new_staff_id;
    }
    public String get_date_of_birth()
    {
        return this.date_of_birth;
    }
    public void set_date_of_birth(String new_date_of_birth)
    {
        this.date_of_birth = new_date_of_birth;
    }
    
}
