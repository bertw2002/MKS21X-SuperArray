public class SuperArray{
  private String[] data;
  private int size = 0;

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
    if (size == 0){
      return true;
    }
    return false;
  }

  public boolean add(String str){
    if (data.length >= size){
      resize();
    }
    data[size] = str;
    size ++;
    return true;
  }

  public String toString(){
    String str = "";
    for (int x = 0; x < size; x++){
      if (x != data.length - 1){
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
    if (data.length >= size){
      resize();
    }
    if (index < 0 || index >= size){
      return null;
    }else{
      return data[index];
    }
  }

  public String set(int index, String str){
    if (data.length >= size){
      resize();
    }
    if (index < 0 || index >= size){
      return null;
    }else{
      String x = data[index];
      data[index] = str;
      return x;
    }

  }

  private void resize(){
    String[] newarr = new String[data.length * 2];
    for( int x = 0; x < data.length; x++ )
			newarr[x] = data[x];
    data = newarr;
  }

  public boolean contains(String target){
    for (int x = 0; x < data.length; x++){
      if (target == data[x]){
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target){
    for (int x = 0; x < data.length; x++){
      if (target == data[x]){
        return x;
      }
    }
    return -1;
  }

  public void add(int index, String str){
    if (data.length + 1 >= size){
      resize();
    }
    if ((index < 0 || index > size){
      return null;
    }else{
      String[] newarr = new String[data.length];
      for (int x = 0; x < index; x++){
        newarr[x] = data[x];
      }
      newarr[index] = str;
      for (int x = index + 1; x < size; x++){
        newarr[x] = data[x];
      }
      data = newarr;
    }
  }

  public String remove(int index){
    if (data.length >= size){
      resize();
    }
    if (index < 0 || index >= size{
      return null;
    }else{
      String[] newarr = new String[data.length];
      for (int x = 0; x < index; x++){
        newarr[x] = data[x];
      }
      for (int x = index + 1; x < size; x++){
        newarr[x - 1] = data[x];
      }
      data = newarr;
    }
  }
}
