package konrad.dataformats.testobjects.bigmirrortree;

import java.time.LocalDate;
import java.util.List;

public record BigMirrorBranch(List<BigMirrorLeaf> bigMirrorLeaves, LocalDate bigMirrorDate) {
}
