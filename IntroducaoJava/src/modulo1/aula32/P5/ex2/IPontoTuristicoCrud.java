package P5.ex2;

import java.util.ArrayList;

public interface IPontoTuristicoCrud {
    public String save(PontoTuristico model);
    public ArrayList<PontoTuristico> read();
}
