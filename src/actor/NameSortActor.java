package actor;

import java.util.Comparator;

public final class NameSortActor implements Comparator<Actor> {
    @Override
    public int compare(final Actor o1, final Actor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
