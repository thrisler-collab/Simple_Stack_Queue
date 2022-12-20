package data;

public class Test {
      public static void main(String[] args){

          StackA t = new StackA();
          t.push("Test1");
          t.push("Test2");
          t.push("Test3");
          t.peek();
          String s = t.pop();
          System.out.println(s);
          t.peek();
          t.pop();
          t.pop();
          t.pop();
          t.pop();
          System.out.println(t.pop());
          t.peek();
          t.pop();
          t.push("Test4");
          t.push("Test5");
          t.push("Test6");
          t.push("Test7");
          t.push("Test8");
          t.push("Test9");
          t.push("Test10");
          t.push("Test12");
          t.push("Test13");
          t.push("Test14");
          t.push("Test15");
          t.push("Test16");
          t.peek();
          t.printAllElements();
          System.out.println("=================================================");
          System.out.println("TEST: QUEUE");
          QueueA q = new QueueA();
          q.put(null);
          q.put("test1");
          q.put("test2");
          q.put("test3");
          q.put("test4");
          q.put("test5");
          q.put("test6");
          q.put("test7");
          q.put("test8");
          q.put("test9");
          q.put("test10");
          q.put("test11");
          q.printAllElementsq();
      }
}
