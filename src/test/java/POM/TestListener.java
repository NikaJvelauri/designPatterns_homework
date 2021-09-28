//package POM;
//
//import io.qameta.allure.Attachment;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class TestListener extends FinalResult implements ITestListener {
//
//    private  static String getTestMethodName(ITestResult iTestResult){
//        return iTestResult.getMethod().getConstructorOrMethod().getName();
//    }
//
//    @Attachment(value = "Page screenshot", type = "image/png")
//    public byte[] saveScreenshot(byte[] screenShot) {
//        return screenShot;
//    }
//
//    @Attachment(value = "{0}", type = "text/plain")
//    public static String saveTextLog(String message){
//        return message;
//    }
//
////    @Override
////    public void onTestFailure(ITestResult iTestResult){
////        Object testClass = iTestResult.getInstance();
////
////        if(driver instanceof WebDriver){
////            saveScreenshotPNG(driver);
////        }
////    }
//
//}
