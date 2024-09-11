package konrad.dataformats.use.objects.one;

import java.util.List;

public record Tree(Branch branch, List<Leaf> leaves, String value) {
}
