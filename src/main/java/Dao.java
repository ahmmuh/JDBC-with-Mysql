import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> getCity(Long id);
    List<T> getAllCities();
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);


}

