/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * Add a Drivable Item to the drivable_map if it's Id does not already appear in drivable_map.
     * @param Id        The Id of the item
     * @param item
     * @return true iff the item is added to drivable_map
     */
    public boolean addDrivable (String Id, Drivable item) {
        if (!drivable_map.containsKey(Id)) {
            drivable_map.put(Id, item);
            return true;
        }
        return false;
    }



    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Check to see if there is an item in  drivable_map has a max speed faster than or equal to the given speed
     * @param speed
     * @return True iff there is an item drivable_map whose max speed is greater than or equal to the given speed.
     */
    public boolean hasFasterThan (int speed) {
        for (String key: drivable_map.keySet()) {
            if ( drivable_map.get(key).getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }




    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * Return a list of all items in drivable_map that are Tradable.
     * @return a list of all items in drivable_map that are Tradable.
     */
    public List<Tradable> getTradable() {
       List<Tradable> tradableList = new ArrayList<Tradable>();
       for (String key: drivable_map.keySet()) {
           if ( drivable_map.get(key) instanceof Tradable) {
               Tradable tradableItem = (Tradable) drivable_map.get(key);
              tradableList.add(tradableItem);

           }
       }
        return tradableList;
    }


    
}