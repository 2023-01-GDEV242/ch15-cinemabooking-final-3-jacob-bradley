import java.util.*;
/**
 * Write a description of class Theater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Theater {
    // instance variables - replace the example below with your own
    public String theaterName;
    ArrayList<Seat> seats = new ArrayList<Seat>();
    /**
     * Constructor for objects of class Theater
     */
    public Theater(String theaterName, int rows, int columns) {
        this.theaterName = theaterName;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                Seat seat = new Seat(i, j);
                seats.add(seat);
            }
        }
    }
    public void printSeats() {
        int i = seats.size()-1;
        while(i >= 0){
            System.out.println("The Seat Number is: "+seats.get(i).getSeatRow() + ", "+seats.get(i).getSeatCol() );
            i--;
        }
    }
    public String getTheaterName() {
        return theaterName;
    }
}
