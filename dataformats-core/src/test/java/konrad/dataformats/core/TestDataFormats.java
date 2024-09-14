package konrad.dataformats.core;

import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.testobjects.mirrortree.MirrorColor;
import konrad.dataformats.testobjects.mirrortree.MirrorTree;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Tree;

import java.util.List;

public class TestDataFormats {
    public static DataFormat tree() {
        var formats = List.of(
                new ValueFormat(new Path("value"), new StringType()),
                new ValueFormat(new Path("branch.value"), new BooleanType()),
                new ValueFormat(new Path("branch.nullValue"), new StringType()),
                new ValueFormat(new Path("branch.leaf.color"), new EnumType(Color.class)),
                new ValueFormat(new Path("branch.leaf.value"), new StringType()),
                new ValueFormat(new Path("leaves.[].color"), new EnumType(Color.class)),
                new ValueFormat(new Path("leaves.[].value"), new StringType())
        );
        return new DataFormat(new DataFormatId(Tree.class), formats);
    }

    public static DataFormat mirrorTree() {
        var formats = List.of(
                new ValueFormat(new Path("mirrorValue"), new StringType()),
                new ValueFormat(new Path("mirrorBranch.mirrorValue"), new BooleanType()),
                new ValueFormat(new Path("mirrorBranch.mirrorNullValue"), new StringType()),
                new ValueFormat(new Path("mirrorBranch.mirrorLeaf.mirrorColor"), new EnumType(MirrorColor.class)),
                new ValueFormat(new Path("mirrorBranch.mirrorLeaf.mirrorValue"), new StringType()),
                new ValueFormat(new Path("mirrorLeaves.[].mirrorColor"), new EnumType(MirrorColor.class)),
                new ValueFormat(new Path("mirrorLeaves.[].mirrorValue"), new StringType())
        );
        return new DataFormat(new DataFormatId(MirrorTree.class), formats);
    }

    // FIXME activate again
//    public static DataFormat bigTree() {
//        var formats = List.of(
//                new ValueFormat(new Path("branches.[].leaves.[].bigNumber"), Type.NUMBER),
//                new ValueFormat(new Path("branches.[].bigDate"), Type.DATE),
//                new ValueFormat(new Path("bigInteger"), Type.INTEGER)
//        );
//        return new DataFormat(new DataFormatId(BigTree.class), formats);
//    }
}
