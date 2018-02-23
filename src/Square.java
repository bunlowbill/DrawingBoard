public class Square extends Rectangle{
	int HeiWid;
	int x_Pos;
	int y_Pos;
	String color;
	public Square(int hw, String col, int x, int y) {
		HeiWid = hw;
		color = col;
		x_Pos = x;
		y_Pos = y;
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
	public Square(int hw, String col, shapeGroups group) {
		HeiWid = hw;
		color = col;
		x_Pos = (int)group.list.get(0);
		y_Pos = (int)group.list.get(1);
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
		//HeiWid += x_Pos + y_Pos;
		for(int i = 0; i < HeiWid; i++) {
			for(int u = 0; u < HeiWid; u++) {
				db.imgArray[y_Pos + i][x_Pos + u] = Integer.parseInt(color, 16);
			}
		}
	}

}
