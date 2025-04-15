public class Solution {

    public static boolean validatePin(String pin) {
        // Your code here...
        if (pin.length() != 4 && pin.length() != 6)
            return false;
        if(pin.toLowerCase().matches("[0-9]+"))
            return true;
        return false;
    }

}