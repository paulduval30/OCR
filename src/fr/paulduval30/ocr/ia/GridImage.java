package fr.paulduval30.ocr.ia;

public class GridImage
{
	private GridPixel[][] image;

	private int width;
	private int height;
	private int pixelSize;

	public GridImage(int width, int height, int pixelSize)
	{
		this.width = width;
		this.height = height;
		this.pixelSize = pixelSize;

		this.createGrid();
	}

	public void createGrid()
	{
		this.image = new GridPixel[height][width];

		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				this.image[i][j] = new GridPixel(i * pixelSize, j * pixelSize, pixelSize, pixelSize);
			}
		}
	}

	public GridVector getImageVector()
	{
		GridVector vector = new GridVector();
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(image[i][j].isFill())
					vector.add(1);
				else
					vector.add(0);
			}
		}
		return vector;
	}

	@Override
	public String toString()
	{
		 return "w=" + width + ";h=" + height + ";iw=" + pixelSize + ";ih=" + pixelSize
                + ";v=[" + getImageVector().toString();
	}
}