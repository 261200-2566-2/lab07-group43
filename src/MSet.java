import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MSet<E> implements Set<E>{
    private final HashMap <E,Integer> HMap = new HashMap<>();
    @Override
    public int size() {
        return HMap.size();
    }

    @Override
    public boolean isEmpty() {
        return HMap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return HMap.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return HMap.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E element) {
        HMap.put(element ,0);
        return true;
    }

    @Override
    public boolean remove(Object element) {
        HMap.remove(element ,0);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(E i : c){
            add(i);
        }
        return true;
    }

    @Override
    public void clear() {
        HMap.clear();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return HMap.keySet().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return HMap.keySet().retainAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return HMap.keySet().containsAll(c);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}
