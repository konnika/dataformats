package konrad.dataformats.core;

import konrad.dataformats.testobjects.bigtree.BigTree;
import konrad.dataformats.testobjects.mirrortree.MirrorColor;
import konrad.dataformats.testobjects.mirrortree.MirrorTree;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Tree;

import java.util.List;

public class TestDataFormats {
    public static DataFormat tree() {
        var formats = List.of(
                new ValueFormat(new Path("value"), Type.STRING),
                new ValueFormat(new Path("branch.value"), Type.BOOLEAN),
                new ValueFormat(new Path("branch.nullValue"), Type.STRING),
                new ValueFormat(new Path("branch.leaf.color"), Type.forEnum(Color.class)),
                new ValueFormat(new Path("branch.leaf.value"), Type.STRING),
                new ValueFormat(new Path("leaves.[].color"), Type.forEnum(Color.class)),
                new ValueFormat(new Path("leaves.[].value"), Type.STRING)
        );
        return new DataFormat(new DataFormatId(Tree.class), formats);
    }

    public static DataFormat mirrorTree() {
        var formats = List.of(
                new ValueFormat(new Path("mirrorValue"), Type.STRING),
                new ValueFormat(new Path("mirrorBranch.mirrorValue"), Type.BOOLEAN),
                new ValueFormat(new Path("mirrorBranch.mirrorNullValue"), Type.STRING),
                new ValueFormat(new Path("mirrorBranch.mirrorLeaf.mirrorColor"), Type.forEnum(MirrorColor.class)),
                new ValueFormat(new Path("mirrorBranch.mirrorLeaf.mirrorValue"), Type.STRING),
                new ValueFormat(new Path("mirrorLeaves.[].mirrorColor"), Type.forEnum(MirrorColor.class)),
                new ValueFormat(new Path("mirrorLeaves.[].mirrorValue"), Type.STRING)
        );
        return new DataFormat(new DataFormatId(MirrorTree.class), formats);
    }

    public static DataFormat bigTree() {
        var formats = List.of(
                new ValueFormat(new Path("branches.[].leaves.[].bigNumber"), Type.NUMBER),
                new ValueFormat(new Path("branches.[].bigDate"), Type.DATE),
                new ValueFormat(new Path("bigInteger"), Type.INTEGER)
        );
        return new DataFormat(new DataFormatId(BigTree.class), formats);
    }
}
