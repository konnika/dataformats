package konrad.dataformats.use;

import konrad.dataformats.use.objects.one.Branch;
import konrad.dataformats.use.objects.one.Color;
import konrad.dataformats.use.objects.one.Leaf;
import konrad.dataformats.use.objects.one.Tree;

import java.util.List;

public class TestObjects {
    public static final Tree tree() {
        var branch = new Branch(new Leaf("branch.leaf", Color.GREEN), true, null);
        var leaves = List.of(new Leaf("tree.leaf1", Color.RED), new Leaf("tree.leaf2", Color.YELLOW));
        return new Tree(branch, leaves, "tree");
    }
}
