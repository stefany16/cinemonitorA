class Main {
  public static void main(String[] args) {

    Filme filme = new Filme();

    filme.setTitulo("Barraca do beijo");
    filme.setTipo("Romance");
    filme.setAno(2020);
    

    System.out.println("Filme: " + filme.getTitulo());
    System.out.println("Ano: " + filme.getAno());
    System.out.println("Tipo: " + filme.getTipo());

  }
}