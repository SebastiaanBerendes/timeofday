package timeofday;

/**
 * Each instance of this class stores a time of day expressed
 * using hours between 0 and 23 and minutes between 0 and 59.
 *
 *@invar | 0 <= getUur() && getUur() <= 23
 *@invar | 0 <= getMinuut() && getMinuut() <= 59
 */

public class TimeOfDay {
	private int uur;
	private int minuut;
	
	public int getUur() {
		return this.uur;
	}
	
	public int getMinuut() {
		return this.minuut;
	}
	
	/**
	 * @post | getUur() == 0
	 * @post | getMinuut() == 0
	 */
	public TimeOfDay() {}
	
	/**
	 * @throws IllegalArgumentException | 0 > minuut || minuut > 59
	 * @throws IllegalArgumentException | 0 > uur || uur > 23
	 * 
	 * @post | getMinuut() == minuut
	 * @post | getUur() == uur
	 */
	public TimeOfDay(int uur, int minuut) {
		if (0 > minuut || minuut > 59)
			throw new IllegalArgumentException("Het aantal minuten is niet goed gedefinieerd.");
		if (0 > uur || uur > 23)
			throw new IllegalArgumentException("Het aantal uren is fout gedefinieerd.");
		this.uur = uur;
		this.minuut = minuut;
	}
	
	public void setUur(int waarde) {
		this.uur = waarde;
	}
	
	public void setMinuut(int waarde) {
		this.minuut = waarde;
	}
	
	/**
	 * @post | result == getUur() * 60 + getMinuut()
	 */
	public int getMinuutSinceMidnight() {
		return (this.uur * 60 + this.minuut);
	}
}
