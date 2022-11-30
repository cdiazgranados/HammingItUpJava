package src.main.zipcode;

public class Hamming {
    String s;
    String s1;

    public Hamming(String s, String s1) { //put the throw in the constructor
        if (!(s.length() == s1.length())) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            this.s = s;
            this.s1 = s1;
        }
    }

    public int getHammingDistance() {

        int count = 0;
        String[] sArray = s.split("");
        String[] s1Array = s1.split("");
        for (int i = 0; i < s.length(); i++) {
            if (!sArray[i].equals(s1Array[i])) {
                count++;
            }
        }
        return count;
    }

}
