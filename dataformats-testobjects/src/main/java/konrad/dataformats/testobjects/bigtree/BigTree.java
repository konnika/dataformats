package konrad.dataformats.testobjects.bigtree;

import java.util.List;

public record BigTree(List<BigBranch> branches, Integer bigInteger) {
}
