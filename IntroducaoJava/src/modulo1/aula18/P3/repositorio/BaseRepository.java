package P3.repositorio;

import java.util.ArrayList;

import P3.modelo.Base;

public class BaseRepository<T extends Base> {
    private ArrayList<T> list;

    public BaseRepository() {
        list = new ArrayList<T>();
    }

    public void create(T model){
        list.add(model);
    }

    public ArrayList<T> read(){
        return list;
    }

    public void update(T model){
        for (T m : list) {
            if(m.getId() == model.getId()){
                delete(model);
                create(model);
            }
        }
    }
    public void delete(T model){
        list.remove(model);
    }
}