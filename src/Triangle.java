import java.util.*;

public class Triangle extends Shapes implements Drawable {
	int x1;
	int y1;
	int x2;
	int y2;
	int direction;
	String color;
	public Triangle() {	
	}
	
	public Triangle(int x, int y, int x_2, int y_2, int dir, String col) { //Assumes that points given will make a triangle
		x1 = x;
		y1 = y;
		x2 = x_2;
		y2 = y_2;
		direction = dir;//Orentation of triangle
		
		
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
	/*public void drawLines(int x, int y, int x2, int y2, DrawingBoard db) {
		if(y == y2) {
			if(x > x2) {
				for(int i = 0; i < x - x2; i++) {
					db.imgArray[y][i + x2] = Integer.parseInt(color, 16);
				}
			}
			else if(x2 > x) {
				for(int i = 0; i < x2 - x; i++) {
					db.imgArray[y][i + x] = Integer.parseInt(color, 16);
				}
			}
			else if(x == x2) {
				for(int i = 0;i < x2;i++) {
					//p = Render.xOnLine(i, x, y, x2, y2);
					db.imgArray[y][i+x] = Integer.parseInt(color, 16);
				}
			}
		}
		else {
			int p;
			if(x > x2) {
				for(int i = 0; i < x - x2; i++) {
					p = Render.xOnLine(y, x, y, x2, y2);
					db.imgArray[p][i + x2] = Integer.parseInt(color, 16);
				}
			}
			else if(x2 > x) {
				for(int i = 0; i < x2 - x; i++) {
					p = Render.xOnLine(i, x, y, x2, y2);
					db.imgArray[p][i + x] = Integer.parseInt(color, 16);
				}
			}
			else if(x == x2) {
				for(int i = 0;i < x2;i++) {
					p = Render.xOnLine(i, x, y, x2, y2);
					db.imgArray[p][i+x] = Integer.parseInt(color, 16);
				}
			}
		}
	}*/
	public void drawLines(int x, int y, int x_2, int y_2, int dr, String color, DrawingBoard db) {
		int xV = x;
		int yV = y;
		int xV2 = x_2;
		int yV2 = y_2;
		int p;
		if(dr == 1) {
			for(int u = 0; u < yV2; u++) {
				for(int i = 0; i < xV2; i++) {
					p = Render.xOnLine(u, xV2, yV, xV, yV2);
					db.imgArray[p][u] = Integer.parseInt(color, 16);
				}
			}
		}
		else if(dr == 2) {
			
		}
		else if(dr == 3) {
			
		}
		else if(dr == 4) {
			
		}
		else {
			System.out.println("Triangle not able to be drawn incorrect orientation used");
		}
	}
	
	public void drawOn(DrawingBoard db) {
		this.drawLines(x1, y1, x2, y2, direction, color, db);
	}
		
	public boolean within(DrawingBoard db) {
		return false;
	}
	
	/*for(int i = 0; i < ba; i++) {
	db.imgArray[ty][tx + i] = Integer.parseInt(color, 16);
}
System.out.println("First block complete");
for(int i = 0; i < he; i++) {
	db.imgArray[ty + i][tx] = Integer.parseInt(color, 16);
}
System.out.println("Second block complete");
for(int i = 0; i < (int)((Math.sqrt(Math.pow(tx, 2)) + (Math.sqrt(Math.pow(ty, 2))))); i++){
	p = Render.xOnLine(i, tx, ty, tx + bas, ty+ hei);
	db.imgArray[ty + i][p] = Integer.parseInt(color, 16);
}
System.out.println("Third block complete");*/
}
