package strategy;

import java.io.File;

public class Main {
   public static void main(String[] args) {

       File inputTextFile = new File("C:\\Users\\kauan\\workspace-ppoo\\webSearch\\src\\strategy\\Hamlet.txt");

       // Build object graph
       WebSearchModel model = new WebSearchModel(inputTextFile);
       Snooper snoop = new Snooper(model);

       // Execute
       model.pretendToSearch();
   }
}