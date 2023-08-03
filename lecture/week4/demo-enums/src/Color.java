public enum Color {
  //hexCode
  RED("#FF000"), //
  GREEN("#00FF00"), //
  BULE("#000FF"), //
  ;

  private String hexCode;

  private Color (String hexCode){
    this.hexCode = hexCode;
  }

  public String getHexCode() {
    return this.hexCode;
  }
  
}
