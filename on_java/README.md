This is just a place to mark down the things I don't want to forget.

Especially when switching around different languages...

**Array declearation:**
```java
int[] name = new int[]{1,2,3}
int[] name = new int[3]
```
*java does not support inline init, either use a loop or a libray call*

**Stack:**

Push, Pop has O(1) and Search O(n)
remember to import `import java.util.*`
```java
public static void Stack(){
  Stack st = new Stack;
  st.push('a');
  st.pop();
  st.peek();
  st.search('a'); //return the index of stack
  st.isEmpty();
}
```

**Queue:**

WIth use of library, avoid using add and remove as it throws exceptions.
Use `offer` and `poll` O(1) to complete.

```java
public static void Queue(){
  Queue qu = new LinkedList();
  qu.offer('a');
  qu.offer('b');
  qu.poll();
  qu.isEmpty();
}
```

