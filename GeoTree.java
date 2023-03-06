import java.util.ArrayList;
import java.io.Serializable;

public class GeoTree implements Serializable {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendG(Person grandparents, Person grandchildren) {
        tree.add(new Node(grandparents, Relationship.grandparents, grandchildren));
        tree.add(new Node(grandchildren, Relationship.grandchildren, grandparents));
    }

    public void addendBS(Person brother, Person sister) {
        tree.add(new Node(brother, Relationship.brother, sister));
        tree.add(new Node(sister, Relationship.sister, brother));
    }
}