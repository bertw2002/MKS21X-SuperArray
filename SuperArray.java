public class SuperArrar{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public void clear(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if (size = 0){
      return true;
    }
    return false;
  }
  public boolean add(String str){
    if (size != 10){
      size ++;
    }
    data[size - 1] = str;
  }
  public String toString(){
    String str = "[]"
    for (int x = 0; x < size; x++){
      str += data[x];
    }
    str += "]";
    return str;
  }
  public String toStringDebug(){
    String str = "[]"
    for (int x = 0; x < data.length; x++){
      str += data[x];
    }
    str += "]";
    return str;
  }
  public String get(int index){
    if (index < 0 || index >= size){
      return null;
    }else{
      return data.index;
    }
  }
  public String set(int index, String str){
    if (index < 0 || index >= size){
      return null;
    }else{
      data.
    }
  }
}
