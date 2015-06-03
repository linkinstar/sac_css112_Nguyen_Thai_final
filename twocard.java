
public class twocard extends Deck {
	private int sum;
	@Override 
	public int drawcard()
	{
		sum = (super.drawcard() + super.drawcard());
		return sum;
	}
	public int addcard()
	{
		sum += super.drawcard();
		return sum;
	}
	public int getvalue()
	{
		return sum;
	}
}
