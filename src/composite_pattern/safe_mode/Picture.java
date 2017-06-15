package composite_pattern.safe_mode;

import java.util.Vector;

/**
 * Created by cuikangyuan on 2017/6/15.
 * 树枝构件 的角色
 */
public class Picture implements Graphics{

    private Vector list = new Vector();

    @Override
    public void draw() {
        for (int i = 0; i < list.size(); i++) {
            Graphics g = (Graphics) list.get(i);
            g.draw();
        }
    }


    public void add(Graphics graphics) {
        list.add(graphics);
    }

    public void remove(Graphics graphics) {
        list.remove(graphics);
    }

    public Graphics getChild(int index) {
        return (Graphics) list.get(index);
    }
}
