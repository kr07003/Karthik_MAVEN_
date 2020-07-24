package ToolsQA;

class Jamun extends Sweets
{
	public int count;
	public Jamun(int count)
	{
		super("Gulab Jamun",30,250);
		this.count=count;
	}
	public int getWeight()
	{
		return this.GiftWeight*this.count;
	}
	public int getCost()
	{
		return this.GiftCost*this.count;
	}
}