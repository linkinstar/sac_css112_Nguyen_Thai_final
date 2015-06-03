
public class Deck {
	public int value;
	public Deck()
	{
		drawcard();
	}
	
	public int drawcard()
	{
		value = (int)(Math.random()*11)+1;
		return value;
	}
}
