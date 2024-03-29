# CodeChefSolutions Repository

- Includes my CodeChef problems submissions mostly written in Java!


### Boilerplate code for Java [refer gist](https://gist.github.com/wasitshafi/bb0fa68572b09621f57f4632aad177c0)

---
```java
// URL: 
/**
 * @author WasitShafi
 * @since 01-MAR-2023
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("");
    scanner.close();
  }
}
```

### File namings, [refer here](https://learn.microsoft.com/en-gb/windows/win32/fileio/naming-a-file)

---

- Prefer file/directory name in all lowercase separated by hyphens.
- Incase of need to have more than 1 file for any problem, then append '-N' or '_N' eg: some-problem-2.java or 'some_problem_2.java'
- Avoid using integer 0(zero), sometimes its referred as ASCII NUL character (not NULL).
- Make sure file/directory name don't have leading/trailing spaces.
- File name should be under 31 chars.
- File name shouldn't contains any of the below chars.

  |                     |     |
  | ------------------- | :-: |
  | backtick            |  `  |
  | single quotes       |  '  |
  | double quotes       |  "  |
  | colon               |  :  |
  | asterisk            | \*  |
  | plus sign           |  +  |
  | percent             |  %  |
  | forward slash       |  /  |
  | back slash          | \   |
  | pound               | \#  |
  | dollar sign         |  $  |
  | at sign             |  @  |
  | ampersand           |  &  |
  | pipe                | \|  |
  | exclamation point   |  !  |
  | question mark       |  ?  |
  | equal sign          |  =  |
  | left curly bracket  |  {  |
  | right curly bracket |  }  |
  | left angle bracket  |  <  |
  | right angle bracket |  >  |
  | blank spaces        |     |
