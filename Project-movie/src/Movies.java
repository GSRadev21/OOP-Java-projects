import java.util.*;

public class Movies {

    ArrayList<Movie> movies;
    Scanner sc = new Scanner(System.in);

    public Movies() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        boolean found = false;
        for(Movie i : movies) {
            if(Objects.equals(i.getId(),movie.getId())) {
                found = true;
                break;
            }
        }
        if(!found) {
            movies.add(movie);
        } else {
            System.out.println("Movie already exists!");
        }
    }

    public void delMovie() {
        Long id = sc.nextLong();
        for(Movie i : movies) {
            if(Objects.equals(i.getId(),id)) {
                this.movies.remove(i);
                break;
            }
        }
    }

    public void displayMoviesByTitleAndYear() {
        String title = sc.nextLine();
        Integer year = sc.nextInt();
        ArrayList<Movie> selectedMovies = new ArrayList<>();
        for(Movie i : movies) {
            if(Objects.equals(i.getTitle(),title) || Objects.equals(i.getYear(),year)) {
                selectedMovies.add(i);
            }
        }

        System.out.println("Results: ");
        for(Movie i : selectedMovies) {
            i.displayMovie();
        }
    }

    public void sortByYear() {
        Movie temp = movies.getFirst();

        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getYear() - o1.getYear();
            }
        });

        for(Movie i : movies) {
            i.displayMovie();
        }
    }

}
