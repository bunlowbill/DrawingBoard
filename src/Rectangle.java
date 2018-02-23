import java.util.*;

public class Rectangle extends Shapes implements Drawable{
	private int width;
	private int height;
	private int x_Pos;
	private int y_Pos;
	private String color;
	
	public Rectangle() {
		x_Pos = 10;
		y_Pos = 100;
		width = 50;
		height = 100;
	}
	
	public Rectangle(int h, int w, int x, int y, String col) {
		x_Pos = x;
		y_Pos = y;
		width = w;
		height = h;
		if(col.equals("red")) {
			color = red;
		}
		else if(col.equals("green")) {
			color = green;
		}
		else if(col.equals("blue")) {
			color = blue;
		}
		else if(col.equals("yellow")) {
			color = yellow;
		}
		else if(col.equals("pink")) {
			color = pink;
		}
		else if(col.equals("sayan")) {
			color = sayan;
		}
		else {
			color = col;
		}
	}
	public Rectangle(int h, int w, shapeGroups group, String col) {
		x_Pos = (int)group.list.get(0);
		y_Pos = (int)group.list.get(1);
		width = w;
		height = h;
		if(col.equals("red")) {
			color = red;
		}
		else if(col.equals("green")) {
			color = green;
		}
		else if(col.equals("blue")) {
			color = blue;
		}
		else if(col.equals("yellow")) {
			color = yellow;
		}
		else if(col.equals("pink")) {
			color = pink;
		}
		else if(col.equals("sayan")) {
			color = sayan;
		}
		else {
			color = col;
		}
	}
	public void drawOn(DrawingBoard db) {
		//height += y_Pos;
		//width += x_Pos;
		for(int i = 0; i < height; i++) {
			for(int u = 0; u < width; u++) {
				db.imgArray[y_Pos + i][x_Pos + u] = Integer.parseInt(color, 16);
			}
		}
		
	}
	public boolean within(DrawingBoard db) {
		return true;
	}
	public void addObjectGroup(ArrayList g) {
		
	}
	/*for(int i = y_Pos; i < height; i++) {
		for(int u = x_Pos; u < width; u++) {
			db.imgArray[i][u] = Integer.parseInt(color, 16);
		}
	}*/
	
}
