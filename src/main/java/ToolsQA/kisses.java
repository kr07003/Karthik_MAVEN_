package ToolsQA;
class kisses extends Chocolates
{
	private int count;
	public kisses(int count)
	{
		super("Hershey Kisses",10,200);
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