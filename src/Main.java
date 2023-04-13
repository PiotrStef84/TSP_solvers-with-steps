import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> initialCities = new ArrayList<>(Arrays.asList(
                new City("Boston", 42.3601, -71.0589),
                new City("Houston", 29.7604, 95.3698),
                new City("Austin", 30.2672, -97.7431),
                new City("San Francisco", 37.7749, -122.4194),
                new City("Denver", 39.7392, -104.9903),
                new City("Los Angeles", 34.0522, -118.2437),
                new City("Chicago", 41.8781, -87.6298),
                new City("New York", 40.7128, -74.0059),
                new City("Dallas", 32.7767, -96.7970),
                new City("Seattle", 47.6062, -122.3321)
        ));

        ArrayList<City> initialCitiesClone = (ArrayList<City>) initialCities.clone();
        ArrayList<City> initialCitiesClone2 = (ArrayList<City>) initialCities.clone();

        NearestNeighbor NNSolver = new NearestNeighbor();

        //NNSolver.solve(initialCities, initialCities.get(0), false);
        //NNSolver.solve(initialCitiesClone, initialCitiesClone.get(0), true);

//        Steps NNSteps = NNSolver.solveAndRecord(initialCitiesClone, initialCitiesClone.get(0), true);
//        NNSteps.toString();

        HillClimbing HillSolver = new HillClimbing();

        //HillSolver.solve(initialCities, initialCities.get(0), false);
        //HillSolver.solve(initialCities, initialCitiesClone.get(0), true);

        Steps hillSteps = HillSolver.solveAndRecord(initialCities, initialCitiesClone.get(0), true);
        System.out.println(hillSteps.toString());


    }
}