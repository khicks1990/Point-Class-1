/*
public class Main
{
   public static void main(String[] args)
   {
      // Create two Double objects to use as coordinates.
      Double dblX = new Double(1.5);
      Double dblY = new Double(2.5);

      // Create a Point object that can hold Doubles.
      Point<Double> dPoint = new Point<>(dblX, dblY);

      // Create two Integer objects to use as coordinates.
      Integer intX = new Integer(10);
      Integer intY = new Integer(20);

      // Create a Point object that can hold Integers.
      Point<Integer> iPoint = new Point<>(intX, intY);

      // Display the Double values stored in dPoint.
      System.out.println("Here are the values in dPoint.");
      System.out.println("X Coordinate: " + dPoint.getX());
      System.out.println("Y Coordinate: " + dPoint.getY());
      System.out.println();

      // Display the Integer values stored in iPoint.
      System.out.println("Here are the values in iPoint.");
      System.out.println("X Coordinate: " + iPoint.getX());
      System.out.println("Y Coordinate: " + iPoint.getY());
   }
}
*/



/*
public class Main
{
   public static void main(String[] args)
   {
      // Create an Integer and a Double
      // to use as coordinates.
      Integer x = new Integer(1);
      Double y = new Double(7.5);

      // Create a Point object with an
      // Integer x coordinate and a Double
      // y coordinate.
      Point myPoint = new Point(x, y);

      // Display the object's X and Y
      // coordinate values.
      System.out.println("X Coordinate: " +
                         myPoint.getX());
      System.out.println("Y Coordinate: " +
                         myPoint.getY());
   }
}
*/



/*

public class Main
{
   public static void main(String[] args)
   {
      // Create various Point objects.
      Point<Integer> iPoint = new Point<>(1, 2);
      Point<Double> dPoint = new Point<>(1.5, 2.5);
      Point<Long> lPoint = new Point<>(10L, 20L);
      Point<Float> fPoint = new Point<>(7.9f, 9.9f);

      // Display each object's coordinates.
      System.out.println("iPoint:");
      printPoint(iPoint);

      System.out.println("\ndPoint:");
      printPoint(dPoint);

      System.out.println("\nlPoint:");
      printPoint(lPoint);

      System.out.println("\nfPoint:");
      printPoint(fPoint);
   }

   public static void printPoint(Point<? extends Number> point)
   {
      System.out.println("X Coordinate: " + point.getX());
      System.out.println("Y Coordinate: " + point.getY());
   }
}
*/