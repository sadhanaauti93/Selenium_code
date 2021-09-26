package MyIfesle;

public class Flight {
		int Seats;
		//private int Seats;
		public int getSeats(int i, int j) {
			return Seats;
		}
		public void setSeats(int  seats, int Seats) {
			this.Seats = Seats;
		}
		public static void main(String[] args) {
			Flight obj = new Flight();
			obj.setSeats(4,7);
			obj.getSeats(1,5);

	}
		public static void resetAllPassengers() {
			
		}
		public void add1Passenger() {
			
		}
		public static char[] getPassengers() {
			// TODO Auto-generated method stub
			return null;
		}

}
