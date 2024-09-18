package konrad.dataformats.core;

import konrad.dataformats.testobjects.bigtree.BigBranch;
import konrad.dataformats.testobjects.bigtree.BigLeaf;
import konrad.dataformats.testobjects.bigtree.BigTree;
import konrad.dataformats.testobjects.tree.Branch;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Leaf;
import konrad.dataformats.testobjects.tree.Tree;
import konrad.dataformats.testobjects.weirdtree.WeirdTree;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class TestObjects {
    public static Tree tree() {
        var branch = new Branch(new Leaf("branch.leaf", Color.GREEN), true, null);
        var leaves = List.of(new Leaf("tree.leaf1", Color.RED), new Leaf("tree.leaf2", Color.YELLOW));
        return new Tree(branch, leaves, "tree");
    }

    public static BigTree bigTree() {
        List<BigBranch> branches = List.of(
                new BigBranch(List.of(new BigLeaf(BigDecimal.valueOf(12)), new BigLeaf(BigDecimal.valueOf(13))), LocalDate.now()),
                new BigBranch(List.of(new BigLeaf(BigDecimal.valueOf(14)), new BigLeaf(BigDecimal.valueOf(15))), LocalDate.now())
        );
        return new BigTree(branches, 11);
    }

    public static WeirdTree weirdTree() {
        return new WeirdTree(List.of("one", "two", "three"), null);
    }
}
