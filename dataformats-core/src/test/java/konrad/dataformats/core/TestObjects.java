package konrad.dataformats.core;

import konrad.dataformats.testobjects.tree.Branch;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Leaf;
import konrad.dataformats.testobjects.tree.Tree;

import java.util.List;

public class TestObjects {
    public static final Tree tree() {
        var branch = new Branch(new Leaf("branch.leaf", Color.GREEN), true, null);
        var leaves = List.of(new Leaf("tree.leaf1", Color.RED), new Leaf("tree.leaf2", Color.YELLOW));
        return new Tree(branch, leaves, "tree");
    }
}
