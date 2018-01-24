public enum OdessaLviv {
  RAZDELNAYA(25),
  KOTOWSK(43),
  VAPNIARKA(65),
  ZHMERINKA(87),
  SHOSTKA(124),
  CHMELNIZKY(137),
  VOLOCHISK(151),
  PIDVOLOCHISK(159),
  TERNOPYL(172),
  ZBOROW(186),
  ZOLOCHEV(207),
  LVIV(225)
  ;

  private int cost;

  OdessaLviv(int cost) {
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }
}
