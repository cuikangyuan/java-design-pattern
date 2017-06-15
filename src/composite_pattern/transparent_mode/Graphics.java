package composite_pattern.transparent_mode;

/**
 * Created by cuikangyuan on 2017/6/15.
 */
public interface Graphics {
    void draw();
    void add(Graphics g);
    void remove(Graphics g);
    Graphics getChild(int i);
}
