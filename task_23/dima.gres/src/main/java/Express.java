public class Express {
  public static final int VAGONSPLACES = 36;

  private int quantiyOfVagones;
  private int quantityOfTickets;
  private Ticket[][] tickets;

  public Express(int quontiyOfVagones) throws NoNummerOfPlace {
    this.quantiyOfVagones = quontiyOfVagones;
    quantityOfTickets = this.quantiyOfVagones * VAGONSPLACES;
    tickets = new Ticket[quantiyOfVagones][VAGONSPLACES];

    for (int i = 0; i < quantiyOfVagones; i++) {
      for (int j = 0; j < VAGONSPLACES; j++) {
        tickets[i][j] = new Ticket(i, j);
      }
    }
  }


}
