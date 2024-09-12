package konrad.dataformats.use.dataformats;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.registries.DataFormatRegistry;
import konrad.dataformats.testobjects.tree.Tree;

import java.util.List;

public class DataFormats {
    private static final DataFormatRegistry registry = new DataFormatRegistry();

    public static DataFormat tree() {
        var formats = List.of(
                new ValueFormat(new Path("value"), Type.STRING),
                new ValueFormat(new Path("branch.value"), Type.BOOLEAN),
                new ValueFormat(new Path("branch.nullValue"), Type.STRING),
                new ValueFormat(new Path("branch.leaf.color"), Type.enumType("GREEN", "YELLOW", "RED", "BROWN")),
                new ValueFormat(new Path("branch.leaf.value"), Type.STRING),
                new ValueFormat(new Path("leaves.[].color"), Type.enumType("GREEN", "YELLOW", "RED", "BROWN")),
                new ValueFormat(new Path("leaves.[].value"), Type.STRING)
        );
        return new DataFormat(new DataFormatId(Tree.class), formats);
    }
}
