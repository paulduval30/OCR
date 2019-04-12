package fr.paulduval30.ocr.ia;

import java.awt.geom.Rectangle2D;

public class GridPixel
{
	private boolean fill;
	private int posX;
	private int posY;
	private int width;
	private int height;

	public GridPixel(int x, int y, int width, int height)
	{
		this.posX = x;
		this.posY = y;
		this.width = width;
		this.height = height;
		this.fill = false;
	}

	public void fill()
	{
		this.fill = true;
	}

	public void empty()
	{
		this.fill = false;
	}

	public int[] getHitBox()
	{
		return new int[]{posX, posY, posX + width, posY + height};
	}

	public boolean isFill()
	{
		return this.fill;
	}

	public boolean instersectWith(int x, int y, int width, int height)
	{
		return (x > this.posX && x < this.posX + width) && (y > this.posY && y < this.posY + height);
	}


}