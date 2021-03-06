
import java.io.FileNotFoundException;
import java.util.Optional;

/**
 * Created by Lord Daniel on 5/28/2016.
 */
public class CubeSolver {
    public static void main(String[] args) throws FileNotFoundException {

            // construct the initial configuration from the file
            Configuration init = new CubeConfig(args[0]);

            Backtracker bt = new Backtracker(false);

            // start the clock
            double start = System.currentTimeMillis();

            // attempt to solve the puzzle
            Optional<Configuration> sol = bt.solve(init);

            // compute the elapsed time
            System.out.println("Elapsed time: " +
                    (System.currentTimeMillis() - start)/1000.0 + " seconds.");

            // indicate whether there was a solution, or not
            if (sol.isPresent()) {
                System.out.println("SOLVED");
            } else {
                System.out.println("No solution!");
            }
    }
}
