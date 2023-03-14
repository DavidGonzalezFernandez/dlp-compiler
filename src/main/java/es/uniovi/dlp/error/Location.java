package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location> {
  @Override
  public int compareTo(Location location) {
    int tmp = (((Integer) this.line).compareTo(location.line));
    return tmp == 0 ? (((Integer) this.column).compareTo(location.column)) : tmp;
  }

  @Override
  public String toString() {
    return "line: " + line + ", column: " + column;
  }
}
