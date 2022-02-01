import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional findBlocksByColor(String color);
    List findBlocksByMaterial(String material);
    int count();
}
