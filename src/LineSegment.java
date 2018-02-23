public class LineSegment extends Shapes implements Drawable {
	int x1;
	int x2;
	int y1;
	int y2;
	String color;
	public LineSegment(int y, int x, int Sy, int Sx, String col) { //Takes in two points and makes a line between them
		x1 = x;
		x2 = Sx;
		y1 = y;
		y2 = Sy;
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
	public LineSegment(shapeGroups group, int Sx, int Sy, String col) { //Takes in two points and makes a line between them
		x1 = (int)group.list.get(0);
		x2 = Sx;
		y1 = (int)group.list.get(1);
		y2 = Sy;
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
		if(y1 == y2) {
			if(x1 > x2) {
				for(int i = 0; i < (x1 - x2); i++) {
					db.imgArray[y1][i + x2] = Integer.parseInt(color, 16);
				}
			}
			else if(x2 > x1) {
				for(int i = 0; i < (x2 - x1); i++) {
					db.imgArray[y1][i + x1] = Integer.parseInt(color, 16);
				}
			}
		}
		else {
			int p;
			if(y1 > y2) {
				for(int i = 0; i < (y1 - y2); i++) {
					p = Render.xOnLine(i, x1, y1, x2, y2);
					db.imgArray[p][i + x2] = Integer.parseInt(color, 16);
				}
			}
			else if(y2 > y1) {
				for(int i = 0; i < (y2 - y1); i++) {
					p = Render.xOnLine(i, x1, y1, x2, y2);
					db.imgArray[p][i + x1] = Integer.parseInt(color, 16);
				}
			}
		}
	}
	public boolean within(DrawingBoard db) {
		return false;
	}
}
