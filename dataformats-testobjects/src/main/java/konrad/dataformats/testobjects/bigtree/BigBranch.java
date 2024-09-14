package konrad.dataformats.testobjects.bigtree;

import java.time.LocalDate;
import java.util.List;

public record BigBranch(List<BigLeaf> leaves, LocalDate bigDate) {
}
