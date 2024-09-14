package konrad.dataformats.testobjects.bigmirrortree;

import konrad.dataformats.testobjects.mirrortree.MirrorBranch;

import java.util.List;

public record BigMirrorTree(List<MirrorBranch> mirrorBranches, Integer bigMirrorInteger) {
}
