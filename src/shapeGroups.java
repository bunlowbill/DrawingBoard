import java.util.*;

public class shapeGroups extends Render{
	ArrayList list = new ArrayList();
	
	public shapeGroups() {}
	public shapeGroups(int x, int y) {
		list.add(x);
		list.add(y);
	}

	public void addGroup(Shapes shape) {
		list.add(shape);
	}

}
