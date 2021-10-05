// Java program to check if a point lies
// inside a circle or not

class Circle {

	static boolean isInside(int circle_x, int circle_y,
								int rad, int x, int y)
	{
		// Compare radius of circle with
		// distance of its center from
		// given point
		if ((x - circle_x) * (x - circle_x) +
			(y - circle_y) * (y - circle_y) <= rad * rad)
			return true;
		else
			return false;
	}

	// Driver Program to test above function
	public static void main(String arg[])
	{
		int x = 1, y = 1;
		int circle_x = 0, circle_y = 1, rad = 2;

		if (isInside(circle_x, circle_y, rad, x, y))
			System.out.print("Inside");
		else
			System.out.print("Outside");
	}
	Scanner sc = new Scanner
}

// This code is contributed by Anant Agarwal.
