package clase1;

public class Movie {
      //Atributos
      private String name;
      private String category;
      private int year;
      private int duration;

      //Metodo Constructor
      public Movie() {
      }

      public Movie(String name, String category, int year, int duration) {
            this.name=name;
            this.category=category;
            this.year=year;
            this.duration=duration;
      }
      //Metodo accesores
      public String getName() {
            return name;
      }
      public void setName(String name) {
            this.name = name;
      }
      public String getCategory() {
            return category;
      }
      public void setCategory(String category) {
            this.category = category;
      }
      public int getYear() {
            return year;
      }
      public void setYear(int year) {
            this.year = year;
      }
      public int getDuration() {
            return duration;
      }
      public void setDuration(int duration) {
            this.duration = duration;
      }

      //Metodos
      public void mostrarPelicula(){
            System.out.println("El nombre de la pelicula es "+name);
      }
      public void mostrarPelicula(String name){
            System.out.println("El nombre de la pelicula es "+name);
      }
      public void mostrarPelicula( String category, int year){
            System.out.println("La categoria de la pelicula es "+category+" y Año es "+year);
      }
    
}
