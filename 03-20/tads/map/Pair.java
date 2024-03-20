package tads.map;

public class Pair<T1, T2> {
  public T1 fst;
  public T2 snd;

  @Override
  public boolean equals(Object o) {
    Pair<T1, T2> other = (Pair<T1, T2>) o;
    return this.fst.equals(other.fst);
  }

  Pair() {
  };

  Pair(T1 fst) {
    this.fst = fst;
  }

  Pair(T1 fst, T2 snd) {
    this.fst = fst;
    this.snd = snd;
  }
}
