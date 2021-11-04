package P1.dao;

import java.util.ArrayList;

public interface IDao<T> {
    public void save(T model);
    public ArrayList<Object> list();
    public void update(T model);
    public void remove(T model);
}
