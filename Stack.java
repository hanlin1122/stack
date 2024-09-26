public class Stack{
  private int[] data;
  private int size;

  public Stack(){
    data = new int[0];
    size = 0;
  }
  private void setSize(int size){
    this.size = size;
  }
  public int getSize(){
    return size;
  }
  private void setData(int[] data){
    this.data = data;
  }
  private int[] getData(){
    return data;
  }
  public void push(int a){
    if(size > 99){
      System.out.println("Error: Stack overflow.");
      return;
    }
    data[size] = a;
    size++;
  }
  public int pop(){
    if(size == 0){
      System.out.println("Error is empty.");
      return 0;
    }
    int ans = data[size-1];
    data[size-1] = 0;
    size--;
    return ans;
  }
  public String toString(){
    if(size == 0){
      return "[]";
    }
    else{
      String str = "[";
      for(int i = 0; i < size; i++){
        if(i == size-1){
          str += data[i];
        }
        else{str += data[i] + ", ";}
      }
      str += "]";
      return str;
    }
  }
  public Stack copy(){
    Stack a = new Stack();
    a.size = size;
    for(int i = 0; i < size; i++){
      a.data[i] = data[i];
    }
    return a;
  }
  public void append(Stack s){
    for(int i = 0; i < s.size; i++){
      data[size+1] = s.data[i];
    }
    size += s.size;
  }
  public void push2(int a){
    if(size >= data.length){
      int[] arr = new int[data.length+100];
      for(int i = 0; i < size; i++){
        arr[i] = data[i]
      }
      data = arr;
    }
    push(a);
  }
}
