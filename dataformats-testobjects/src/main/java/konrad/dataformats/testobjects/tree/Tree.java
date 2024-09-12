package konrad.dataformats.testobjects.tree;

import java.util.List;

public record Tree(Branch branch, List<Leaf> leaves, String value) {
}
