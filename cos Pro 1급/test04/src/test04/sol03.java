package test04;

public class sol03 {
	public long solution(int oneDayPrice, int multiDay, int multiDayPrice, long n) {
		if (oneDayPrice * multiDay <= multiDayPrice)
			return n * oneDayPrice;
		else
			return ((n / multiDay) * multiDayPrice) + ((n % multiDay) * oneDayPrice);
	}
}
