import java.util.*;
public class DrawingTester {

	public static void main(String[] args) {
		//Render board = new Render("ABackground");
		Render board = new Render("red-1.jpg");
		//Rectangle rect = new Rectangle(100, 10, 300, 300, "pink"); //h,w,x,y
		//Rectangle rect2 = new Rectangle(500, 20, 200, 100, "blue");
		//Square sq = new Square(600, "sayan", 300, 100);//height/width, color, x, y
		//LineSegment line = new LineSegment(10, 40, 500, 40, "yellow");//x1, y1, x2, y2, color
		LineSegment line2 = new LineSegment(500, 600, 700, 600, "pink");
		//LineSegment line3 = new LineSegment(500, 700, 700, 700, "blue");
		//LineSegment line4 = new LineSegment(1280, 0, 0, 720, "yellow");
		LineSegment line5 = new LineSegment(0, 0, 1280, 720, "sayan");
		//LineSegment line6 = new LineSegment(0, 100, 1219, 100, "red"); 
		//shapeGroups group = new shapeGroups(640, 360);
		//Square squ = new Square(100, "blue", group);
		//Rectangle rect3 = new Rectangle(100, 400, group, "green");
		//LineSegment lin = new LineSegment(group, 400, 30, "red");
		Triangle first = new Triangle(500, 500, 300,300,1, "sayan");//x,y,x2,y2,orientation,color
		//board.add(rect);
		//board.add(sq);
		//board.add(rect2);
		//board.add(line);
		//board.add(line2);
		//board.add(line3);
		//board.add(line4);
		//board.add(line5);
		//board.add(rect3);
		//board.add(squ);
		//board.add(lin);
		board.add(first);
		//board.add(line6);
		System.out.println(board.getWidth());
		System.out.println(board.getHeight());
		//System.out.println(Integer.toHexString(array[12][12]));
		/*for(int i = 5; i < 500 ; i++) {
			for(int u = 5; u < 200; u++) {
				board.imgArray[i][u] = Integer.parseInt("ff00ff", 16);
				//System.out.println((board.imgArray[i][u]));
			}
		}*/
		//board.imgArray = array;
		board.show();
		
	}	



}
