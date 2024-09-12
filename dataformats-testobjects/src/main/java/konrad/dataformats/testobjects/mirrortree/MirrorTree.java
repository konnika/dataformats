package konrad.dataformats.testobjects.mirrortree;

import java.util.List;

public record MirrorTree(MirrorBranch mirrorBranch, List<MirrorLeaf> mirrorLeaves, String mirrorValue) {
}
