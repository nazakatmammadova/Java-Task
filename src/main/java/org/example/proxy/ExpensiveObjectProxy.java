package org.example.proxy;

public class ExpensiveObjectProxy {
    private final ExpensiveObject expensiveObject= new ExpensiveObject();
    private static boolean isHeavyConfig;
    public void process() {
        if(!isHeavyConfig){
            expensiveObject.heavyConfig();
            isHeavyConfig=true;
        }
        expensiveObject.process();
    }
    /// // example note:
    //            if(isHeavyConfig){
//                expensiveObject.process();
//            }else{
//                expensiveObject.heavyConfig();
//                expensiveObject.process();
//                isHeavyConfig=true;
//            }

}
