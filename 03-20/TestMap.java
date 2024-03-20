
import java.util.Iterator;

import functions.hash.IntHashFunc;
import tads.map.Map;
import tads.map.OpenHashMap;
import tads.map.Pair;

public class TestMap {
  public static void main(String[] args) {
    Map<Integer, String> map = new OpenHashMap<>(new IntHashFunc(), 10);

    map.set(42, "hello");
    map.set(123, "hola");
    map.set(2, "AHHHHH");
    map.set(56, "no se");
    map.set(99, "nfsanjkfsanjkfs");
    map.set(123, "no");

    System.out.println("Recorrido con while");
    Iterator<Pair<Integer, String>> it = map.iterator();
    while (it.hasNext()) {
      Pair<Integer, String> p = it.next();
      System.out.println("Clave: " + p.fst + " - Valor: " + p.snd);
    }

    System.out.println("Recorrido con foreach");
    for (Pair<Integer, String> p : map) {
      System.out.println("Clave: " + p.fst + " - Valor: " + p.snd);
    }

  }
}
