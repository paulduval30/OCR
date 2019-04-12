package fr.paulduval30.ocr.ia;
import java.util.HashMap;

public class DistanceCalculator
{
    public static String EuclideanRecognition(GridImage input, 
    	HashMap<String, GridImage> knowledge)
    {
        String closestGridName = "";
        float closestDistance = Float.POSITIVE_INFINITY;
        GridVector inputVector = input.getImageVector();

        for(String itemName : knowledge.keySet())
        {
            GridVector itemVector = knowledge.get(itemName).getImageVector();
            float distance = EuclideanDistance(inputVector, itemVector);
            if (distance < closestDistance)
            {
                closestDistance = distance;
                closestGridName = itemName;
            }
        }
        return closestGridName;
    }

    private static float EuclideanDistance(GridVector a, GridVector b)
    {
        if (a.getDimension() != b.getDimension())
            {
            	System.out.println("Dimension must be the same");
            }
        float sum = 0f;
        for (int i = 0; i < a.getDimension(); i++)
            sum += (a.getPoint(i) - b.getPoint(i)) * (a.getPoint(i) - b.getPoint(i));

        return (float)Math.sqrt(sum);
    }
}
