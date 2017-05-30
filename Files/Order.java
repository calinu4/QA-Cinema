package Files;

public class Order {

	
	public int standardTicketsNumber,oapTicketsNumber,studentTicketsNumber,childTicketsNumber;
	final int standardPrice=8,oapPrice=6,studentPrice=6,childPrice=4;
	public Movie selectedMovie;
	public Day selectedDay;
	public String selectedTime;
	
	public Order(int t1,int t2,int t3, int t4,Movie movie,Day day,String time ){
		standardTicketsNumber=t1;
		oapTicketsNumber=t2;
		studentTicketsNumber=t3;
		childTicketsNumber=t4;
		selectedMovie=movie;
		selectedDay=day;
		selectedTime=time;
	}
	
	public int getTotalPrice(){
		boolean hasDiscount=checkForDiscount();
		if(hasDiscount)
			return standardTicketsNumber*(standardPrice-2)+oapTicketsNumber*(oapPrice-2)+studentTicketsNumber*(studentPrice-2)+childTicketsNumber*(childPrice-2);
		else
			return standardTicketsNumber*standardPrice+oapTicketsNumber*oapPrice+studentTicketsNumber*studentPrice+childTicketsNumber*childPrice;
		
	}
	
	
	public boolean checkForDiscount(){
		return selectedDay==Day.wednesday;
	}

	@Override
	public String toString() {
		return "Total ticket price is £" + getTotalPrice();
	}
	
}
