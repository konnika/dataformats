package konrad.dataformats.use.dataformats;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.registries.DataFormatRegistry;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.testobjects.tree.Tree;

import java.util.List;

public class DataFormats {
    private static final DataFormatRegistry registry = new DataFormatRegistry();

    public static DataFormat tree() {
        var formats = List.of(
                new ValueFormat(new Path("value"), new StringType()),
                new ValueFormat(new Path("branch.value"), new BooleanType()),
                new ValueFormat(new Path("branch.nullValue"), new StringType()),
                new ValueFormat(new Path("branch.leaf.color"), new EnumType(List.of("GREEN", "YELLOW", "RED", "BROWN"))),
                new ValueFormat(new Path("branch.leaf.value"), new StringType()),
                new ValueFormat(new Path("leaves.[].color"), new EnumType(List.of("GREEN", "YELLOW", "RED", "BROWN"))),
                new ValueFormat(new Path("leaves.[].value"), new StringType())
        );
        return new DataFormat(new DataFormatId(Tree.class), formats);
    }
}
