import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List<CompositeBlock> blocks;

    public Wall(List<CompositeBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<CompositeBlock> findBlocksByColor(String color) {
        for(CompositeBlock block : blocks) {
            if(block.getColor().equals(color)) {
                return Optional.ofNullable(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<CompositeBlock> findBlocksByMaterial(String material) {
        List<CompositeBlock> selectedBlocks = new ArrayList<>();
        for(CompositeBlock block : blocks) {
            if(block.getMaterial().equals(material)) {
                selectedBlocks.add(block);
            }
        }
        return selectedBlocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }

}
