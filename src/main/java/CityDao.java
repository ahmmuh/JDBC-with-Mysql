import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CityDao implements Dao<City> {


    private List<City> cities = new ArrayList<>();

    public CityDao() {
        cities.add(new City("Umeå"));
        cities.add(new City("Göteborg"));
        cities.add(new City("Uppsala"));
        cities.add(new City("Skellefteå"));
        cities.add(new City("Vännäs"));
    }

    @Override
    public Optional<City> getCity(Long id) {
        return Optional.ofNullable(cities.get(Math.toIntExact((Long) id)));
    }

    @Override
    public List<City> getAllCities() {
        return cities;
    }

    @Override
    public void save(City city) {
        cities.add(city);
    }

    @Override
    public void update(City city, String[] params) {
        city.setName(Objects.requireNonNull(
                params[0], "The name cannot be null"));
        cities.add(city);
    }

    @Override
    public void delete(City city) {
        cities.remove(city);
    }
}
