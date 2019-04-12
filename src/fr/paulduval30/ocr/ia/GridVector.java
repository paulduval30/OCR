package fr.paulduval30.ocr.ia;

import java.util.ArrayList;

public class GridVector
{
	private ArrayList<Integer> points;

	public GridVector()
	{
		this.points = new ArrayList<>();
	}

	public GridVector(ArrayList<Integer> points)
	{
		this.points = points;
	}

	public int getDimension()
	{
		return points.size();
	}


	public int getPoint(int index)
	{
		return this.points.get(index);
	}


	@Override
	public String toString()
	{
		String sRet = "[" + this.points.get(0);
		for(int i = 1; i < points.size(); i++)
		{
			sRet += this.points.get(i) + ",";
		}

		return sRet + "]";
	}

	public void add(Integer point)
	{
		if(point != null)
			points.add(point);
	}
}