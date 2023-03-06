import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName + " " + t.p2.age);
            }
        }
        return result;
    }

    public ArrayList<String> spend1(Relationship re) {
        for (Node t : tree) {
            if (t.re == re) {
                result.add(t.p1.fullName + " " + t.p1.age);
            }
        }
        return result;
    }

    public ArrayList<String> spend2(int age) {
        for (Node t : tree) {
            if (t.p1.age > age) {
                result.add(t.p1.fullName + " " + t.p1.age);
            }
        }
        return result;
    }

    public ArrayList<String> spend3(Person p) {
        for (Node t : tree) {
            if (t.p1.age > p.age) {
                result.add(t.p1.fullName + " " + t.p1.age);
            }
        }
        return result;
    }
}