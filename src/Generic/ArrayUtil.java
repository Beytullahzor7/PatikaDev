package Generic;

public class ArrayUtil {
    public <T> boolean arrayContains(T[] array, T elem)
    {
        for (T item : array)
        {
            if (item != null && item.equals(elem))
            {
                return true;
            }
        }
        return false;
    }
}
