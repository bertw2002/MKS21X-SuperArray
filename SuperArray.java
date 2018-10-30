
public class SuperArray{
  private String[] data;
  private int size = 0;

  public SuperArray(){
    data = new String[10];
  }
  public SuperArray(int startingCapacity){
    data = new String[startingCapacity];
  }

  public void clear(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }

  public boolean add(String element){
    if (data.length <= size){
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }

  public String toString(){
    String str = "";
    for (int x = 0; x < size; x++){
      if (x != size - 1){
        str = str + data[x] + ",";
      }else{
        str = str + data[x];
      }
    }
    return "[" + str + "]";
  }

  public String toStringDebug(){
    String str = "";
    for (int x = 0; x < data.length; x++){
      if (x != data.length - 1){
        if (x > size - 1){
          str = str + "null,";
        }else{
          str = str + data[x] + ",";
        }
      }else{
        if (x > size - 1){
          str = str + "null";
        }else{
          str = str + data[x];
        }
      }
    }
    return "[" + str + "]";
  }

  public String get(int index){
    if (data.length <= size){
      resize();
    }
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("out of bounds");
    }else{
      return data[index];
    }
  }

  public String set(int index, String element){
    if (data.length <= size){
      resize();
    }
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("out of bounds");
    }else{
      String x = data[index];
      data[index] = element;
      return x;
    }

  }

  private void resize(){
    String[] newarr = new String[data.length * 2 + 1];
    for( int x = 0; x < data.length; x++ )
			newarr[x] = data[x];
    data = newarr;
  }

  public boolean contains(String target){
    for (int x = 0; x < data.length; x++){
      if (target.equals(data[x])){
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target){
    for (int x = 0; x < data.length; x++){
      if (target.equals(data[x])){
        return x;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for (int x = size() - 1; x > - 1; x--) {
      if (data[x].equals(element)) {
        return x;
      }
    }
    return -1;
  }

  public void add(int index, String element){
    if (data.length <= size + 1){
      resize();
    }
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("out of bounds");
    }else{
      size ++;
      String[] newarr = new String[data.length];
      for (int x = 0; x < index; x++){
        newarr[x] = data[x];
      }
      for (int x = index + 1; x < size; x++){
        newarr[x] = data[x - 1];
      }
      newarr[index] = element;
      data = newarr;
    }
  }

  public String remove(int index){
    if (data.length <= size){
      resize();
    }
    String var = data[index];
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("out of bounds");
    }else{
      String[] newarr = new String[data.length];
      for (int x = 0; x < index; x++){
        newarr[x] = data[x];
      }
      for (int x = index + 1; x < size; x++){
        newarr[x - 1] = data[x];
      }
      size --;
      data = newarr;
      return var;
    }
  }

  public boolean remove(String element){
    if (data.length <= size){
      resize();
    }
    int place = -1;
    for (int x = data.length - 1; x > -1; x --){
      if (element.equals(data[x])){
        place = x;
      }
    }
  if (place != -1){
      String[] newarr = new String[data.length];
      for (int x = 0; x < place; x++){
        newarr[x] = data[x];
      }
      for (int x = place + 1; x < size; x++){
        newarr[x - 1] = data[x];
      }
      size --;
      data = newarr;
      return true;
    }
    return false;
  }
}
