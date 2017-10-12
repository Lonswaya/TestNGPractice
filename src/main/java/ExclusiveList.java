import java.util.ArrayList;
import java.util.List;

public class ExclusiveList extends ArrayList {
    private List<Object> notAllowed;
    public ExclusiveList(List<Object> notAllowed) {
        super();
        this.notAllowed = notAllowed;
    }

    @Override
    public boolean add(Object o) {
        if (notAllowed.contains(o)) {
            return false;
        } else {
            return super.add(o);
        }
    }
}
