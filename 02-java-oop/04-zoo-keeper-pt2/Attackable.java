// TRAVIS JEPSON SEPT 2021
// THIS IS AN INTERFACE

// CONNECTS TO THE MAMAL CLASS
public interface Attackable
{
    // IF THE METHOD HAS THIS SIGNATURE IT ALLOWS IT TO BE ATTACKABLE
    // the interface is taking the entry points and it checks files in the same directory

    int getHealth();
    void setHealth(int health);  // THIS MUST MATCH

    void takeDamage(int damageAmount);

}