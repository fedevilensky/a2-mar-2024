package functions.hash;

public class IntHashFunc implements HashFunc<Integer> {

  @Override
  public int hash(Integer data) {
    return data;
  }

}
