class Main {
  public static void main(String[] args) {
    Stack a = new Stack();
    a.push(1);
    a.push(2);
    a.push(3);
    System.out.println(a.toString());
    Stack b = new Stack();
    b.push(4);
    b.push(5);
    System.out.println(b.toString());
    Stack c = append(a, b);
    System.out.println(c.toString());
    testCode1();
    testCode2();
    testCode3();
    testCode4();
    testCode5();
    testCode6();
  }
  public static void testCode1(){
   int task=0;
   try {
     task = 1;
     Stack s = new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     s.push(5);
     s.pop();
     s.pop();
     boolean b = s.getSize()==3 && s.pop()==3;
     System.out.println(task + ". testCode1():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
      System.out.println("\n\n" + task + ". Your code crashed.");
   }
 }
  public static void testCode2(){
  int task=0;
  try {
    task = 2;
    Stack s = new Stack();
    for(int i=0; i<102; i++)
      s.push(i);
    for(int i=0; i<13; i++)
      s.pop();
    boolean b = s.getSize()==87 && s.pop()==86;
    System.out.println(task + ". testCode2():\t\t\t\t\t\t" + b);
  } catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
  }
}
  public static void testCode3(){
   int task=0;
   try {
     task = 3;
     Stack s = new Stack();
     String ans = "";
     for(int i=0; i<15; i++){
       s.push(i);
       ans += i + ", ";
     }
     ans = "[" + ans.substring(0,ans.length()-2) + "]";
     boolean b = s.toString().equals(ans);
     System.out.println(task + ". testCode3():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
   }
 }
  public static void testCode4(){
   int task=0;
   try {
     task = 4;
     Stack s = new Stack();
     for(int i=0; i<15; i++){
       s.push(i);
     }
     Stack t = s.copy();
     boolean b = s.toString().equals(t.toString());
     t.push(1);
     b &= !s.toString().equals(t.toString());
     System.out.println(task + ". testCode" + task + "():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
   }
 }
  public static void testCode5(){
   int task=0;
   try {
     task = 5;
     String ans = "";
     Stack s = new Stack();
     Stack t = new Stack();
     for(int i=0; i<16; i++){
       s.push(i);
     }
     for(int i=17; i<100; i++){
       t.push(i);
     }
     for(int i=0; i<100; i++){
       if(i==0)
         ans += i + "";
       else if(i!=16)
         ans += ", " + i;
     }
     ans = "[" + ans + "]";
     s.append(t);
     boolean b = s.toString().equals(ans);
     System.out.println(task + ". testCode" + task + "():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
   }
 }
  public static void testCode6(){
   int task=0;
   try {
     task = 6;
     String ans = "";
     Stack s = new Stack();
     Stack t = new Stack();
     for(int i=0; i<16; i++){
       s.push(i);
     }
     for(int i=17; i<100; i++){
       t.push(i);
     }
     for(int i=0; i<100; i++){
       if(i==0)
         ans += i + "";
       else if(i!=16)
         ans += ", " + i;
     }
     ans = "[" + ans + "]";
     s = append(s,t);
     boolean b = s.toString().equals(ans);
     System.out.println(task + ". testCode" + task + "():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
   }
 }
  public static Stack append(Stack s, Stack t){
    Stack a = new Stack();
    Stack b = new Stack();
    int hold = 0;
    for(int i = t.getSize()-1; i > -1; i--){
      hold= t.pop();
      a.push(hold);
    }
    for(int i = s.getSize()-1; i > -1; i--){
      hold = s.pop();
      a.push(hold);
    }
    int length = a.getSize();
    for(int i = 0; i < length; i++){
      hold = a.pop();
      b.push(hold);
    }
    return b;
  }
  public static void testCode7(){
    int task=0;
    try {
      task = 7;
      Stack s = new Stack();
      for(int i=0; i<102; i++)
        s.push2(i);
      boolean b = s.getSize() == 102 && s.pop()== 101;
      System.out.println(task + ". testCode7():\t\t\t\t\t\t" + b);
    }   catch (Exception e1) {
     System.out.println("\n\n" + task + ". Your code crashed.");
    }
  }
  public static void task10(){
    Stack l = new Stack();
    for(int i = 0; i < 1000; i++){
      l.push2(i);
    }
    System.out.println(l.toString());
  }
}
